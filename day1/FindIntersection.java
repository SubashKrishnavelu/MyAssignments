package week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,11,4,6,7};
		
		int[] data = {1,2,8,4,9,7};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < data.length; j++) {
				
				if (arr[i]==data[j]) {
					
					System.out.println("The Intersection values are "+data[j]);
					
				}
				
			}
			
		}

	}

}
