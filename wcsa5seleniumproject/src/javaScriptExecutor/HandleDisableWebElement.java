package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		//launch the browser
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/ASUS/Desktop/wcsa5workspace/webelements/disabled.html");
	    driver.findElement(By.id("i1")).sendKeys("admin");
	    //driver.findElement(By.id("i2")).sendKeys("manager");
	    Thread.sleep(2000);
	    //identify WebElement
	    
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    Thread.sleep(2000);
	    
	    //generate  alert Pop up 
	 	jse.executeScript("alert('Hello There!!');");
	 	Thread.sleep(4000);
	 		
	 	//To handle Disabled WebElement
	 	jse.executeScript("document.getElementById('i2').value='manager'");
	 		
	 		
	    
	    
	    
	    


	}

}
