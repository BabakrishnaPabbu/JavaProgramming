package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
	@BeforeSuite
	public void Appstart() {
		System.out.println("Appstart");
	}
	
	@BeforeClass
	public void browserlaunch() {
		System.out.println("chrome");
	}
	@BeforeTest
	public void url() {
		System.out.println("google");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@Test
	public void testtitle() {
		System.out.println("gettitle");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterTest
	public void deletecookies() {
		System.out.println("cookies");
	}
	@AfterClass
	public void quit() {
		System.out.println("quit");
	}
	@AfterSuite
	public void AppEnd() {
		System.out.println("Append");
	}
	
}
