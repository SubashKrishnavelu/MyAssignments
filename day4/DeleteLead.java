package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9566908018");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		WebElement leadNum = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		Thread.sleep(5000);
		
		String text = leadNum.getText();
		
		System.out.println("First Lead Id: "+text);
		
		if (text.equals("11670")) {
			
			System.out.println("Lead Id: "+text);
			
		} else {
			
			System.out.println("Lead Id Not Available");
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11670");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		WebElement rec = driver.findElement(By.xpath("//div[text()='No records to display']"));
		
		String text2 = rec.getText();
		
		System.out.println(text2);
		
		driver.close();

	}

}
