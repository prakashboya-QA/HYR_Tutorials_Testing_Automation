package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	public WebDriver driver;
	public String url = "https://www.hyrtutorials.com/p/add-padding-to-containers.html";
 
  @BeforeClass
  public void setUp() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(url);
  }

  @AfterClass
  public void tearDown() {
	  
	  if(driver != null)
	  {
		  driver.quit();
	  }
  }

}
