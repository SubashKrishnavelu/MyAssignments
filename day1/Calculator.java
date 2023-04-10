package Week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public void add(int a, int b, int c) {
		
		int d=a+b+c;
		
		System.out.println("Added value is: "+d);
		
	}
	
	public void mul(int a, double b) {
		
		System.out.println("Multiplied value: "+a*b);
		
	}
	
	public void mul(double a, double b) {
		
		System.out.println("Multiplied value: "+a*b);
		
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.add(10, 20);
		c.add(10, 20, 30);
		c.mul(15, 25.5);
		c.mul(25.5, 30.5);
		
	}

}
