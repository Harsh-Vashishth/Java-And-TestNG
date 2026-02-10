package frame_handling;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		List<WebElement>linkList = driver.findElements(By.xpath("//button[starts-with(text(),'Open')]"));
		String parentWin = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		
		for(WebElement link:linkList) {
			link.click();
			Thread.sleep(3000);
			driver.switchTo().window(parentWin);
			Thread.sleep(3000);
			
		}
		
		Set<String>window = driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		it.next();
		while(it.hasNext()) {
			String child = it.next();
			Thread.sleep(2000);
			driver.switchTo().window(child);
			Thread.sleep(2000);
			if(!driver.getTitle().equals(parentTitle)) driver.close();
		}
		driver.switchTo().window(parentWin);
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
