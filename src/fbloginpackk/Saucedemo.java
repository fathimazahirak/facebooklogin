package fbloginpackk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		WebElement Bikelight = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		Bikelight.click();
		
		WebElement Addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		Addtocart.click();
	}

}
