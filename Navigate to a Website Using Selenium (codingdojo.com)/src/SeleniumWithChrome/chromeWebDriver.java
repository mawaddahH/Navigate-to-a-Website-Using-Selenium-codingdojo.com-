package SeleniumWithChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeWebDriver {
	public WebDriver driver;

  @Test
  public void chrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lo0ol\\"
		  		+ "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
				  driver = new ChromeDriver();
				  
				  driver.navigate().to("https://www.codingdojo.com/");
				  driver.manage().window().maximize();
				 // driver.close();
  }
}
