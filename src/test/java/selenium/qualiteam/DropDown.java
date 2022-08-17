package selenium.qualiteam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
	        Select s = new Select(d.findElement(By.id("mySelect")));
	        // getting the list of options in the dropdown with getOptions()
	        List <WebElement> op = s.getOptions();
	        int size = op.size();
	        for(int i =0; i<size ; i++){
	           String options = op.get(i).getText();
	           System.out.println(options);
	        }
	        d.quit();

	}

}
