package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		String link1=homepage.getAttribute("href");
		homepage.click();
		driver.findElement(By.linkText("HyperLink")).click();
		System.out.println( driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	    WebElement homepage1 = driver.findElement(By.xpath("//label[@for='position']//preceding-sibling::a"));
	    String link2=homepage1.getAttribute("href");
		System.out.println(link1.equals(link2));  
		driver.findElementByLinkText("Verify am I broken?").click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println(" The given link is broken");
		}
		driver.navigate().back();
		
	List<WebElement> tag = driver.findElementsByTagName("a");
	System.out.println(tag.size()); 
		driver.close();
	}
}
