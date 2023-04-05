package week2.day2;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class testLeafAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver =new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SIERRA");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rachel");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lee");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subash.bca2009@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9566908018");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		

	}

}
