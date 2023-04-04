package week2.day1;

import org.testng.annotations.IFactoryAnnotation;

public class ReverseTheEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		
		char[] ch=test.toCharArray();
		
		String[] split=test.split(" ");
		
		
		
		for (int i = 0; i < split.length; i++) {
			
			if (ch[i] %2==0) {
				
				System.out.println(ch[i]);
				
			}
			
			for (int j = 0; j < split.length; j++) {
				
				if (ch[i] %2!=0) {
					
					System.out.print(ch[i]+" ");
					
				}
				
			}
			
		}
		
		

	}

}
