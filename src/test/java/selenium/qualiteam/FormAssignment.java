package selenium.qualiteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormAssignment {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    WebDriver d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.get("http://www.uitestpractice.com/Students/Form");
		    WebElement firstname=d.findElement(By.id("firstname"));
		    firstname.sendKeys("Amit");
		    
		    System.out.println("First Name is "+ firstname.getAttribute("value"));
		    
		    WebElement lastname=d.findElement(By.id("lastname"));
		    lastname.sendKeys("Nanda");
		    lastname.getAttribute("value");
		    System.out.println("Last Name is "+ lastname.getAttribute("value"));

		    WebElement status=d.findElement(By.xpath("(//label[contains(text(), 'Martial Status')]//following-sibling::label/input[@type='radio'])[2]"));
		    status.click();
		    
		    
		    WebElement hobbies=d.findElement(By.xpath("(//label[contains(text(), 'Hobby')]//following-sibling::label/input[@type='checkbox'])[2]"));
		    hobbies.click();
		    
		    WebElement element=d.findElement(By.id("sel1"));
	        Select select=new Select(element);
	        select.selectByVisibleText("India");

		    WebElement dob=d.findElement(By.id("datepicker"));
		    dob.sendKeys("09/16/1992");
		    
		    WebElement phonenumber=d.findElement(By.id("phonenumber"));
		    phonenumber.sendKeys("123");
		    
		    WebElement username=d.findElement(By.id("username"));
		    username.sendKeys("ABC");
		    
		    WebElement email=d.findElement(By.id("email"));
		    email.sendKeys("test");
		    
		    WebElement comment=d.findElement(By.id("comment"));
		    comment.sendKeys("test");
		    
		   WebElement pwd=d.findElement(By.id("pwd"));
		    phonenumber.sendKeys("test");
		    
		    d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		    d.close();
	}

}
