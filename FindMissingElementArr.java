package week1.day2;

import java.util.Arrays;

public class FindMissingElementArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrnum = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

		int arrlength = arrnum.length;
		System.out.println("The length of the array is: " + arrlength);

		Arrays.sort(arrnum);
		for (int i = 0; i < arrlength; i++) {
			if (arrnum[i] != i + 1) {
				System.out.println(i + 1);
				break;
			}
		}

	}
}
