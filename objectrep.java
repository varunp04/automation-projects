package youtube_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class objectrep {
	
	
	public static WebDriver wd;
	
	
	
	
	public objectrep(WebDriver w) {
		// TODO Auto-generated constructor stub
		
		this.wd = w;
		
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

	
	
	@FindBy(name = "search_query")
	public WebElement search_bar;
	
	
	
	@FindBy(how = How.XPATH  ,using = "//*[@id='overlays']/ytd-thumbnail-overlay-time-status-renderer/span")
	public WebElement video_length;
	
	
	
	@FindBy(id = "video-title")
	public WebElement vid_click;
	
	@FindBy(id = "ytp-ad-image")
	public  WebElement ad_img;
	
	
	@FindBy(id = "/div/div/div/div/div/span/button")
	public WebElement skip_ad;
	
	
	
	
}
