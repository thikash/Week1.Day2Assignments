package assignment2;

public class CharOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome To Chennai";
		
		char[] chararr=str.toCharArray();
		int strlen=str.length();
		System.out.println("String length is:"+strlen);
		
		
		
		for (int i=0; i<chararr.length; i++) {
			int count=1;
			
			
			for (int j = i+1; j < chararr.length; j++) {
				if(chararr[i]==chararr[j]) {
					count++;
					chararr[j]='0';
				}
			
				}
			if(chararr[i]!='0') {
			System.out.println(chararr[i]+": "+count);
			}
			} 
		}
}