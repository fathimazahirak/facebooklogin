package fbloginpackk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	public static void main(String[] args) {
		
		// Set the path to the ChromeDriver executable
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		// Create a new instance of the ChromeDriver
	      WebDriver driver = new ChromeDriver();
	      
	      
	      // navigate refresh method
	      driver.navigate().refresh();
	
	   //Navigate to the Facebook login page using GET method
	    driver.get("https://www.facebook.com/login/");
	    
	    
	    //Maximize the window
	    driver.manage().window().maximize();
	    
	    //javascript executor
	    JavascriptExecutor
	    executor=(JavascriptExecutor)driver;
	    executor.executeScript("location.reload()");
	    
	    
	    //Minimize the window
	   // driver.manage().window().minimize();
		
	   WebElement Emailaddressorphonenumber = driver.findElement(By.name("email"));
	    Emailaddressorphonenumber.sendKeys("12345678");
	
	   WebElement Password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	   Password.sendKeys("flower");
	   
	   WebElement Loginbutton = driver.findElement(By.name("login"));
	   Loginbutton.click();
	   
	   System.out.println("Done");
	   
	   //Close the driver
	   driver.close();
	   
	   
	   
	   
	}
}
 