package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "changeme";
char[] charArray = test.toCharArray();
for (int i = 0; i < charArray.length; i++) {
	System.out.println("charArray[" +i + "]: " + charArray[i]);
	char c = charArray[i];
	if(i%2!=0) {
		c = Character.toUpperCase(c);
		
	}
	System.out.println(c);
}

	}

}
