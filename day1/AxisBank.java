package Week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Deposted amount: 5,00,000");
	}

	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank(); 
		ab.saving();
		ab.fixed();
		ab.deposit();
	}

}
