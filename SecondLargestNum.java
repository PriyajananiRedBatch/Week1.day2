package week1.day2;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numarr = { 3, 2, 11, 4, 8, 6 };
		Arrays.sort(numarr);
		int length = numarr.length;
		System.out.println("The Sorted Array is: ");

		for (int i = 0; i < length; i++) {
			System.out.println("numarr[" + i + "]=" + numarr[i]);
		}
		System.out.println("Second largest element: " + numarr[length - 2]);

	}
}