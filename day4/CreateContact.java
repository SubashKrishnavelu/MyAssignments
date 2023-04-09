package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'bmit')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Subash");
		
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Krish");
		
		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("Raki");
		
		driver.findElement(By.xpath("//input[contains(@id,'lastNameLocal')]")).sendKeys("Krishna");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("QA");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Best Place to work");
		
		driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]")).sendKeys("subash.bca2009@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'lastNameLocal')]")).sendKeys("Krishna");
		
		Thread.sleep(2000);
		
		Select option = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		
		option.selectByVisibleText("Alabama");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("WorkHard");	
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println("Title = "+title);
		
		driver.close();

	}

}
