package assignment2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	String str1="stops";
	String str2="pot";
	if(str1.length()==str2.length()) {//(stops==pot)
		char[] arrStr1=str1.toCharArray();//(s, t, o, p, s)
		char[] arrStr2=str2.toCharArray();//(p, o, t)
		Arrays.sort(arrStr1);//(o, p, s, s, t)
		Arrays.sort(arrStr2);//(o, p, t)
		for (int i = 0; i < arrStr2.length; i++) {
			if(arrStr1[i]!=arrStr2[i]) {(0!=0),(1!=1),(2!=2)
				System.out.println("Given Strings are not an anagram");
				break;
			}
			
		}
		System.out.println("Given Strings are an anagram");//(POT)
	}
	else {
		System.out.println("Given Strings are not an anagram");//(SS)
	}
	}
}
