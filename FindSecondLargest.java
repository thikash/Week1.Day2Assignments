package assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3, 2, 11, 4, 6, 7};
		int tem=0;
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i]>data[j]) {
					 tem=data[i];
					data[i]=data[j];
					data[j]=tem;
				}
			}
		
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println("Elements of array sorted in ascending order:"+data[i]);
		}
		System.out.println("************************************************************");
			System.out.println("Second Largest Element In The Array:"+data[data.length-2]);
		
	}

}
