package week2.day1;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="changeme";
		
		char[] ch=test.toCharArray();
		
		System.out.println(ch);
		
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] %2==0) {
				
				ch[i]=Character.toUpperCase(ch[i]);
				
				System.out.println(ch);
				
				
			}
			
			
			
		}

	}

}
