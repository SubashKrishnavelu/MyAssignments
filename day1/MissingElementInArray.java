package week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]!=arr[j]) {
					
					System.out.println("MissingElement"+arr[i]);
				} 
				
			}
			
		}

	}

}
