package selenium_study;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_P {

	public static void main(String[] args) throws InterruptedException, IOException {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mytechfocus.com/");
        Thread.sleep(2000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File destination = new File("C:\\Users\\saket choursiya\\Desktop\\java\\automation\\screenshot\\testS.png");
        
        File dd = new File("C:\\Users\\saket choursiya\\Desktop\\java\\automation\\screenshot\\testS2.png");
      
		FileHandler.copy(source, destination);
		
		FileHandler.copy(source, dd);
	}

}
