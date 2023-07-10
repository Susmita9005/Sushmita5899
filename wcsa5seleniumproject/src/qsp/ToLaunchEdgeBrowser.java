package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Relative path of driver executable file
				
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		 
		//Launch Edge browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		 
		//provide delay for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		

	}

}
