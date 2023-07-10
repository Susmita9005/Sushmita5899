package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Relative path of driver executable file
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 
		//Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//provide delay of 2 sec
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();
  
	}

}
