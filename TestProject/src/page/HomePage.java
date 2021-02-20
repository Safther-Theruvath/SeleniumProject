package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement showMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeBtn;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement slide;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement arrow;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;
	
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival2;
	
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;
	
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	WebElement descriptionTab;

	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement reviewsTab;
	
	public HomePage()
	{
		init();
		PageFactory.initElements(driver,this);
	}
	
	public void clickShowMenu() throws InterruptedException
	{
		showMenu.click();
		Thread.sleep(1000);
	}
	
	public void clickHomeBtn() throws InterruptedException
	{
		homeBtn.click();
		Thread.sleep(1000);
		
	}
	
	public void slider() throws InterruptedException
	{
		slide.click();
		arrow.click();
		Thread.sleep(2000);
		arrow.click();
		Thread.sleep(2000);
		arrow.click();
		
		if(slide.isDisplayed())
		{
			System.out.println("There are three slides");
		}
	}
	
	public void arrivals()
	{
		if(arrival.isDisplayed() && arrival1.isDisplayed() &&arrival2.isDisplayed())
		{
			System.out.println("Three Arrivals");
		}
		
	}
	
	public void checkNavigation() throws InterruptedException
	{
		arrival.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival1.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		arrival2.click();
		Thread.sleep(1000);
		
	     addToBasket.click();
		Thread.sleep(1000);
	}
		
		public void clickDescriptionTab()
			{
				descriptionTab.click();
				
			}
			
			public void clickReviewsTab()
			{
				reviewsTab.click();
				
			}
			
}

		
			
			
			
			
			
		
	
	
	

