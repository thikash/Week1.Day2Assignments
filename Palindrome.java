package assignment2;

public class Palindrome {
	public static void main(String[] args) {
		String orgValue="AATHIAA";
		String rev="";
		char[] charArray=orgValue.toCharArray();
	
		for (int i = charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];
			System.out.println(rev);
		}
	
	if(orgValue.equals(rev)) {
		System.out.println("Given String is a palindrome");
	}
	else {
	System.out.println("Given String is not a palindrome");
	}
	
	}

}
