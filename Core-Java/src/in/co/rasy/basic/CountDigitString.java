package in.co.rasy.basic;

public class CountDigitString {
	public static void main(String[] args) {
		String str = "liugcdwyi47tfg743gfb72978g";
		int count = 0;
		for(int i=0; i< str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
				System.out.println(i + "=" + count);
			}
		}
		
		System.out.println("total digit :" + count);
	}

}
