package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Button")).click();
		System.out.println( driver.findElement(By.id("position")).getLocation().getX());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("size")).getSize());
		driver.close();
}
}