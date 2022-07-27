package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbuslogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
		//driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[7]")).click();
		driver.switchTo().defaultContent();
		driver.close();

	}

}
