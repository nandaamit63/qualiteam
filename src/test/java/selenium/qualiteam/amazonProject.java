package selenium.qualiteam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonProject {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
     d.manage().window().maximize();
     d.navigate().to("https://www.amazon.com/");
     String title=d.getTitle();
     System.out.println(title);
     d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
     d.findElement(By.id("nav-search-submit-button")).click();
     WebElement element = d.findElement(By.id("s-result-sort-select"));
     //element.click();
     Select s = new Select(element);
     List<WebElement> li = s.getOptions();
     //int listCount=li.size();
     s.selectByVisibleText("Newest Arrivals");
     WebElement expectedtitle = d.findElement(By.xpath("//span[text()='Newest Arrivals']"));
     Boolean result=expectedtitle.isDisplayed();
     System.out.println(result);
     if(result==true)
     {
         System.out.println("Newest Arrivals option is displayed");
     }
     else
     {
         System.out.println("Newest Arrivals option is not displayed");
     }

 }
}
    
  
