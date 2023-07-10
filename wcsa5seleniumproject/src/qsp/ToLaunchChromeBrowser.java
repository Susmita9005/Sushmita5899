package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Relative Path of Driver Executable File
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		

		// upcast into WebDriver (I)
		WebDriver driver = new ChromeDriver(); //To Launch Chromedriver
		  
		driver.manage().window().maximize();    //Maximize the browser
		 
		  
	   //provide the dealy of 2 sec 
		Thread.sleep(2000);     //stops Execution for 2 sec
		
	  //To close browser
		driver.close();

	}

}
