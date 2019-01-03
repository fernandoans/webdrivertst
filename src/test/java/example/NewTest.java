package example;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
  private WebDriver driver;
  
  @Test
  public void myTest() {
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
  
  @BeforeTest
  public void beforeTest() {
	  // System.setProperty("webdriver.gecko.driver", "/home/fernando/Aplicativos/geckodriver");
	  driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}