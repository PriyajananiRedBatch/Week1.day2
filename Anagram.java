package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "listen";
		String text2 = "silent";
		
		int l1 = text1.length();
		int l2 = text2.length();
		
		if(l1==l2) {
			
			char[] charArray1 = text1.toCharArray();
			Arrays.sort(charArray1);
			for(int i=0; i<charArray1.length; i++) {
				System.out.println("The sorted charArray1[" +i + "]" + charArray1[i]);
			}
			
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray2);
			for(int i=0; i<charArray2.length; i++) {
				System.out.println("The sorted charArray2[" +i + "]" + charArray2[i]);
			}
			
			if(Arrays.equals(charArray1, charArray2)) {
				System.out.println("Anagram");
			
			//for (int i =0; i<charArray.length; i++) {
				//System.out.println("charArray[" +i + "]" + charArray[i]);
			}
			else
				System.out.println("Not an Anagram");
		}

	}

}
