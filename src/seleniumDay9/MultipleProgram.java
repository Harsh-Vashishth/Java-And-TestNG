package seleniumDay9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultipleProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
//		List<WebElement> radioBtn = driver.findElements(By.name("gender"));
//		radioBtn.get(1).click();
		
//		List<WebElement>checkBox = driver.findElements(By.name("programmingLang"));
//		Thread.sleep(2000);
//		checkBox.get(2).click();
//		Thread.sleep(2000);
//		checkBox.get(4).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("date")).sendKeys("01/31/2027");
//		Thread.sleep(2000);
		
//		WebElement input2 = driver.findElement(By.id("input_text"));
//		System.out.println(input2.getAttribute("placeholder"));
//		System.out.println(input2.getTagName());
//		System.out.println(input2.getText());
//		System.out.println(input2.getRect().getX());
//		System.out.println(input2.getSize().getHeight());

		WebElement disableBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/section[4]/div/div/button"));
		System.out.println("Enabled:"+ disableBtn.isEnabled());
		
		WebElement dropSelect = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/section[2]/div/div/select/option[1]"));
		System.out.println("Selected:"+ dropSelect.isSelected());
		
		WebElement inputDisplay = driver.findElement(By.id("hiddenInput1"));
		System.out.println("Displayed:"+inputDisplay.isDisplayed());
		System.out.println(disableBtn.getCssValue("background"));
		
		driver.quit();
		
		
	}

}

