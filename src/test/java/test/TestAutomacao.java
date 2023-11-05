package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomacao {

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "..\\teste-mari\\src\\test\\resources\\drivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://google.com.br");
		driver.manage().window().maximize();
	}

}
