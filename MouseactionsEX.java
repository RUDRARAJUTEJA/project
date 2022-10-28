package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseactionsEX {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElementByClassName("desktop-main")).perform();
		
		driver.findElementByLinkText("Sweaters").click();
	}
	
	
	
	
	
	
	
	
	
}
