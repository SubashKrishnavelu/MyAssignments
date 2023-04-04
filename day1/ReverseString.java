package week2.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Subash";
		
		System.out.println("The Given name is: "+name);
		System.out.print("The Reverse String is: ");
		
		char[] ch = name.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			
			System.out.print(ch[i]);
			
		}

	}

}
