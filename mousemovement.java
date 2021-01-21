import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousemovement {
	
		public static void main(String[] args) throws InterruptedException  {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://indianrailways.gov.in/railwayboard/");
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.linkText("Passenger Info"))).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Concessions List")).click();
			
			
			
		

	}

}
