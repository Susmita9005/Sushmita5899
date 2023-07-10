package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("12345678");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id = 'pass']")).sendKeys("Abc@123");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name = 'login']")).click();
		
		


	}

}
