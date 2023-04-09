package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day4Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mithali");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566908018");
		
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Mithali_123");
		
		Thread.sleep(2000);
		
		Select option = new Select(driver.findElement(By.id("day")));
		
		option.selectByValue("22");
		
		Select options = new Select(driver.findElement(By.id("month")));
		
		options.selectByIndex(3);
		
		Thread.sleep(2000);
		
		Select opt = new Select(driver.findElement(By.id("year")));
		
		opt.selectByVisibleText("1992");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
