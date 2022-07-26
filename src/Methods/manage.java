package Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class manage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\BhagyashriEclipse\\auto\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point p=new Point(100,600);
		driver.manage().window().setPosition(p);


	}

}
