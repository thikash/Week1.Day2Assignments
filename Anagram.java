package assignment2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	String str1="stops";
	String str2="pot";
	if(str1.length()==str2.length()) {
		char[] arrStr1=str1.toCharArray();
		char[] arrStr2=str2.toCharArray();
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
		for (int i = 0; i < arrStr2.length; i++) {
			if(arrStr1[i]!=arrStr2[i]) {
				System.out.println("Given Strings are not an anagram");
				break;
			}
			
		}
		System.out.println("Given Strings are an anagram");
	}
	else {
		System.out.println("Given Strings are not an anagram");
	}
	}
}
