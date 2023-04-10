package Week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsApp() {
		
		System.out.println("I can use Whats app in smart phone");
	}
	
	protected void takeVideo() {
		
		System.out.println("I can take a video from smart phone");
		
	}

	public static void main(String[] args) {
	
		SmartPhone sp = new SmartPhone();
		
		sp.sendMessage();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
		
	}

}
