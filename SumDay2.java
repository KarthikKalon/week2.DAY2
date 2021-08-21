package week2.day1;

public class SumDay2 {
	 
   
public int sumofdigits (int sumD) { 
	
	sumD=0;
	String str2="Tes12Le79af65";
	for(int i=0;i<str2.length();i++) {
		char arr =str2.charAt(i);
		int integers=Character.getNumericValue(arr);
		System.out.println(integers);
		sumD=sumD+integers;

	}
	System.out.println("Sum Of All Digits Method2:" +sumD);
	return sumD;
	
}


	public static void main(String[] args) {
		SumDay2 object=new SumDay2();
		object.sumofdigits(0);
		 String str = "Tes12Le79af65";
		 int sum=0;
		String str1=str.replaceAll("\\D", "");	
		for(int i=0;i<str1.length();i++) {
			char arr =str1.charAt(i);
	       int intr= Character.getNumericValue(arr);
			sum=sum+intr;
		}
		System.out.println("The Sum of the digits Method1 :" +sum);
	} 
	
}