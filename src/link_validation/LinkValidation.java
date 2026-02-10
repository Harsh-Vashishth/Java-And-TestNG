package link_validation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		List<WebElement> anchorList = driver.findElements(By.tagName("a"));
		for(WebElement link:anchorList) {
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
				conn.setRequestMethod("GET");
				int code = conn.getResponseCode();
				if(code != 404) System.out.println(link.getAttribute("href")+ " is working");
				
				else System.out.println(link.getAttribute("href")+ " is not working");
				
				
			}
			catch(Exception ex){
				
			}
		}
	}

}
