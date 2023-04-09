package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'bmit')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kathir@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		WebElement leadNum = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		
		Thread.sleep(5000);
		
		String text = leadNum.getText();
		
		System.out.println("First Lead Name: "+text);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		WebElement LeadVerify = driver.findElement(By.xpath("//span[text()='First name']/following::span"));
		
		String text2 = LeadVerify.getText();
		
		if (text.equals(text2)) {
			
			System.out.println("Duplicate Lead Id: "+text2+" is same as Creted Id");
			
		} else {
			
			System.out.println("Duplicate Id is not same");
		}
		
		driver.close();
		

	}

}
