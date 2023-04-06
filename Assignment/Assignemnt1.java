package week2.day3.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignemnt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Subash");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krishna");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566908018");
		
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Krish_123");
		
		Select option = new Select(driver.findElement(By.id("day")));
		
		option.selectByValue("22");
		
		Select options = new Select(driver.findElement(By.id("month")));
		
		options.selectByIndex(4);
		
		Select opt = new Select(driver.findElement(By.id("year")));
		
		opt.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		driver.close();
		

	}

}
