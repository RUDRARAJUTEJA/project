package selenium;



	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class practise {
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.switchTo().alert().dismiss();
		if (!driver.findElementByXPath("//*[@stroke='#F7941D']").isSelected()) {
			driver.findElementByXPath("//*[@stroke='#F7941D']").click();
		}
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("bengaluru");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("hyderabad");
		
		
		
	}
	}

