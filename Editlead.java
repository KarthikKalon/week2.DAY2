package Testleafpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("karthi");
		Thread.sleep(5000);
		driver.findElementByXPath("//button[text()='Find Leads'] ").click();
		Thread.sleep(20000);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
        Thread.sleep(5000);
        driver.findElementByLinkText("Edit").click();
        WebElement update1 = driver.findElementById("updateLeadForm_companyName");
        update1.clear();
        update1.sendKeys("TESTLEAF");
        String str1="TEST";
        driver.findElementByName("submitButton").click();
        WebElement company = driver.findElementById("viewLead_companyName_sp");
        String str2=company.getText();
        System.out.println(str2);
        driver.close();
        
		
		
		
		
		
		}
}
