package selenium.qualiteam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shoppingproject {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("https://www.pepperfry.com/");
        Thread.sleep(8000);
        String title=d.getTitle();
        if(title.contains("Online Furniture Shopping Store"))
        {
        	  System.out.println(title);
        }
        
        Thread.sleep(10);
        WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='regPopUp']/a")));
        d.findElement(By.xpath("//div[@id='regPopUp']/a")).click();
        WebElement element=d.findElement(By.linkText("Furniture"));
        Actions action=new Actions(d);
        action.moveToElement(element).build().perform();
			Thread.sleep(4000);
        WebElement element2=d.findElement(By.linkText("Seating"));
        Actions action2=new Actions(d);
        action2.moveToElement(element2).build().perform();
        d.findElement(By.linkText("Benches")).click();
        List<WebElement> T = d.findElements(By.cssSelector("#page-wrapper-content ul > li a > div > div.cat-wrap-ttl > h5"));
        System.out.println("No. of Benches: " + T.size());
        for(int i = 0; i< T.size(); i++) {
           String s = T.get(i).getText(); 
           System.out.println("Available Products: " + s);
        }
        WebElement t1= d.findElement(By.cssSelector("#page-wrapper-content ul > li:nth-child(6) > a > div > div.cat-wrap-ttl > p"));
         String number= t1.getText().split(" ")[0];
         if(Integer.parseInt(number)  > 1)
         {
         System.out.println("Number of industrial benches are more than one "+number);
         }
	}

}
