import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitpractice {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5));
			driver.get("https://jqueryui.com/selectable/");
		   WebElement t = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//a[text()='Download']"));
                        		     
}
		   });
		   
		   t.click();
		   driver.quit();
}
}