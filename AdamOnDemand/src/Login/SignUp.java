package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SignUp {

	ChromeDriver driver;
	@BeforeTest
	//login page
	public void SignIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.adamondemand.com/");
		Thread.sleep(5000);
		driver.findElement(By.className("close")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Understanding the Physiology of the Skin")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElementByLinkText("Catalog")).perform();
		driver.findElement(By.linkText("Available Now")).click();
		
		
		
		
		
	}
		
		
		
		
		
		
	}
	
	

