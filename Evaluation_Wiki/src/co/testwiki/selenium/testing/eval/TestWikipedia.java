package co.testwiki.selenium.testing.eval;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWikipedia {

WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			navigateCommands();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
			}
	
	
	public void navigateCommands() throws InterruptedException {
	
		
			driver.navigate().to("http://www.wikipedia.org");
			String expectedTitle = "wikipedia";		
			String expectedResults = "Next 20 results";
			String actualTitle = driver.getTitle();
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				 System.out.println("Title Matched");
				 else
				 System.out.println("Title didn't match !!!");
			Thread.sleep(4000);
			driver.findElement(By.id("searchInput")).sendKeys("furry rabbits");
			driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/button")).click();
			Thread.sleep(2000);
			Boolean sdy = driver.findElement(By.className("searchdidyoumean")).isDisplayed();
			if (sdy.TRUE)
			 System.out.println("'Did you mean' suggestion present");
			 else
			 System.out.println("There is no 'Did you mean' suggestion !!!");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[1]/a/em")).click();
			Thread.sleep(2000);
			String actualResults = driver.findElement(By.className("mw-nextlink")).getAttribute("title");
			if (actualResults.equalsIgnoreCase(expectedResults))
			 System.out.println("20 results displayed");
			 else
			 System.out.println("20 results not displayed !!!");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div/ul/li[1]/div[1]/a/span")).click();
			Thread.sleep(2000);
			String Pagetitle = driver.getTitle();
			if (Pagetitle.isEmpty())
			 System.out.println("The search Page has no title !!!");
			 else
			 System.out.println("The search page has a Title !!!!");
			Boolean Contents = driver.findElement(By.className("toctitle")).isDisplayed();
			if ( Contents.TRUE)
				 System.out.println("Contents Present");
			 else
			 System.out.println("Contents Not Present !!!");
			 Thread.sleep(3000);
			 driver.navigate().to("https://www.travelex.co.uk/");
			 Thread.sleep(3000);
			 Dimension d = new Dimension(500,500);
			 driver.manage().window().setSize(d);
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/button[1]")).click();
			 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/button[1]")).click();
			 Boolean thirdElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div[8]/h4")).isDisplayed();
			 if (thirdElement.TRUE)
				 System.out.println("Third ELement of Slider present");
			 else
			 System.out.println("Third Element of slider Not Present !!!");
				 

		}
			
	
	public static void main(String[] args) {
		
		TestWikipedia myObj = new TestWikipedia();
		myObj.invokeBrowser();
		
		

	}

}
