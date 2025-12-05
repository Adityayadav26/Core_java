package in.co.rasy.basic;

public class LargestNoInArray {
	public static void main(String[] args) {

		int []a = {21 ,31 ,41 ,51 ,61 ,71 ,81 ,91 };
		
		 int largestNo  =0;
		 
		 for (int i = 0; i < a.length; i++) {
			 if (a[i] > largestNo) {
				 largestNo = a[i];
				 
			 }
			 
		 }
			 System.out.println("largestNo is :" + largestNo);
		 
}
}