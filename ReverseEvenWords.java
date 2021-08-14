package assignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String[] words=test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(i%2==1) {
				int lengthofwords=words[i].length();
				for (int j = lengthofwords-1; j>=0; j--) {
					System.out.println(words[i].charAt(j));
					
				}
				System.out.println(" ");
			}
			else {
				System.out.println(words[i]+"   ");
			}
		}

	}

}
