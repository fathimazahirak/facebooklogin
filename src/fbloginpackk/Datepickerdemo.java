package fbloginpackk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickerdemo {

	public static void main(String[] args)
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Nachu");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		Lastname.sendKeys("Roomi");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("nachu@gmail.com");
		
		WebElement Gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		Gender.click();	
		
		WebElement Mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		Mobile.sendKeys("9876543210");
		
		WebElement DOB= driver.findElement(By.id("dateOfBirthInput"));
		DOB.click();
		
		
		WebElement yearSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select yearDropdown = new Select(yearSelect);
		yearDropdown.selectByVisibleText("2000"); // use desired year
		
		WebElement monthSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select monthDropdown = new Select(monthSelect);
		monthDropdown.selectByVisibleText("January"); // use desired month
		
		
		WebElement daySelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]"));
		daySelect.click();
		
		//Select dayDropdown = new Select(daySelect);
		//dayDropdown.selectByVisibleText("20"); // use desired date*/
		
		//WebElement Hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		//Hobbies.click();
		
		
		
		//WebElement Subjects = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		//Subjects.sendKeys("English, Maths, Tamil");
		
		//WebElement Address = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		//Address.sendKeys("flat no.1,Rose villa,Chennai");
		
		//WebElement fileinput = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
		//fileinput.sendKeys("C:\\Users\\Admin\\Pictures\\Camera Roll\\image1.jpg");
		
		
		

		
		
		
				
		

	}

}
