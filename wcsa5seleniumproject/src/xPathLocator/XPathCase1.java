package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCase1 {

	public static void main(String[] args) throws InterruptedException {
		//By using unique Attribute & text() Function
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://twitter.com/i/flow/login");
        
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("sush@123gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}

