package resources;


import java.io.IOException;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public WebDriver InitializeDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//yantra//Desktop//Selenium//Chrome driver//chromedriver.exe");
		driver = new ChromeDriver();		
		
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
    return driver;
		
	}
 
}