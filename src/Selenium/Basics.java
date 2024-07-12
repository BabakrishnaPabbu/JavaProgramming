package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static  void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.opencart.com/index.php?route=cms/demo");
	       String s= driver.getTitle();
	       System.out.println(s);
	       if(s.equals("OpenCart - Demo") ){
	    	   System.out.println("correct title");
	       }else{
	    	   System.out.println("wrong title");
	       }
	       driver.manage().window().maximize();
	       
	       List<WebElement> aa= driver.findElements(By.tagName("a"));
	     
	    System.out.println(aa.size());
	    for(int i=0;i<aa.size();i++) {
	    	System.out.println(aa.get(i));
	    }
	     
	        driver.quit();
	}

}
