package youtube_auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserfac {
	
	
	public WebDriver open_url(String url,WebDriver wd1)
		{
			System.setProperty("webdriver.chrome.driver","G:\\CP-SAT\\Chromedriver\\chromedriver.exe" );
			wd1= new ChromeDriver();
		
			wd1.get(url);
			
			return wd1;
		}
	
	 
}
