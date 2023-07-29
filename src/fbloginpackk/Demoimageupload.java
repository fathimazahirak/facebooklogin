package fbloginpackk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoimageupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/signup/");
		
		driver.manage().window().maximize();
		
		WebElement Fullname = driver.findElement(By.id("username"));
		Fullname.sendKeys("ROOMI");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("roomi@gmail.com");
		
		//WebElement Phonenumber = driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]"));
		//Phonenumber.sendKeys("9876123456");
		
		//faxno.not working
		
		
		//upload image in website copy xpath of choosefile
		
		WebElement fileinput = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileinput.sendKeys("C:\\Users\\Admin\\Pictures\\Camera Roll\\image1.jpg");
		
		try {
			
			Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
	
		}
		
		Select dropGender = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
		dropGender.selectByIndex(2);
		
		WebElement Experience = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[3]"));
		Experience.sendKeys("3");
		Experience.click();
		
		WebElement Skills = driver.findElement(By.xpath("//*[@id=\"ip\"]"));
		Skills.click();
		
		//Select dropTools = new Select( driver.findElement(By.xpath("//*[@id=\"tools\"]")));
		//dropTools.selectByValue("Selenium");
		
		WebElement Tools = driver.findElement(By.xpath("//*[@id=\"tools\"]/option[1]"));
		Tools.click();
		
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();
		
		
		
	
		
	}
}
