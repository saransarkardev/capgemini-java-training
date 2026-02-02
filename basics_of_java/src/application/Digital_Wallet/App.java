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
	
	/**
	 * Adds money to the wallet.
	 * @throws WalletLimitExceededException if wallet limit is exceeded
	 * @throws InvalidPaymentException if amount is invalid
	 */
	abstract void addMoney(double amount) throws WalletLimitExceededException;
	
	/**
	 * Pays money from the wallet.
	 * @throws InvalidPaymentException if amount is invalid or balance is insufficient
	 */
	abstract void payMoney(double amount);
}

abstract class Wallet implements WalletService{
	
	private int walletID;
	private String userName;
	protected String walletType;
	private double balance;
	
	public Wallet(int walletID, String userName) {
		this.walletID = walletID;
		this.userName = userName;
		this.balance = 0.0;
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
	
	 protected void validateAndDeduct(double amount) {
	        if (amount <= 0) {
	            throw new InvalidPaymentException("Amount must be positive");
	        }

	        if (amount > balance) {
	            throw new InvalidPaymentException("Low balance");
	        }

	        setBalance(balance - amount);
	    }
	
	public String toString() {
		return "[Wallet ID: "+ walletID+ ", UserName: "+ userName + ", WalletType: "+  walletType+", Balance:  "+ balance+ "]";
	}
	

}

class Basic extends Wallet{
	
	
	public Basic(int walletID, String userName) {
		super(walletID, userName);
		this.walletType = "BASIC";
	}
	
	// ADD MONEY
	@Override
	public void addMoney(double amount) throws WalletLimitExceededException{
		if (amount <= 0) {
			throw new InvalidPaymentException("Amount should be greater than zero.");
		}
		
		
		double totalAmount = getBalance() + amount;

		
		if (totalAmount > 10000) {
			throw new WalletLimitExceededException("Basic Payment limit exceeded.");
		}
		
		super.setBalance(totalAmount);
	}
	
	// PAY MONEY
	@Override
	public void payMoney(double amount) {
		validateAndDeduct(amount);
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
		validateAndDeduct(amount);

		double cashback = amount * 0.05;
		
		setBalance(getBalance()+cashback);
	}
}
