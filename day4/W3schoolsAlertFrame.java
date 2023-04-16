package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class W3schoolsAlertFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert click = driver.switchTo().alert();
		
		click.sendKeys("I am Subash");
		
		click.accept();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.id("demo")).getText();
		
		Thread.sleep(5000);
		
		System.out.println(text);
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
