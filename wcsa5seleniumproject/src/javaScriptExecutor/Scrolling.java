package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		//launch the browser
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://in.puma.com/in/en");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    //scroll down
	    Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,1000)");

	    


	}

}
