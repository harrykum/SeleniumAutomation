package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGet2 {

	static  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.com/");
driver.navigate().to("https://gmail.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.quit();
	}

}
