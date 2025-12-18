package in.co.rays.oop.encaptulation;

public class TestAccount {
	
	public static void main(String[] args) {
		Account Ram = new Account();
		
		Ram.setnumber("97864224600005");
		Ram.setAccounttype("saving");
		Ram.setbalance(3240.65);
		
		System.out.println("Ram's Account Number:" + Ram.getNumber());
		System.out.println("Ram's Account Type:" + Ram.getAccountType());
		System.out.println("Ram's Account Balance:" + Ram.getbalance());
		Ram.Deposit(400);
		Ram.withdrawal(250);
		//Ram.fundTransfer(750);
		Ram.payBill(350);
		
		System.out.println("------------------------");
		
		Account Shayam = new Account();
		
		Shayam.setnumber("45637895436543");
		Shayam.setAccounttype("Current");
		Shayam.setbalance(40530.66);
		
		System.out.println("Shayam's Account Number:" + Shayam.getNumber());
		System.out.println("Shayam's Account Type:" + Shayam.getAccountType());
		System.out.println("Shayam's Account Balance:" + Shayam.getbalance());
		Shayam.Deposit(600);
		Shayam.withdrawal(700);
		Shayam.fundTransfer(Ram, 200);
		Shayam.payBill(299);
		Ram.fundTransfer(Shayam, 100);
	}

}
