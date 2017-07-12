package nonEssential;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		WebElement table = driver.findElementByXPath("//div[@class='x-panel-body xedit-grid']//tr");		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println(rowcount);
		String text = row.get(rowcount-2).getText();
		System.out.println(text);
		
	}
}