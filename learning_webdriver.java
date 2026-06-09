package initial_days;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_webdriver{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://amezon.com/");
		
		driver.navigate().to("http://x.com/");
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		String xUrl ="http://github.com/";
		URL url=new URL(xUrl);
		driver.navigate().to(url);
		
		driver.quit();
		
	}
	
	
}
