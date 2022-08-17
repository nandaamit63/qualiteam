package selenium.qualiteam;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class triviago {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("https://www.trivago.in/");
        Thread.sleep(8000);
        d.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
        Thread.sleep(8000);
        d.findElement(By.xpath("(//span[@data-testid='suggestion-title'])[1]")).click();
		WebDriverWait wait2=new WebDriverWait(d, Duration.ofSeconds(30));
	    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//time[@datetime='2022-08-27']/button/span")));
		WebElement checkbox1=d.findElement(By.xpath("//time[@datetime='2022-08-27']/button/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor)d;
		executor1.executeScript("arguments[0].click();", checkbox1);
		d.findElement(By.xpath("//button[@data-testid='calendar-button-close']")).click();
		WebDriverWait wait3=new WebDriverWait(d, Duration.ofSeconds(30));
	    wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='guest-selector']")));
    	WebElement checkbox3=d.findElement(By.xpath("//button[@data-testid='guest-selector']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)d;
		executor3.executeScript("arguments[0].click();", checkbox3);
		Thread.sleep(5000);
		WebElement element4=d.findElement(By.xpath("//input[@data-testid='adults-amount']"));
		//d.findElement(By.id("number-input-72")).sendKeys("1");
		JavascriptExecutor executor4 = (JavascriptExecutor)d;
		executor4.executeScript("arguments[0].click();", element4);
		element4.clear();
		executor4.executeScript("arguments[0].value='1';", element4);
		d.findElement(By.xpath("//button[@data-testid='guest-selector-apply']/span")).click();
		Thread.sleep(8000);
		WebDriverWait wait4=new WebDriverWait(d, Duration.ofSeconds(70));
	    wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='search-button']")));
		WebElement element5= d.findElement(By.id("sorting-selector"));
		Select dropdown1= new Select(element5);
		dropdown1.selectByVisibleText("Rating only");
		Thread.sleep(8000);
		List <WebElement> options= d.findElements(By.xpath("//span[@class='font-bold mr-1 text-l']"));
		for(WebElement numbers: options)
		{
			System.out.println("List of rent of hotel display "+ numbers.getText());
		} 
		List<WebElement> priceElements = d.findElements(By.xpath("//span[@class='space-x-1 flex text-m']/span"));
		int n = priceElements.size();
		Float[] priceArray = new Float[n];
		Float[] priceArrayCopy = new Float[n];
		for(int i=0;i<n;i++) {
		priceArray[i] = Float.parseFloat(priceElements.get(i).getText());
		priceArrayCopy[i] = Float.parseFloat(priceElements.get(i).getText());
		}
		Arrays.sort(priceArray);
		Assert.assertTrue(Arrays.equals(priceArray, priceArrayCopy));
	}
}
