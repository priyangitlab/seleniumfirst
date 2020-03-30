package testtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Gloss {
	@Test
	public  void mainl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myhome.ie/");
		
		Thread.sleep(5000);
		
		
		//Advance filter
		WebElement ss=driver.findElement(By.id("sel_advanced_filters_button"));
		Thread.sleep(500);
		ss.click();
		
		WebElement country_DD=driver.findElement(By.id("sel_region_dropdown"));
		Thread.sleep(500);
		country_DD.click();
		
		String country_DD_value="Kerry";
		country_DD_value.trim();
		WebElement country_value_select=driver.findElement(By.xpath("//div[@class='MhDropdown__Dropdown dropdown-menu show']//self::div[@class='MhDropdown__Item']//self::div[text()='"+country_DD_value+" ']"));
		Thread.sleep(500);
		country_value_select.click();
		
		//Area Select
		Thread.sleep(15000);		
		WebElement area_DD=driver.findElement(By.xpath("//div[@class='MhSearchForm__Row mb-2']//button//span[text()='Areas']"));
		Thread.sleep(500);
		area_DD.click();

		Thread.sleep(500);
		String area_value="Abbeydorney";
		area_value.trim();
		WebElement areaad=driver.findElement(By.xpath("//div[@class='LocalitySelect__OptionsColumn']//div[text()='"+area_value+"']"));
		Thread.sleep(500);
		areaad.click();
		Thread.sleep(500);
		area_DD.click();
		
		//Min Bed DD
		WebElement minbed_DD=driver.findElement(By.xpath("//button[@class='dropdown-toggle MhFormElements__Button MhDropdown__Button MhDropdown__Button-- MhDropdown__Button--rounded' and @id='sel_min_beds_dropdown']"));
		Thread.sleep(500);
		minbed_DD.click();

		Thread.sleep(2500);
		String minbed_val="2";
		minbed_val.trim();
		WebElement minbed_value_select=driver.findElement(By.xpath("//div[@class='MhDropdown__Dropdown dropdown-menu show']//self::div[@class='MhDropdown__Item ng-star-inserted']//self::div[text()='"+minbed_val+" ']"));
		Thread.sleep(500);
		minbed_value_select.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//*		WebElement ss=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@id='cityCountyDropDown']"));
//		ss.click();
//		Thread.sleep(200);
//		String cc="Co. Louth";
//		cc.trim();
//		WebElement ss3=driver.findElement(By.xpath("//dd[@style='display: block;']//ul//li[text()='"+cc+"']"));
//		ss3.click();
//		
//		WebElement area=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@id='multi_title_container_a_id']"));
//		area.click();
//		Thread.sleep(200);
//		String cc1="Barna";
//		cc1.trim();
//		
//		WebElement ss4=driver.findElement(By.xpath("//div[@id='a_id' and @style='display: block;']//li[contains(.,'"+cc1+"')]"));
//		Thread.sleep(2000);
//		ss4.click();
//		
		
//		WebElement min=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@class='wrapper narrow left']//dl[@id='min_bed']"));
//		Thread.sleep(2000);
//		min.click();
//		
//		String mintext="2 bedrooms";
//		mintext.trim();
//		
//		WebElement minval=driver.findElement(By.xpath("//dd[@style='display: block;']//ul//li[text()='"+mintext+"']"));
//		Thread.sleep(500);
//		minval.click();
//		
//		
//		WebElement max=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@class='wrapper narrow right']//dl[@id='max_bed']"));
//		Thread.sleep(2000);
//		max.click();
//		
//		String maxtext="3 bedrooms";
//		maxtext.trim();
//		
//		WebElement maxval=driver.findElement(By.xpath("//dd[@style='display: block;']//ul//li[text()='"+maxtext+"']"));
//		Thread.sleep(500);
//		maxval.click();
		
//		WebElement prop=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@id='ptId_select']"));
//		Thread.sleep(2000);
//		prop.click();
//		
//		Thread.sleep(200);
//		String propval="Bungalow for sale";
//		propval.trim();
//		
//		WebElement propopt=driver.findElement(By.xpath("//div[@id='ptId' and @style='display: block;']//li[contains(.,'"+propval+"')]"));
//		Thread.sleep(2000);
//		propopt.click();
//		Thread.sleep(100);
//		prop.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> hh=driver.findElements(By.xpath("//dd[@style='display: block;']//ul//li"));
//		for(WebElement ff: hh)
//		{
//			Thread.sleep(100);		
//			if(ff.getAttribute("innerText").contains("Co. Wicklow"))
//			{
//			ff.click();
//			break;
//			}			
//		}
		
		
//		Thread.sleep(4000);
//		WebElement ss=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@id='cityCountyDropDown']"));
//		ss.click();
//		Thread.sleep(1000);
//		Actions h= new Actions(driver);
//		Thread.sleep(1000);
//		h.moveToElement(driver.findElement(By.xpath("//select[@id='cc_id_dropdown']//option[contains(text(),'Co. Cork')]")));
//		Thread.sleep(1000);
//		h.click();
		
		
		
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cc_id_dropdown']")));  
//		dropdown..selectByVisibleText("Co. Cork");
		
		
		//Thread.sleep(4000);
//		WebElement ss=driver.findElement(By.xpath("//div[@id='advanced-container']//div[@id='cityCountyDropDown']"));
//		ss.click();
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//	    WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("cc_id_dropdown")));
//	    passwordElement.click();
//	    
//	    
//		Select dropdown = new Select(passwordElement);  
//		dropdown.selectByVisibleText("Co. Cork");
//	    
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='cc_id_dropdown']//option[contains(text(),'Co. Cork')]")).click();
//		
		
		

//
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//				.withTimeout(30, TimeUnit.SECONDS) 			
//				.pollingEvery(5, TimeUnit.SECONDS) 			
//				.ignoring(NoSuchElementException.class);
//
//		WebElement clickseleniumlink = wait.until
//				(new Function<WebDriver, WebElement>()
//				{
//					public WebElement apply(WebDriver driver ) 
//					{
//						return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
//					}
//				});
//		//click on the selenium link
//		clickseleniumlink.click();
//		//close~ browser
//		driver.close() ;
		//
	}

}
