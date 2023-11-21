package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("bagavathi1203@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("pass")).sendKeys("uvarajan86");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
       
}
}