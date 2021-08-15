package week1.day2;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1 = "welcome to chennai";
int count = 0;

char[] charArray = text1.toCharArray();
int length = charArray.length;

for(int i=0; i<length; i++) {
	if(charArray[i]=='e') {
		count = count+1;
		
	}
}
System.out.println("The number of occurences of letter e in the given string is: "+ count);
	}

}
