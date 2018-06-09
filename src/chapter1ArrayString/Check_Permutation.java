package chapter1ArrayString;

import java.util.Arrays;

public class Check_Permutation {

	public static boolean permutaion(String str1,String str2)
	{
		return sort(str1).equals(sort(str2));
	}
	private static String sort(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
	public static void main(String[] args) {
		System.out.println(permutaion("hello", "olleh"));
	}

}
