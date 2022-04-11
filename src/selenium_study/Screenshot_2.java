package selenium_study;

import java.io.File;
import java.io.IOException;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\saket choursiya\\Desktop\\java\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         File destination = new File("C:\\Users\\saket choursiya\\Desktop\\java\\automation\\screenshot\\screenshot1.png");
         
         FileHandler.copy(source, destination);
	}

}
