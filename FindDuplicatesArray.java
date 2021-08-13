package week1.day2;

import java.util.Arrays;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numarr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = numarr.length;
		int count;

		for (int i = 0; i < length - 1; i++) {
			count = 0;
			for (int j = i + 1; j < length; j++) {
				if (numarr[i] == numarr[j]) {
					count = count + 1;
					System.out.println(numarr[j]);
				}
			}
			if (count > 0) {
				System.out.println(numarr[i]);
			}
		}

	}
}