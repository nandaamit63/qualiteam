package selenium.qualiteam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        WebDriver d=new EdgeDriver();
        d.manage().window().maximize();
        d.get("http://www.uitestpractice.com/students/switchto");
        d.findElement(By.id("confirm")).click();
        Alert alert=d.switchTo().alert();
        //System.out.println(alert.getText());
        String alertmsg=alert.getText();
        System.out.println(alertmsg);
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        alert.accept();//ok
        //alert.dismiss();//cancel


	}

}
