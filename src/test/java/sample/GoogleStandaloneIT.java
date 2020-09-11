package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleStandaloneIT {
	@Test
	@DisplayName("simple google test")
	public void test() {
		System.setProperty("webdriver.gecko.driver", "/Applications/selenium/drivers/firefox/geckodriver");
		WebDriver driver = new FirefoxDriver();       
		driver.navigate().to("http://www.google.com");
		driver.quit();
	}
}

