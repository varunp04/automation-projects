package youtube_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class letsplay {

	public static WebDriver w;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		browserfac B_f = new browserfac();
		
		w=B_f.open_url("https://www.youtube.com/",w);
		
		
		System.out.println("PLAYd:"+w);
		
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		processfac P= new processfac();
		
		P.play(w);
		
		w.quit();

	}

}
