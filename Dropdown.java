package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdwn = driver.findElementById("dropdown1");
		Select drp=new Select(dropdwn);
		drp.selectByIndex(1);
		WebElement dropdwn1 = driver.findElementByName("dropdown2");
		Select drp7=new Select(dropdwn1);
		drp7.selectByVisibleText("Appium");
		WebElement dropdwn2 = driver.findElementById("dropdown3");
		Select drp1=new Select(dropdwn2);
		drp1.selectByValue("3");
		WebElement dropdwn3 = driver.findElementByClassName("dropdown");
		
		Select drp2=new Select(dropdwn3);
		drp2.selectByIndex(2); 	
	    System.out.println(drp2.getOptions());
		WebElement dropdwn4 = driver.findElementByXPath("//option[text()='Select your programs']//following-sibling::option[3]");
		dropdwn4.click();
		 System.out.println(drp2.getOptions());
		WebElement dropdwn5= driver.findElementByXPath("//option[text()='You can also use sendKeys to select']//ancestor::select");
			dropdwn5.sendKeys("Selenium");
		
		driver.close();
	}
	
}
