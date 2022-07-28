package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class swiggy {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("mobile")).sendKeys("7507987062");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	}
	@Test
	public void screen() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/swiggy1.png");
		FileUtils.copyFile(ram, dest);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
