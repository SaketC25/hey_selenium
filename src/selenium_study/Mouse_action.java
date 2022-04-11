package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\java notepad\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/dragndrop/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		

	}

}
