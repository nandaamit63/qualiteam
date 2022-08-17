package selenium.qualiteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        WebElement doubleClickbtn =d.findElement(By.xpath("//button[@name='dblClick']"));
        doubleClickbtn.click();
        Actions action=new Actions(d);
        action.doubleClick(doubleClickbtn).build().perform();
        System.out.println("Double Click is performed");

	}

}
