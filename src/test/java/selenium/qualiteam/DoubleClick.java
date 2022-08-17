package selenium.qualiteam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        WebDriver d=new EdgeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        WebElement draggableicn=d.findElement(By.id("draggable"));
        WebElement droppableicn=d.findElement(By.id("droppable"));
        Actions action=new Actions(d);
        action.dragAndDrop(draggableicn, droppableicn).build().perform();
        System.out.println("Drag N Drop is performed");
        
	}

}
