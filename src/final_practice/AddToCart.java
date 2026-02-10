package final_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Harsh.Vashishth/Downloads/example3.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("foodHeading"))));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("category"))));
		
		driver.findElement(By.xpath("//*[text()='Dessert']")).click();
		driver.findElement(By.xpath("//*[text()='Brownie']/following-sibling::button")).click();
		
		wait.until(ExpectedConditions.textToBe(By.id("cartCount"),"1"));
		
		driver.findElement(By.id("confirmOrderBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closePopupBtn")).click();
		
		driver.quit();




		
		
	}

}
