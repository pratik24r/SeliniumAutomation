package Employee.info.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Employees {
	WebDriver driver;
	@Test
	public void launch() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome-linux64\\chrome-linux64\\chromrdriver.exe");)
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8181/azure-employee-2.2-SNAPSHOT/");
	
	}
	
	@Test
	public void user_name() {

	    driver.findElement(By.id("user_input")).sendKeys("pratik rathi");

	    driver.findElement(By.id("add_input")).sendKeys("pune");

	    driver.findElement(By.id("age_input")).sendKeys("25");

	    driver.findElement(By.id("quli_input")).sendKeys("BCCA");

	    driver.findElement(By.id("jd_input")).sendKeys("27");

	    driver.findElement(By.xpath("/html/body/div[2]/input")).click();

	}
}
