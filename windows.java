
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");

	driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
//		Thread.sleep(1000);
//		//driver.findElement(By.id("home")).click();
//		String parent_window=driver.getWindowHandle();
//		//System.out.println("Before Switching title is="+driver.getTitle());
//		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
//		Set<String> s1=driver.getWindowHandles();
//		Iterator<String>i1=s1.iterator();
//		while(i1.hasNext()) {
//			String child_window=i1.next();
//			if(!parent_window.equalsIgnoreCase(child_window));
//			{
//				driver.switchTo().window(child_window);
//				Thread.sleep(1000);
//				//System.out.println("After Switching title is="+driver.getTitle());
//				//driver.close();
//
//			}
//
//
//		}
//		driver.switchTo().window(parent_window);
//
//
//	}
//
//}
		
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		driver.findElement(By.id("home")).click();
		System.out.println(driver.getTitle());

		
	}
}
		
		
