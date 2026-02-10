package seleniumday10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Pun");
		Thread.sleep(2000);
		driver.findElements(By.tagName("input")).get(1).sendKeys("chennai");
	}

}
