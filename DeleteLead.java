package Testleafpage;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.XmlFactoryHook.ThreadContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadTimeoutException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
			driver.findElementByLinkText("Phone").click();
			driver.findElementByName("phoneNumber").sendKeys("98");
			driver.findElementByXPath("(//td[@class='x-btn-center'])//button[text()='Find Leads'] ").click();
			Thread.sleep(20000);
		    WebElement lead1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		 String value=  lead1.getText();
		   lead1.click();
		System.out.println(value);
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(value);
		driver.findElementByXPath("//button[text()='Find Leads'] ").click();
		Thread.sleep(10000);
	    WebElement verify1 = driver.findElementByClassName("x-paging-info");
	    String msg=verify1.getText();
	    System.out.println(msg);
	    driver.close();
	}

}
