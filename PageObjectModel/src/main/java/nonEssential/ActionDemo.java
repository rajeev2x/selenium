package nonEssential;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("http://jqueryui.com/droppable/");
		//driver.switchTo().frame("demo-frame");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		Thread.sleep(2000);
		WebElement draggable =  driver.findElementById("draggable");
		WebElement droppable =  driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
	}
}