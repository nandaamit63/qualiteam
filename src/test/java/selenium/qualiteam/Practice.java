package selenium.qualiteam;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        //Drag And Drop
        WebElement draggable= d.findElement(By.id("draggable"));
        WebElement droppablde= d.findElement(By.id("droppable"));
        Actions action= new Actions(d);
        action.dragAndDrop(draggable, droppablde).build().perform();
	//	d.get("http://www.uitestpractice.com/Students/Actions");
		// d.get("https://www.deltadental.com/");
	//	d.get("http://www.uitestpractice.com/Students/Switchto");
	//	 d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		//Screenshot
	/*	File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\amit.nanda\\Documents\\Assignpic.png")); */
	//	Implicit Wait
	/*	d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Implit Wait is implemented"); */
/*		WebDriverWait wait= new WebDriverWait(d,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("For dentists")));
		System.out.println("Explicit Wait is implemented");*/
/*		WebElement element= d.findElement(By.id("mySelect"));
		element.click();
		List <WebElement> options= d.findElements(By.xpath("//select[@id='mySelect']/option"));
		for(WebElement numbers: options)
		{
			System.out.println("Name is"+ numbers.getText());
		}  */
		/* d.switchTo().frame("iframe_a");
		 WebElement element= d.findElement(By.id("name"));
		 element.sendKeys("ABC");
		 d.switchTo().defaultContent();
		 d.findElement(By.id("alert")).click();
		 d.close();*/
//		Alert Handling
/*		d.findElement(By.id("alert")).click();
		Alert alert=d.switchTo().alert();
		String message=alert.getText();
		System.out.println("Alert Text "+ message);
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		alert.accept(); */
		
		d.close();
		

	}

}
