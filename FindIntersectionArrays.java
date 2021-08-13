package week1.day2;

import java.util.Arrays;

public class FindIntersectionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrnum1 = { 3, 2, 11, 4, 6, 7 };
		int[] arrnum2 = { 1, 2, 8, 4, 7, 9 };

		for (int i = 0; i < arrnum1.length; i++) {
			for (int j = 0; j < arrnum2.length; j++) {
				if (arrnum1[i] == arrnum2[j]) {
					System.out.println("The intersection element of the array is: " + arrnum1[i]);
					break;
				}
			}

		}

	}
}
