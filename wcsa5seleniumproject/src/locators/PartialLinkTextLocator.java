package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://omayo.blogspot.com");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Open")).click();


	}

}
