package application.Electricity_Billing_System;

enum CustomerType {
	DOMESTIC, COMMERCIAL
}

class LoadExceededException extends Exception {
	public LoadExceededException(String msg) {
		super(msg);
	}
}

class InvalidMeterReadingException extends RuntimeException {
	public InvalidMeterReadingException(String msg) {
		super(msg);
	}
}

interface BillingService {
	double calculateBill();
}

abstract class Consumer implements BillingService {

	private static int counter;
	private int consumerID;
	private String consumerName;
	private CustomerType customerType;
	protected double units;

	private double billAmount;

	public Consumer(String consumerNmae, CustomerType customerType, double units) throws LoadExceededException {
		this.consumerID = ++counter;
		this.consumerName = consumerNmae;
		this.customerType = customerType;
		setUnits(units);
		calculateAndSetBill();
	}

	protected abstract void setUnits(double units) throws LoadExceededException;

	protected void calculateAndSetBill() {
		this.billAmount = calculateBill();
	}

	// getter
	protected double getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "[Cosumer ID: " + consumerID + ", Consumer Name: " + consumerName + ", Customer Type: " + customerType
				+ ", Units: " + units + ", Total Bill: " + calculateBill() + "]";

	}
}

class DomesticBill extends Consumer {

	public DomesticBill(String consumerName, CustomerType customerType, double units) throws LoadExceededException {
		super(consumerName, customerType, units);
	}

	@Override
	protected void setUnits(double units) throws LoadExceededException {
		if (units <= 0) {
			throw new InvalidMeterReadingException("Units must be positive.");
		}
		if (units > 500) {
			throw new LoadExceededException("Maximum units limit is 500.");
		}
		this.units = units;
	}

	@Override
	public double calculateBill() {
		double units = getUnits();
		double price = 0;
		if (units <= 100) {
			price = units * 3;
		} else {
			price = 100 * 3 + (units - 100) * 6;
		}
		return price;
	}
}

class CommercialBill extends Consumer {

	public CommercialBill(String consumerName, CustomerType customerType, double units) throws LoadExceededException {
		super(consumerName, customerType, units);
	}

	@Override
	protected void setUnits(double units) throws LoadExceededException {
		if (units <= 0) {
			throw new InvalidMeterReadingException("Units must be positive.");
		}
		if (units > 1000) {
			throw new LoadExceededException("Maximum units limit is 1000.");
		}
		this.units = units;
	}

	@Override
	public double calculateBill() {
		double units = getUnits();

		return units * 8;
	}
}

class App {
	public static void main(String[] args) {
		try {
			Consumer c1 = new DomesticBill("Saran Sarkar", CustomerType.DOMESTIC, 5);
			Consumer c2 = new DomesticBill("Anishka Sarkar", CustomerType.DOMESTIC, 106);
			Consumer c3 = new CommercialBill("Rahul Sarkar", CustomerType.COMMERCIAL, 20);

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
		} catch (LoadExceededException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}