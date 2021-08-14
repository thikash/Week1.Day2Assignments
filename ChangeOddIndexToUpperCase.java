package assignment2;



public class ChangeOddIndexToUpperCase {



public static void main(String[] args) {
	String test="changeme";
	String emp=""; 
	//char[] cha=new chartest[test.length()];
	for (int i = 0; i < test.length(); i++) {
		if(i%2!=0) {
			emp=emp+Character.toLowerCase(test.toCharArray()[i]);
		}
		else {
			emp=emp+Character.toUpperCase(test.toCharArray()[i]);
		}
		
	}
	
	System.out.println(emp);
}
}
