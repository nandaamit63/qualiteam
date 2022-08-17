package selenium.qualiteam;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class IRCTC {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
        ChromeOptions op = new ChromeOptions();
        //disable notification parameter
        op.addArguments("--disable-notifications");
        WebDriver d=new ChromeDriver(op);
        d.manage().window().maximize();
        d.navigate().to("https://www.irctc.co.in");
        Thread.sleep(8000);
        d.findElement(By.xpath("//button[@type='submit']")).click();
        d.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Hyd");
        d.findElement(By.xpath("//p-autocomplete[@id='origin']//ul//li//span[contains(text(),'HYDERABAD DECAN - HYB')]")).click();
        d.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Pune");
        d.findElement(By.xpath("//p-autocomplete[@id='destination']//ul//li//span[contains(text(),'PUNE JN - PUNE')]")).click();
            WebElement el = d.findElement(By.xpath("//p-calendar[@id='jDate']//input[@type='text']"));
            el.click();
            Thread.sleep(5000);
            d.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//tr[2]//td[6]")).click();
            Thread.sleep(5000);
            d.findElement(By.xpath("//span[contains(text(),'All Classes')]")).click();
    		List<WebElement> options = d.findElements(By.xpath("//p-dropdown[@id='journeyClass']//ul//li/span"));
    		for (WebElement option : options)
    		{
    			
    		    if (option.getText().equals("Sleeper (SL)"))
    		    {
    		        option.click(); // click the desired option
    		        break; }}
    		Thread.sleep(4000);
    		WebElement checkbox=d.findElement(By.id("concessionBooking"));
    		JavascriptExecutor executor = (JavascriptExecutor)d;
    		executor.executeScript("arguments[0].click();", checkbox);
    		d.findElement(By.xpath("//button[@type='button']//span/following-sibling::span")).click();
    		Thread.sleep(4000);
    		 d.findElement(By.xpath("//button[@label='Find Trains']")).click();
    	        Thread.sleep(5000);
    		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='hidden-xs']//span)[1]")));
    		//Verify & Display the number of trains available and names on console
            WebElement  elements=d.findElement(By.xpath("(//div[@class='hidden-xs']//span)[1]"));
            System.out.println(elements.getText());
            List<WebElement> T = d.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
            System.out.println("No. of Trains: " + T.size());
            for(int i = 0; i< T.size(); i++) {
               String s = T.get(i).getText(); 
               System.out.println("Available Train: " + s);
            }
            //Capture the results screenshot
            File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C:\\Users\\amit.nanda\\Documents\\Assignpic.png"));
            //Close the Application
            d.close();
}
}
