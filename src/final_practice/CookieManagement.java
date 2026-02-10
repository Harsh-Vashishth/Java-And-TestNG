package final_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CookieManagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		Map<String,Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		opt.setExperimentalOption("prefs", prefs);
		
		opt.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		
		Set<Cookie>cookieSet = driver.manage().getCookies();
		
		driver.manage().addCookie(new Cookie("testA","valueA"));
		for(Cookie cookie:cookieSet) {
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getName());
		}
		

	}

}
