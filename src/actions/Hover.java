package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
//		WebElement hover = driver.findElement(By.xpath("//*[@data-testid='hover-box']"));
//		act.moveToElement(hover).perform();
//		Thread.sleep(2000);
//		
//		WebElement rightClick = driver.findElement(By.xpath("//*[@data-testid='right-click-box']"));
//		act.contextClick(rightClick).perform();
//		Thread.sleep(2000);
//		
//		WebElement doubleClick = driver.findElement(By.xpath("//*[@data-testid='double-click-box']"));
//		act.doubleClick(doubleClick).perform();
//		Thread.sleep(2000);
//		
//		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//*[contains(text(),'Drop here')]"));
//
//		act.dragAndDrop(drag,drop).perform();
//		Thread.sleep(2000);
		
		WebElement left = driver.findElement(By.className("thumb-left"));
		WebElement right = driver.findElement(By.className("thumb-right"));
		Thread.sleep(2000);
		
		int num = 1;
		while(num<=10) {
			left.sendKeys(Keys.ARROW_RIGHT);
			num++;
		}
		
		num = 1;
		
		while(num<=20) {
			right.sendKeys(Keys.ARROW_LEFT);
			num++;
		}
//		act.clickAndHold(right).keyDown(Keys.ARROW_RIGHT);
		
//		WebElement capital = driver.findElement(By.tagName("textarea"));
//		act.keyDown(Keys.SHIFT).perform();
//		capital.sendKeys("hello");
//		act.keyUp(Keys.SHIFT).perform();
//		capital.sendKeys("all");
//		Thread.sleep(2000);
//		
//		WebElement start = driver.findElement(By.xpath("//*[@data-testid='start-button']"));
//		act.scrollToElement(start).perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("file")).sendKeys("C:\\Users\\Harsh.Vashishth\\Desktop\\gitpullfetch\\test.txt");


		
		
		
	}	
		

}
