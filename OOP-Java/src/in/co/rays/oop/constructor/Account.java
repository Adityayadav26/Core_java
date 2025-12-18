package in.co.rays.oop.constructor;

public class Account {
	protected String accNo;
	protected String accType;
	protected double accBalance;

	public Account(String accNo, String accType, double accBalance) {

		this.accNo = accNo;
		this.accType = accType;
		this.accBalance = accBalance;

	}

	public void Deposit(double Deposit) {
		this.accBalance = this.accBalance + Deposit;
		System.out.println("Total balance after deposit: " + this.accBalance);
	}

	public void withdrawal(double withdrawal) {
		if (this.accBalance < withdrawal) {
			System.out.println("Insufficent fund withdrawal");
		} else {
			this.accBalance = this.accBalance - withdrawal;
			System.out.println("Total balance after withdrawal: " + this.accBalance);
		}
	}
	public void fundTransfer(Account target, double fundTransfer) {
		if (this.accBalance < fundTransfer) {

			System.out.println("Insufficent Balance To Transfer: " + fundTransfer);
		} else {
			this.accBalance = this.accBalance - fundTransfer;
			this.accBalance = target.accBalance + fundTransfer;
			System.out.println("After Fund Tranfer Remainig Amount is: " + this.accBalance);
		}

	}

	public void payBill(double payBill) {
		if (this.accBalance < payBill) {
			System.out.println("Insufficent fund to pay bill");
		} else {
			this.accBalance = this.accBalance - payBill;
			System.out.println("Total balance after Pay Bill: " + this.accBalance);
		}

	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public double getAccBalance() {
		return accBalance;
	}

}
