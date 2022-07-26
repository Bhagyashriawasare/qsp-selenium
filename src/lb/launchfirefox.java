package lb;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\BhagyashriEclipse\\auto\\drivers\\geckodriver.exe");
		new FirefoxDriver();

	}

}
