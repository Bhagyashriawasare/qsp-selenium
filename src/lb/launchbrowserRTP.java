package lb;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowserRTP {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name,Chrome or Firefox");
		String browser = sc.nextLine();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   Thread.sleep(5000);
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("type valid input");
		}
		

	}

}
