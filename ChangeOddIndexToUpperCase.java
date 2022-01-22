package assignment2;
public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String test="changeme";
	String emp=""; 
	//char[] cha=new chartest[test.length()];
	for (int i = 0; i < test.length(); i++) {//test length is 8
		if(i%2==0) {//odd value only allowed this condition (3%2!=0)=(1!=0) therfore the not gate 0=1, 1=0 so the output is zero)
			emp=emp+Character.toLowerCase(test.toCharArray()[i]);//cagm
		     }
		else {
			emp=emp+Character.toUpperCase(test.toCharArray()[i]);//HNEE
		     }
	}
	System.out.println(emp);//cHaNgEmE(0-c,1-H,2-a 3-N,4-g,5=E,6=m,7=E)
}
}
