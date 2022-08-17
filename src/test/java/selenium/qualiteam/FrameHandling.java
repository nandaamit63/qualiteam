package selenium.qualiteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("http://www.uitestpractice.com/Students/Switchto");
	        d.switchTo().frame("iframe_a");        
	        d.findElement(By.id("name")).sendKeys("Selenium");
	        d.switchTo().defaultContent();
	        d.findElement(By.id("alert")).click();

	}

}
