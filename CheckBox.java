package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label//following::input")).click();
		System.out.println(driver.findElementByXPath("(//label)[2]//following::input").isSelected());
		driver.findElementByXPath("((//label)[3]//following::input)[2]").click();
		driver.findElementByXPath("((//label)[4]//following::input)[1]").click();
		driver.findElementByXPath("((//label)[4]//following::input)[2]").click();
		driver.findElementByXPath("((//label)[4]//following::input)[3]").click();
		driver.findElementByXPath("((//label)[4]//following::input)[4]").click();
		driver.findElementByXPath("((//label)[4]//following::input)[5]").click();
		driver.close();

	}

}
