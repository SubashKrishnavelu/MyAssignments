package week1.day1;

public class Vehicle {
	
	private void applyBrake() {
		// TODO Auto-generated method stub
		
		System.out.println("I am Applying Brake");

	}
	
	public void soundHorn() {
		// TODO Auto-generated method stub
		
		System.out.println("Giving a Horn Sound");

	}
	
	public int regNumber() {
		return 2224;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle Car = new Vehicle();
		Car.applyBrake();
		Car.soundHorn();
		int regNumber = Car.regNumber();
		System.out.println(regNumber);

	}

}
