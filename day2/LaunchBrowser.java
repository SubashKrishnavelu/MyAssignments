package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
