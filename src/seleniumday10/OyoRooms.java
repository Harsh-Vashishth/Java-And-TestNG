package seleniumday10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OyoRooms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.className("datePickerDesktop")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("DateRangePicker__PaginationArrowIcon--next")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("DateRangePicker__PaginationArrowIcon--next")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("DateRangePicker__PaginationArrowIcon--next")).click();
		Thread.sleep(2000);
		
		driver.findElement((By.xpath("//span[@class='DateRangePicker__DateLabel' and text()='3']"))).click();
		Thread.sleep(2000);
		driver.findElement((By.xpath("//span[@class='DateRangePicker__DateLabel' and text()='6']"))).click();
		Thread.sleep(2000);


	}

}
