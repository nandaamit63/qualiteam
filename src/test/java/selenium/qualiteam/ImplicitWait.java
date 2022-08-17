package selenium.qualiteam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    WebDriver d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.get("https://www.deltadental.com/");
		    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    System.out.println("Implicit wait is implemented");

	}

}
