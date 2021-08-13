package assignment2;

import java.util.Arrays;

public class MissingElementINArray {
public static void main(String[] args) {
	int[ ] arr= {1, 2, 3, 5,  6, 7};
	Arrays.sort(arr);
	int min=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] !=min+i) {
			System.out.println( min+i);
			break;
		}
		
	}
}
}
