package in.co.rays.oop.encaptulation;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	
	public void setnumber(String number) {
		this.number = number;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setAccounttype(String accountType) {
		this.accountType= accountType;
	}
	
	public double getbalance() {
		return this.balance;
		
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit(double Deposit) {
		this.balance = this.balance + Deposit;
		System.out.println("Total balance after deposit:" + this.balance);
	}
	
	public void withdrawal(double withdrawal) {
		if(this.balance < withdrawal ) {
			System.out.println("Insufficent fund withdrawal");
		}else {
			this.balance = this.balance - withdrawal;
			System.out.println("Total balance after withdrawal:" + this.balance);
		}
	}
	
	public void fundTransfer(Account target, double fundTransfer) {
		if (this.balance < fundTransfer) {
			
			System.out.println("Insufficent balance to Transfer:" + fundTransfer);
		}else {
			this.balance = this.balance- fundTransfer;
			this.balance = target.balance + fundTransfer;
			System.out.println("After Fund Transfer Remaining Amount is:" + this.balance);
		}
	}
	
	public void payBill(double payBill) {
		if(this.balance < payBill) {
			System.out.println("Total balance after Pay Bill:" + this.balance);
		}
	}

}
