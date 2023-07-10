package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cdriver.get("https://selenium.dev/");
		
		File src=cdriver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/Screenshot3.jpg");
		Files.copy(src, dest);
		
		

	}

}
