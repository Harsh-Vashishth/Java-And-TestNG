package seleniumDay9;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class Program2Selenium {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(300,600));
		
		

	}

}
