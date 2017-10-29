package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MedicalCourses extends SignUp {

	@Test
	public void MCourse() throws InterruptedException 
	{
		System.out.println("hi");
		Thread.sleep(3000);
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Understanding the Physiology of the Skin")).click();
		System.out.println("hiieii");
	
	}	
	
	
}
