package application.Digital_Wallet;


// Checked Exception
class WalletLimitExceededException extends Exception{
		
	public WalletLimitExceededException(String msg) {
		super(msg);
	}
}

// Unchecked Exception
class InvalidPaymentException extends RuntimeException{
	
	public InvalidPaymentException(String msg) {
		super(msg);
	}
}


interface WalletService {
	
	abstract void addMoney(double amount) throws WalletLimitExceededException;
	abstract void payMoney(double amount);
}

abstract class Wallet implements WalletService{
	
	private int walletID;
	private String userName;
	private String walletType;
	private double balance;
	
	public Wallet(int walletID, String userName) {
		this.walletID = walletID;
		this.userName = userName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	protected void setBalance(double balance) {
		if (balance < 0) {
			throw new InvalidPaymentException("Balance can not be negative");
		}
		this.balance = balance;
	}
	
	public String toString() {
		return "[Wallet ID: "+ walletID+ ", UserName: "+ userName + ", WalletType: "+  walletType+", Balance:  "+ balance+ "]";
	}
	

}

class Basic extends Wallet{
	
	protected String walletType;
	
	
	public Basic(int walletID, String userName) {
		super(walletID, userName);
		this.walletType = "BASIC";
	}
	
	// ADD MONEY
	@Override
	public void addMoney(double amount) throws WalletLimitExceededException{
		if (amount < 0) {
			throw new InvalidPaymentException("Amount should be greater than zero.");
		}
		
		
		double totalAmount = super.getBalance();
		
		totalAmount += amount;
		
		if (totalAmount > 10000) {
			throw new WalletLimitExceededException("Basic Payment limit exceeded.");
		}
		
		super.setBalance(totalAmount);
	}
	
	// PAY MONEY
	@Override
	public void payMoney(double amount) {
		double balance = super.getBalance();
		
		if (amount <=0) {
			throw new InvalidPaymentException("Amount must be positive");
		}
		
		if (amount > balance) {
			throw new InvalidPaymentException("Low balance");
		}
		
		super.setBalance(balance-amount);
	}
}

class Premium extends Wallet{
	
	protected String walletType;
	
	public Premium(int walletID, String userName) {
		super(walletID, userName);
		this.walletType = "PREMIUM";
	}
	
	// ADD MONEY
	@Override
	public void addMoney(double amount) throws WalletLimitExceededException{
		double totalAmount = super.getBalance();
		
		totalAmount += amount;
		
		if (totalAmount > 50000) {
			throw new WalletLimitExceededException("Premium Payment limit exceeded.");
		}
		
		super.setBalance(totalAmount);
		
	}
	
	// PAY MONEY
	@Override
	public void payMoney(double amount) {
		double balance = super.getBalance();
		
		if (amount <=0) {
			throw new InvalidPaymentException("Amount must be positive");
		}
		
		if (amount > balance) {
			throw new InvalidPaymentException("Low balance");
		}
		
		double cashback = amount * 0.05;
		
		super.setBalance(balance-amount+cashback);
	}
}
