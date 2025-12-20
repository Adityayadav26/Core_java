package in.co.rays.oop.constructor;

public class TestAccount {
	public static void main(String[] args) {

		Account a1 = new Account("98746382", "Current", 25400);

		System.out.println("Account Number: " + a1.getAccNo());
		System.out.println("Account Type: " + a1.getAccType());
		System.out.println("Account Balance: " + a1.getAccBalance());
		a1.Deposit(550);
		a1.withdrawal(430);
		//a1.fundTransfer(850);
		a1.payBill(349);

		System.out.println("------------------------");

		Account a2 = new Account("45639", "Saving", 46564);

		System.out.println("Account Number: " + a2.getAccNo());
		System.out.println("Account Type: " + a2.getAccType());
		System.out.println("Account Balance: " + a2.getAccBalance());
		a2.Deposit(700);
		a2.withdrawal(330);
		a2.fundTransfer(a1, 100);
		a2.payBill(91);
	}

}
