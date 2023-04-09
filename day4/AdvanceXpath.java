package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("SET");
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sri");
		
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Nith");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		

	}

}
