package Utilites;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class ReusableUtil {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    public ReusableUtil(WebDriver driver) {
        this.driver  = driver;
        this.actions = new Actions(driver);
        this.js =  (JavascriptExecutor)driver;
        this.wait    = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

   

  

    // ✅ Hover over one element then click another
    public void hoverAndClick(WebElement hover, WebElement click) {
        wait.until(ExpectedConditions.visibilityOf(hover));
        actions.moveToElement(hover).click(click).perform();
       
    }
    
    
    // Select from Dropdowns
    
    public void selectDropDown(WebElement element,String targetElement)
    {
    	Select select = new Select(element);
    	select.selectByVisibleText(targetElement);
    }

    // Iframes
    
    public void FrameSwitch(WebElement framename)
    {
    	wait.until(ExpectedConditions.visibilityOf(framename));
    	driver.switchTo().frame(framename);
    }
    
    public void backToDefault()
    {
    	driver.switchTo().defaultContent();
    }
    
    public void JavaScriptExe()
    {
    	
    	js.executeScript("window.scrollBy(0,500);");

    }
    
    
}