package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesOnTestLeaft {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Alert click = driver.switchTo().alert();
		
		click.accept();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		Alert click1 = driver.switchTo().alert();
		
		click1.accept();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]/span")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[4]/span")).click();
		
		Alert click2 = driver.switchTo().alert();
		
		click2.sendKeys("I am Subash");
		
		click2.accept();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link'])[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-external-link'])[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
