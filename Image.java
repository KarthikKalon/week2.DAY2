package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='home']//following-sibling::img")).click();
		driver.navigate().back();
		WebElement img = driver.findElementByXPath("//label[@for='position']/following-sibling::img");
		if(img.getAttribute("href")==null) {
			System.out.println("The given img is a broken image");
		}
		else {
			System.out.println("The given image has a link");
		}
		
	}

}
