package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstclass {

	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		driver.findElement(By.linkText("Sign in")).click();
		//wait.until(ExpectedConditions.titleIs("Amazon Sign In"));
		Thread.sleep(10000);
		driver.findElement(By.id("ap_email")).sendKeys("9963920065");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Sash1993");
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
	}
}
