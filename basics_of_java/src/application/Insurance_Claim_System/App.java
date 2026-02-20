package application.Insurance_Claim_System;

//------------ ENUM ------------

enum PolicyType {
	BASIC, PREMIUM
}

//------------ EXCEPTIONS ------------

//Checked Exception
class ClaimLimitExceededException extends Exception {
	public ClaimLimitExceededException(String msg) {
		super(msg);
	}
}

//Unchecked Exception
class InvalidClaimException extends RuntimeException {
	public InvalidClaimException(String msg) {
		super(msg);
	}
}

//------------ ABSTRACTION ------------

interface ClaimService {
	double calculatePayout();
}

//------------ ABSTRACT BASE CLASS ------------

abstract class ClaimModel implements ClaimService {

	private int claimId;
	private String policyHolderName;
	private double claimAmount;

	protected ClaimModel(int claimId, String policyHolderName, double claimAmount) throws ClaimLimitExceededException {

		if (claimAmount <= 0) {
			throw new InvalidClaimException("Claim amount must be greater than zero.");
		}

		if (claimAmount > getMaxClaimLimit()) {
			throw new ClaimLimitExceededException("Claim exceeds max limit of ₹" + getMaxClaimLimit());
		}

		this.claimId = claimId;
		this.policyHolderName = policyHolderName;
		this.claimAmount = claimAmount;
	}

	protected double getClaimAmount() {
		return claimAmount;
	}

	// Each policy defines its own rules
	protected abstract double getMaxClaimLimit();

	protected abstract double getPayoutPercentage();

	protected abstract PolicyType getPolicyType();

	@Override
	public double calculatePayout() {
		return claimAmount * getPayoutPercentage();
	}

	@Override
	public String toString() {
		return "[ Claim ID: " + claimId + ", Holder Name: " + policyHolderName + ", Policy Type: " + getPolicyType()
				+ ", Claimed Amount: ₹" + claimAmount + ", Payout Amount: ₹" + calculatePayout() + " ]";
	}
}

//------------ CONCRETE POLICIES ------------

class Basic extends ClaimModel {

	public Basic(int claimId, String policyHolderName, double claimAmount) throws ClaimLimitExceededException {
		super(claimId, policyHolderName, claimAmount);
	}

	@Override
	protected double getMaxClaimLimit() {
		return 100000;
	}

	@Override
	protected double getPayoutPercentage() {
		return 0.70;
	}

	@Override
	protected PolicyType getPolicyType() {
		return PolicyType.BASIC;
	}
}

class Premium extends ClaimModel {

	public Premium(int claimId, String policyHolderName, double claimAmount) throws ClaimLimitExceededException {
		super(claimId, policyHolderName, claimAmount);
	}

	@Override
	protected double getMaxClaimLimit() {
		return 500000;
	}

	@Override
	protected double getPayoutPercentage() {
		return 0.90;
	}

	@Override
	protected PolicyType getPolicyType() {
		return PolicyType.PREMIUM;
	}
}

//------------ APPLICATION ------------

public class App {

	public static void main(String[] args) {

		try {

			ClaimModel c1 = new Basic(101, "Saran Sarkar", 50000);
			ClaimModel c2 = new Premium(102, "Anishka Das", 200000);
			ClaimModel c3 = new Premium(103, "Anoushka Bhodhra", 300000);
			ClaimModel c4 = new Premium(104, "Rajarshi Karmakar", 70000);
			ClaimModel c5 = new Basic(105, "Anoushka Bhodhra", 31000);

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			System.out.println(c5);

		} catch (ClaimLimitExceededException e) {
			System.out.println("Claim Limit Error: " + e.getMessage());
		} catch (Exception e) {
			throw new InvalidClaimException("Unexpected system error.");
		}
	}
}