package Employee.info.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Employees {
	
	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
	}
	
	@Test
	public void test1() {
		System.out.println("this is testcase1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is testcase2");
	}
	
	@Test
	public void test3() {
		System.out.println("this is testcase3");
	}
}
