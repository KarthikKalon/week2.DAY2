package week2.day1;

public class Removeduplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		System.out.println(text.length());
		for(int i=0;i<text.length();i++) {
			String[] textsplit=text.split(" ");
			for(int j=i+1;j<((textsplit.length)-1);j++) {
			if (textsplit[i].equalsIgnoreCase(textsplit[j])) {
				count++;
				if (count>1) {
					textsplit[i]=""; 
				break;
				}
			}
	
			}
			
		if(textsplit[i]!="") 
			System.out.println(textsplit[i]);
		
		
		}
	}                    
}
