package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//img[@alt='HYD']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		Thread.sleep(10000);
		
		driver.close();

	}

}
