package assignment2;

public class FindType {
public static void main(String[] args) {
	String name="@@ Welcome to 1st year students         !!";
	int letters=0, space=0, num=0, specialChar=0;
	char[] chara=name.toCharArray();
	for (int i = 0; i < name.length(); i++) {
		if( Character.isLetter(chara[i]))
		{
			letters++;
		}
		else if( Character.isDigit(chara[i])) {
			num++;
		}
		else if(Character.isSpaceChar(chara[i])){
			space++;
			
		}
		else {
			specialChar++;
		}
	}
	System.out.println("The Letters Count"+letters);
	System.out.println("The Number count"+num);
	System.out.println("The Space count"+space);
	System.out.println("The specialchar count"+specialChar);
	
}
}
