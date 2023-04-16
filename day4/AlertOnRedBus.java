package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertOnRedBus {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='db']")).sendKeys("Chennai");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		
		driver.findElement(By.xpath("(//input[@class='db'])[2]")).sendKeys("Bangalore");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//li[@data-id='122']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//td[@class='we day']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		
		System.out.println(text);
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		
		System.out.println(text2);
		
		Thread.sleep(7000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(7000);
		
		driver.close();
		
	}

}
