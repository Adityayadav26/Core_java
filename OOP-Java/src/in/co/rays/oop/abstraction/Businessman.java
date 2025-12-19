package in.co.rays.oop.abstraction;

public class Businessman extends Person implements Richman, SocialWorker {

	@Override
	public void earnmoney() {
		System.out.println("earnmoney");

	}

	@Override
	public void donation() {
		System.out.println("donation");

	}

	@Override
	public void party() {
		System.out.println("party");

	}

	@Override
	public void helpToOthers() {
		System.out.println("help to other");

	}

}
