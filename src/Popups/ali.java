package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ali {
     public WebDriver driver;
     @BeforeMethod
     public void openApp()
     {
    	System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.aliexpress.com/");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     @Test
     public void aliexp() throws InterruptedException
     {
        
  		driver.findElement(By.xpath("//div[@class='Sk1_X _1-SOk']")).click();
  		WebElement dd = driver.findElement(By.id("search-dropdown-box"));
  	    Select s=new Select(dd);
  	    s.selectByIndex(5);
  	    s.selectByValue("21");
  	    s.selectByVisibleText("Security & Protection");
  	    
     }
    @AfterMethod
    public void closeApp()
    {
    	driver.quit();
    }
	

}
