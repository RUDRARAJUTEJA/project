package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) {
		
		String s[] = {"mahe","nare","mure","teja"};
		
		for (int i = 0; i < s.length; i++) {
			
			if (s[i].startsWith("m")) {
				System.out.println(s[i]);
				
			}
			
			
			
			
		}
		
		
	}
}
