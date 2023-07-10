package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  //Launch webdriver
	  ChromeDriver driver = new ChromeDriver();
	  //Maximize the window
	  driver.manage().window().maximize();
	  //Apply implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //Launch the webapplication
	  driver.get("https://www.bluestone.com/");
	  driver.findElement(By.className("deny-btn")).click();
	  Thread.sleep(2000);
	  //identify the frame by using xpath
	   WebElement frameElement = driver.findElement(By.xpath("//iframe[@id ='fc_widget']"));
	   
	   
	  //handle the frame by switch the controls to frame ...
     //driver.switchTo().frame(5); // handle frame by using index
	//driver.switchTo().frame("fc_widget"); // handle frame by using name Or Id.
	   
	   driver.switchTo().frame(frameElement);
	   WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		// switch the controls again back to the main webpage..
		 driver.switchTo().defaultContent();
				
				Thread.sleep(2000);
				driver.findElement(By.id("chat-fc-name")).sendKeys("Sushmita");
				driver.findElement(By.id("chat-fc-email")).sendKeys("sush@123");
				driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");

		
	}
	   
	  
	  

	}


