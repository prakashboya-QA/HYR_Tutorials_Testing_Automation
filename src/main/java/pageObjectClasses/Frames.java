package pageObjectClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilites.ReusableUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames  {
	 
	private ReusableUtil reusableUtil;
	private WebDriverWait wait;
	
	private @FindBy(xpath = "//a[text()='Selenium Practice']")
	WebElement SeleniumPractice;
	
	private @FindBy(xpath = "//a[.='Frames Practice']")
	WebElement FramesPractice;

	private @FindBy(id = "name")
	WebElement textid ;
	
	private @FindBy(id = "course")
	WebElement Courceid ;
	
	private @FindBy(id = "frm1")
	WebElement frame1 ;
	
	private @FindBy(id = "frm2")
	WebElement frame2;
	
	private @FindBy(id = "frm3")
	WebElement frame3;
	
	private @FindBy(id = "firstName")
	WebElement frame2Fname;
	


	public Frames (WebDriver driver)
	{
		this.reusableUtil = new ReusableUtil(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateToFramesPractice() {
		reusableUtil.hoverAndClick(SeleniumPractice, FramesPractice);
    }
	
	public void EnterText(String input)
	{
		textid.sendKeys(input);
	}
	
	public void dropdownValue(String targetElement)
	{
		reusableUtil.selectDropDown(Courceid, targetElement);
		
	}
	
	public void framehandling1()
	{
		reusableUtil.FrameSwitch(frame1);
	}
	
	public void framehandling2()
	{
		reusableUtil.FrameSwitch(frame2);
	}
	
	public void framehandling3()
	{
		reusableUtil.FrameSwitch(frame3);
	}
	
	public void DefaultFrame()
	{
		reusableUtil.backToDefault();
	}
	
	public void Clear()
	{
		textid.clear();
	}
	
	public void Scroll()
	{
		reusableUtil.JavaScriptExe();
	}
	
	public void Frame2Fname(String input)
	{
		wait.until(ExpectedConditions.visibilityOf(frame2Fname));
		frame2Fname.sendKeys(input);
	}
	
	
	public void ParentFrame()
	{
		reusableUtil.backToParent();
	}
	
}


