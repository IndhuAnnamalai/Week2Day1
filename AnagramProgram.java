package week2.day1;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "stops";
		String str1 = "potss";
		char[] charArray;
		char[] charArray1;
		if (str.length() == str1.length()) {

			charArray = str.toCharArray();
			System.out.println(charArray);
			charArray1 = str1.toCharArray();
			System.out.println(charArray1);
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			if (Arrays.equals(charArray, charArray1)) {
				System.out.println("The strings are anagram");
				
			}

		 else {
			System.out.println("The strings are not anagram");
		}
	}
	}

}
