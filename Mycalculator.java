package assignment2;

public class Mycalculator {
	
	
	
	public int add(int num1, int num2, int num3) {
		int sum=num1+num2+num3;
		System.out.println("sum:"+sum);
		return sum;
}
	public int sub(int num1, int num2) {
		int subtraction=num1-num2;
		System.out.println("subtraction:"+subtraction);
		return subtraction;
	}
	public double mul(double num1, double num2) {
		 double multiplication=num1*num2;
		 System.out.println("product:"+multiplication);
		return multiplication;
	}
	public float div(float num1, float num2) {
		float division=num1/num2;
		System.out.println("quotient:"+division);
		
		return division;
	}
	public static void main(String[] args) {
		Mycalculator cal=new Mycalculator();
		cal.add(6, 9, 63);
		cal.mul(17, 8);
		cal.div(81, 9);
		cal.sub(92, 44);
		System.out.println(cal);
	}
}
