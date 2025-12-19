package in.co.rays.oop.abstraction;

public class TestBusinessman {

	public static void main(String[] args) {

		Richman r = new Businessman();

		r.earnmoney();
		r.donation();
		r.party();

		SocialWorker s = new Businessman();

		s.helpToOthers();

	}

}
