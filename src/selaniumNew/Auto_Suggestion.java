package selaniumNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/webhp");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("mnc");
		Thread.sleep(2000);
		 List<WebElement> listOptions = driver.findElements(By.xpath("//div[@class='OBMEnb'][1]//ul//li"));
		 
		 Thread.sleep(2000);
		 for( WebElement w:listOptions) {
			System.out.println(w.getText());
			 
		 }
		 
			for(WebElement w:listOptions)//0,1,---10
			{
				String ExpectedResult = "mnc companies in pune";
				
				String ActualResult=w.getText();
				
				if(ActualResult.equals(ExpectedResult))

				{
					w.click();
					break;
				}
						}
			
	
	
	}

}
