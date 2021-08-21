package Testleafpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");  
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Test");
		driver.findElementById("lastNameField").sendKeys("leaf");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("karthik");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("varadhan");
		driver.findElementById("createContactForm_departmentName").sendKeys("Selenium");
		driver.findElementById("createContactForm_description").sendKeys("varadhan");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("karthik@gmal.com");
		WebElement drp1 = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select drpdwn1=new Select(drp1);
		drpdwn1.selectByVisibleText("New York");
		driver.findElementByName("submitButton").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Important");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
