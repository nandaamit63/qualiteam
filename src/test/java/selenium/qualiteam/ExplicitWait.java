package selenium.qualiteam;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    WebDriver d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.get("https://www.deltadental.com/");
		    //WebElement element=d.findElement(By.linkText("For dentists"));
		    WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("For dentists")));
		    System.out.println("ExplicitWait is implemented");

	}

}
