package methodOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		//launch the browser
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://omayo.blogspot.com/");
	     String parenthandle = driver.getWindowHandle();
	     System.out.println(parenthandle);
	     //launch the child window
	     driver.findElement(By.partialLinkText("Open a popup window")).click();
	     //get the handle or address of child windoe only
	       String childHandle = driver.getWindowHandle();
	       System.out.println("child window address: "+childHandle);
	       Set<String> allHandles = driver.getWindowHandles();
	       //by using looping statement
	       for( String wh:allHandles)
	       {
	    	   System.out.println(wh);
	       }
	       
	     


	}

}
