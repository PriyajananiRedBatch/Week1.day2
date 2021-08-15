package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specialChar = 0;
		boolean b1, b2, b3;
		char[] charArray = text1.toCharArray();

		int length = charArray.length;

		for (int i = 0; i < length; i++) {
			System.out.println("charArray[" + i + "]" + charArray[i]);

			b1 = Character.isLetter(charArray[i]);
			b2 = Character.isDigit(charArray[i]);
			b3 = Character.isSpaceChar(charArray[i]);

			if (b1 == true) {
				System.out.println("charArray[" + i + "]" + "is a letter");
				letter = letter + 1;
			}
			else if (b2 == true) {
				System.out.println("charArray[" + i + "]" + "is a number ");
				num = num + 1;
			}
			else if (b3 == true) {
				System.out.println("charArray[" + i + "]" + "is a space");
				space = space + 1;
			} 
			else
				System.out.println("charArray[" + i + "]" + "is a special character");
			    specialChar = specialChar + 1;
		}

	}

}
