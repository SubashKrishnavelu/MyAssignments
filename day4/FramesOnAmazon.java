package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesOnAmazon {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		
		System.out.println("Results: "+text);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@aria-label='Safari']/span")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//li[@aria-label='American Tourister']/span")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String name = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span")).getText();
		
		System.out.println("Name of the 1st Bag= "+name);
		
		Thread.sleep(3000);
		
		String dis = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		
		System.out.println("Discounted Price= "+dis);
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		System.out.println("Page Title="+title);
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
