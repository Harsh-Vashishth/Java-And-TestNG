package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class AlertProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		WebElement alertBtn = driver.findElement(By.id("alert"));
		alertBtn.click();
		Thread.sleep(2000);
		Alert alertBox = driver.switchTo().alert();
		System.out.println(alertBox.getText());
		alertBox.accept();
		Thread.sleep(3000);
		
		WebElement confirmBtn = driver.findElement(By.id("confirm"));
		confirmBtn.click();

		Alert confirmBox = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmBox.dismiss();
		Thread.sleep(3000);
		
		WebElement promptBtn = driver.findElement(By.id("prompt"));
		promptBtn.click();
		
		Alert promptBox = driver.switchTo().alert();
		Thread.sleep(3000);
		promptBox.sendKeys("hello all");
		Thread.sleep(2000);
		promptBox.accept();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
