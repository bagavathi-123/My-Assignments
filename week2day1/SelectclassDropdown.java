package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.className("inputBox")).sendKeys("bg");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bagavathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manirao");
        WebElement selec = driver.findElement(By.name("dataSourceId"));
        Select op=new Select(selec);
        op.selectByIndex(4);
        WebElement selec1 = driver.findElement(By.name("marketingCampaignId"));
        Select op1=new Select(selec1);
        op1.selectByVisibleText("Demo Marketing Campaign");
        WebElement selec2 = driver.findElement(By.name("ownershipEnumId"));
        Select op2=new Select(selec2);
        op2.selectByValue("OWN_PARTNERSHIP");
        driver.findElement(By.className("smallSubmit")).click();
        
		
	}

}
