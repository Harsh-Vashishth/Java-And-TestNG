package final_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		WebElement host = driver.findElement(By.xpath("//*[@data-testid = 'shadow-host']"));
		
		SearchContext root = host.getShadowRoot();

		WebElement shadowDiv = root.findElement(By.cssSelector("div"));
		
		System.out.println(shadowDiv.findElement(By.cssSelector("p")).getText());
	}

}
