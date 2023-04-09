package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {

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
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rachel");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Sierra ODC");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(5000);
		
		WebElement editedName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		
		Thread.sleep(5000);
		
		String text = editedName.getText();
		
		System.out.println("The Company name is "+text);
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
