package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Testleaf@gmail.com");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("the Keys",Keys.TAB);
	    System.out.println( driver.findElement(By.xpath("(//input)[3]")).getAttribute("value"));
		WebElement element2 = driver.findElement(By.xpath("(//input)[4]"));
		element2.clear(); 
		element2.sendKeys("CLEARED");
		System.out.println(driver.findElement(By.xpath("(//input)[5]")).isEnabled());
		
		driver.close();
		
		
	}

}
