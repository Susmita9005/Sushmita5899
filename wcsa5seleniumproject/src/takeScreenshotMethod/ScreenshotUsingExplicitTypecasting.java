package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		//Typecasting from webdriver to takesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshot/google.png");  //to store the screenshot we create object of file
	                                                    // 1 path 2 name 3 extension(.png, .jpg)
		
		Files.copy(src, dest);            //third party class
		
		

	}

}
