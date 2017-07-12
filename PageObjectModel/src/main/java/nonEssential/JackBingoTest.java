package nonEssential;

import org.openqa.selenium.By;
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
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/jackbingo-user/app-game/div/game-session/div/div/div[1]/game-upcommingsession/div/div[2]/div[7]/div[2]")));
				driver.findElementByXPath("/html/body/jackbingo-user/app-game/div/game-session/div/div/div[1]/game-upcommingsession/div/div[2]/div[7]/div[2]").click();
		}
		
		
		
	}


