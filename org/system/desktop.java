package org.system;

public class desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("Size of the desktop: 13 inches");
		
	}
	

	public static void main(String[] args) {
		
		desktop dt = new desktop();
		
		dt.computerModel();
		dt.desktopSize();
		
	}

}
