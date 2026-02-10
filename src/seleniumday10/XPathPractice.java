package seleniumday10;

import java.util.ArrayList;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		List<String> nameList = new ArrayList<String>();
		
		List<WebElement> report = driver.findElements(By.xpath("//table//tbody//tr"));
		
		Thread.sleep(2000);
		
		for(int i = 1; i<= report.size(); i++) {
			
			Thread.sleep(2000);
			String name = driver.findElement(By.xpath("(//table//tbody//tr)["+i+"]/td[2]")).getText();
			WebElement id = driver.findElement(By.xpath("(//table//tbody//tr)["+i+"]/td[4]"));
			
			String idValue = id.getText();
			
			id.findElement(By.tagName("a")).click();
			Thread.sleep(2000);
			
			String idValue2 = driver.findElement(By.xpath("(//td)[last()]")).getText();
			
			if(!idValue.equals(idValue2)) nameList.add(name);
			
			driver.navigate().back();
			
		}
		System.out.println(nameList);
		
		driver.quit();
		
		

	}

}
