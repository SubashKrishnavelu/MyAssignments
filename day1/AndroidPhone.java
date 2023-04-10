package Week3.day1;

public class AndroidPhone extends Mobile{
	
	protected void takeVideo() {
		
		System.out.println("I can take a video using Android Phone");
	}

	public static void main(String[] args) {
		
		AndroidPhone ap = new AndroidPhone();
		
		ap.sendMessage();
		ap.makeCall();
		ap.saveContact();
		

	}

}
