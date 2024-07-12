package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chat {
	
	
	    public static void main(String[] args) {
	        // Specify the path to your chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();


	        // Navigate to the webpage with the calendar
	        driver.get("https://www.google.com");
	        String s = driver.getTitle();
	        System.out.println(s);
	        String s1 ="Google";
	        if(s1.equals(s)) {
	        	System.out.println("chrome browser");
	        }else {
	        	System.out.println("not a chrome browser");

	        }


	        // Navigate to the webpage with the calendar
	       // driver.get("https://.com//calendar-page");

	        // Find and click on the date input field or calendar trigger
	        		 // WebElement dateInput = driver.findElement(By.id("date-input"));
	        		 // dateInput.click();

	        // Assuming the calendar is a pop-up or a dropdown, locate and interact with the specific date element
	        		 // WebElement dateElement = driver.findElement(By.xpath("//td[@data-date='2024-07-09']"));
	        		 // dateElement.click();

	        // Optionally, you can verify if the selected date is displayed or has been input into the correct field
	        		 // String selectedDate = dateInput.getAttribute("value");
	        		 // System.out.println("Selected date: " + selectedDate);

	        // Close the browser
	        driver.quit();
	    }
	}

