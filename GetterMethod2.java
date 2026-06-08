package initial_days;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethod2 {
private static WebDriver drive;

public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("http://facebook.com/");
			
			String title=driver.getTitle();
			System.out.println(title);
			
			String url =driver.getCurrentUrl();
			System.out.println(url);
			
			String SourceCode= driver.getPageSource();
			System.out.println(SourceCode);
			
			//driver.close();
			
	//Size
			Dimension dim= driver.manage().window().getSize();
			System.out.println(dim);
			
			driver.manage().window().setSize(new Dimension(700,800));
			
	//location
			Point pt=driver.manage().window().getPosition();
			System.out.println(pt);
			
			driver.manage().window().setPosition(new Point(10,10));
			System.out.println(pt);
			
			Thread.sleep(8000);
			driver.quit();
}
}
