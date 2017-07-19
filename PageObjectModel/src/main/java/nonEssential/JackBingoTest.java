package nonEssential;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JackBingoTest {

		
		public static void main(String[] args) throws InterruptedException
		
		{
			
			 	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();	
				driver.get("http://52.52.220.243/JackBingo/test/User/#/login");
				driver.findElementByName("PhoneNumber").sendKeys("9566121617");
				driver.findElementByName("PinNumber").sendKeys("123456");
				driver.findElementByClassName("btn").click();
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//game-upcommingsession/div/div[2]/div[1]/div[2]")));
				driver.findElementByXPath("//game-upcommingsession/div/div[2]/div[1]/div[2]").click();
				new WebDriverWait(driver, 500)
		        .ignoring(NoAlertPresentException.class)
		        .until(ExpectedConditions.alertIsPresent());
				Alert al = driver.switchTo().alert();
				al.accept();	
				
		}
		
			
	}


