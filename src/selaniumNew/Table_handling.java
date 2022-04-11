package selaniumNew;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@id='top-menu']//a[normalize-space()='Start Selenium Practice']")).click();
	    Set<String> allPageId = driver.getWindowHandles();
	    
	    Iterator<String> ids = allPageId.iterator();
	    
	    String mainpage = ids.next();
		String child = ids.next();
		driver.switchTo().window(child);
		
		int columnSize = driver.findElements(By.xpath("//table[@id='product']//th")).size();
		
		System.out.println("Number of columns " +columnSize);
		
		int rowSize = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		
		System.out.println("Number of columns " +rowSize);
		
		for (int i = 1; i <=rowSize; i++) {
			for (int j = 1; j <=columnSize; j++) {
				String text;
				if(i==1) {
				 text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
				}
				else {
				text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
				}
				System.out.print   (text+" || ");
			}
		}
		System.out.println();
}

}
