package youtube_auto;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;









public class processfac {
	

objectrep O;
	
	
	public void play(WebDriver wd1) throws Exception
			{
		wd1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		objectrep O = PageFactory.initElements(wd1, objectrep.class);
		
		int flag,min_num=0;
		exc_read E_R = new exc_read();
		XSSFSheet sh = E_R.ex_load("C:\\Users\\varunp\\Desktop\\playlist.xlsx");
		XSSFCell un;
		
		for(int i=0; i<=sh.getLastRowNum();i++)     
			//to point the last row in sheet                  
			{
			
			flag=0;
				//Thread.sleep(10000);
				un=sh.getRow(i).getCell(0);                    
								
				
				String t=un.toString();
				System.out.println(t);
				
				O.search_bar.sendKeys(t);
				O.search_bar.sendKeys(Keys.RETURN);
				
				WebDriverWait wait_vid = new WebDriverWait(wd1, 30);
				wait_vid.until(ExpectedConditions.visibilityOf(O.video_length));
				
				String s1=O.video_length.getText();
				
				System.out.println(s1);
				O.vid_click.click();
				
				//Thread.sleep(5000);
				O.search_bar.clear();
				
			//	WebElement skip_ad = wd1.findElement(By.className("ytp-ad-image"));
				
				try
					{
					if(O.ad_img.isDisplayed())
					{
					
					System.out.println("B T");
						Thread.sleep(5000);
					System.out.println("A T");
					
					JavascriptExecutor JS = (JavascriptExecutor)wd1;
					/*WebElement skip_ad =*/ O.skip_ad.click();
					 
					//wd1.findElement(By.className("ytp-ad-text")).click();
					
					//JS.executeScript("arguments[0].click();", skip_ad);
					//JS.executeScript("document.getElementsByClassName('ytp-ad-text ytp-ad-skip-button-text').click();");
					
					
					//	wd1.findElement(By.cssSelector("css=button.ytp-ad-text ytp-ad-skip-button-text"));
						
					
					}

					
					}catch(org.openqa.selenium.NoSuchElementException e)
						{
						System.out.println(s1);
						}
				
				
								
				
				

				char[] ch1 = s1.toCharArray();
				
				for(int j = 0; j < s1.length();j++)
					{
					
					if(ch1[j] == ':')
						{
						flag=j;
						break;
						}
					
					min_num = Character.getNumericValue(ch1[j]);
					
					System.out.println(min_num);

					}
				System.out.println(flag);
				int sec_num_tens= Character.getNumericValue(ch1[flag+1]);
				int sec_num_units=Character.getNumericValue(ch1[flag+2]);
				
				System.out.println(sec_num_tens+"   "+ sec_num_units);
				
				int tot_timewait = (min_num*60) + (sec_num_tens*10) + (sec_num_units);
				System.out.println(tot_timewait);
				Thread.sleep(tot_timewait*1000);
				
				
				
			}
		
		
			}
	
	
}
