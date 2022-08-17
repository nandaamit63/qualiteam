package selenium.qualiteam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
 d.manage().window().maximize();
 d.navigate().to("https://www.amazon.com/");
 String title=d.getTitle();
      System.out.println(title);
           d.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile smartphones under 30000");
           d.findElement(By.id("nav-search-submit-button")).click();
     //element.click();
	//	WebElement dropdown = d.findElement(By.id("s-result-sort-select"));
	//	dropdown.click(); // assuming you have to click the "dropdown" to open it
     d.findElement(By.xpath("//span[text()='Featured']")).click();
		List<WebElement> options = d.findElements(By.xpath("//div[@id='a-popover-2']//ul//li//a"));
		for (WebElement option : options)
		{
			System.out.println("Name is "+ option.getText());
		    if (option.getText().equals("Newest Arrivals"))
		    {
		        option.click(); // click the desired option
		        break;
		    }

	}

}
}
