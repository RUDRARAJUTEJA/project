package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermethodsex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement teja=driver.findElementByName("q");
		
		teja.sendKeys("alluri shivakumar");
		teja.submit();
		
		String expectedtitle="shiva kumar-googlesearch";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		if(expectedtitle.contains(actualtitle)) {
			
			System.out.println("ok");
			
		} else {
			System.out.println("not ok");
			
		}
		
	}	
	


}