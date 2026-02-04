package application.Online_Grocery_Order_System;

//=============================
//Custom Exceptions
//=============================

//Checked Exception
class ItemLimitExceededException extends Exception {
	public ItemLimitExceededException(String msg) {
		super(msg);
	}
}

//Unchecked Exception
class InvalidOrderException extends RuntimeException {
	public InvalidOrderException(String msg) {
		super(msg);
	}
}

//=============================
//Abstraction
//=============================

interface OrderService {
	double calculateBill();
}

//=============================
//Abstract Base Class
//=============================

abstract class Order implements OrderService {

	private int orderID;
	private String customerName;
	protected int totalItems;

	public Order(int orderID, String customerName, int totalItems) throws ItemLimitExceededException {

		if (customerName == null || customerName.isEmpty()) {
			throw new InvalidOrderException("Customer name is not valid.");
		}
		this.orderID = orderID;
		this.customerName = customerName;
		setTotalItems(totalItems);
	}

	protected abstract void setTotalItems(int totalItems) throws ItemLimitExceededException;

	protected abstract String getCustomerType();

	@Override
	public String toString() {
		return "[Order ID: " + orderID + ", Customer Name: " + customerName + ", Customer Type: " + getCustomerType()
				+ ", Total Items: " + totalItems + "]";
	}

}

//=======================
//Regular Order
//=======================

class RegularOrder extends Order {

	private static final int PRICE = 50;
	private static final int MAX_ORDER = 20;

	public RegularOrder(int orderID, String customerName, int totalItems) throws ItemLimitExceededException {
		super(orderID, customerName, totalItems);
	}

	@Override
	protected void setTotalItems(int totalItems) throws ItemLimitExceededException {
		if (totalItems <= 0) {
			throw new ItemLimitExceededException("Items ordered should be greater than zero.");
		}
		if (totalItems > MAX_ORDER) {
			throw new ItemLimitExceededException("Maximum items limit reached");
		}
		this.totalItems = totalItems;
	}

	@Override
	protected String getCustomerType() {
		return "REGULAR";
	}

	@Override
	public double calculateBill() {
		return totalItems * PRICE;
	}

}

//=======================
//Member Order
//=======================

class MemberOrder extends Order {

	private static final int PRICE = 50;
	private static final int MAX_ORDER = 20;

	public MemberOrder(int orderID, String customerName, int totalItems) throws ItemLimitExceededException {
		super(orderID, customerName, totalItems);
	}

	@Override
	protected void setTotalItems(int totalItems) throws ItemLimitExceededException {
		if (totalItems <= 0) {
			throw new ItemLimitExceededException("Items ordered should be greater than zero.");
		}
		if (totalItems > MAX_ORDER) {
			throw new ItemLimitExceededException("Maximum items limit reached");
		}
		this.totalItems = totalItems;
	}

	@Override
	protected String getCustomerType() {
		return "MEMBER";
	}

	@Override
	public double calculateBill() {
		double price = totalItems * PRICE;
		double discount = price * 0.15;
		return price - discount;
	}
}

public class App {
	public static void main(String[] args) {
		try {
			Order regular = new RegularOrder(1, "Saran Sarkar", 10);
			Order memeber = new MemberOrder(2, "Anishka Das", 10);

			System.out.println(regular);
			System.out.println("Total Bill: " + regular.calculateBill());

			System.out.println(memeber);
			System.out.println("Total Bill: " + memeber.calculateBill());
		} catch (ItemLimitExceededException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
