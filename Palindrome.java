package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "Level";
		System.out.println("The given string is: " + text1);
		String rev = "";
		
		int length = text1.length();
				
		for(int i=length-1;i>=0;i-- ) {
			rev = rev + text1.charAt(i);
			}
		System.out.println("The reversed string is: " + rev);
		if(text1.equalsIgnoreCase(rev)) {
			System.out.println("The given string is a Palindrome");
		}
		else
			System.out.println("The given string is not a Palindrome");
	}

}
