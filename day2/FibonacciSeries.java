package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum = 0;
		int secNum = 1;
		int sum;
				
		System.out.print(firstNum+","+secNum);
		
		for (sum = 0; sum <=8; sum++) {
			
			sum=firstNum+secNum;
			
			System.out.print(","+sum);
			
			firstNum=secNum;
			secNum=sum;
			
		}

	}

}
