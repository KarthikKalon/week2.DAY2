package Testleafpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
		public static void main(String[] args) throws InterruptedException{ 
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");  
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByLinkText("Email").click();
			driver.findElementByName("emailAddress").sendKeys("test@gmail.com");
			Thread.sleep(5000);
			driver.findElementByXPath("//button[text()='Find Leads'] ").click();
			Thread.sleep(20000);
		    WebElement lead1 =driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		 String value=  lead1.getText();
		    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		System.out.println(value);
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		WebElement name = driver.findElementById("viewLead_firstName_sp");
		String value2=name.getText(); 
		System.out.println(value2);
		if(value.equals(value2)) {
			System.out.println("The Given lead is Duplicate");
			driver.close();
		}

			
			
			
			
			
			
			
			
		}

}
