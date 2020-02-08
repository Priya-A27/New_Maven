package jenkins.jproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SampleTestCase {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vihaan\\Desktop\\Webdriver\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
  }
}
