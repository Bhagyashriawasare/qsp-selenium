package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class google {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void search() throws InterruptedException
	{
	   driver.findElement(By.name("q")).sendKeys("earth");
	   Thread.sleep(2000);
	   List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='erkvQe'])[1]"));	
	   System.out.println(list.size());
	   for(WebElement b:list)
	   {
		   System.out.println(b.getText());
	   }
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	

}
