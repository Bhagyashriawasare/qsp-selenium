package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\BhagyashriEclipse\\auto\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension d=new Dimension(500,200);
		driver.manage().window().setSize(d);
	}

}
