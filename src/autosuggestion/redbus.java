package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class redbus {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void help()
	{
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='modalCloseSmall']")).click();
	}
    public void facebook()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		driver.findElement(By.xpath("//span[@class='twittericon icon-Twitter']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-12181gd r-1pi2tsx r-1ny4l3l r-o7ynqc r-6416eg r-13qz1uu'])[1]")).click();
	}
	@AfterMethod
	public void closeapp()
	{
		//driver.close();
	}

}
