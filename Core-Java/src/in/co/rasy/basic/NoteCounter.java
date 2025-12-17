package in.co.rasy.basic;

public class NoteCounter {
	public static void main(String[] args) {
	
		int money =6800;
		
		int [] notes = {500,200,100};
		
		int count =0;
		
		for (int note : notes) {
			count = money/note;
			System.out.println("total note of" + note + "is =" + count);
			money = money %note;
		}
	}

}
 