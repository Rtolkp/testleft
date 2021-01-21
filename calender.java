import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {


	public static void main(String[] args) throws InterruptedException, ParseException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
		driver.findElement(By.id("datepicker")).click();

		String expectedDate="10/08/2021";

		String[] dateVal=expectedDate.split("/");
		int monthToSelect=Integer.parseInt(dateVal[1]);

		String selectedMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(selectedMonth);

		SimpleDateFormat inputFormat=new SimpleDateFormat("MMMM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(inputFormat.parse(selectedMonth));

		SimpleDateFormat outputFormat=new SimpleDateFormat("MM");
		System.out.println(outputFormat.format(cal.getTime()));
		int presentMonth=Integer.parseInt(outputFormat.format(cal.getTime()));
		System.out.println(presentMonth);

		if(monthToSelect > presentMonth) {
			for(int i=0; i< monthToSelect - presentMonth;i++) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(500);
			}
		}
		else if(monthToSelect < presentMonth) {
			for(int i=0; i<monthToSelect - presentMonth;i++) {
				driver.findElement(By.xpath("//span[text()='Prev']]")).click();
				Thread.sleep(500);

			}

		}
		driver.findElement(By.linkText(dateVal[0])).click();
	}
}