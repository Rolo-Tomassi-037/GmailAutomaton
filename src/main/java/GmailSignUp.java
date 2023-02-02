import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailSignUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp");
		try {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//Click on Get Gmail button
			//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
			//Thread.sleep(2000);
			//Page 1
			System.out.println("Page 1\n----\n");
			//Add First name
			driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("New");
			System.out.println("Added First Name");
			//Add Last Name
			driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("User");
			System.out.println("Added Last Name");
			//Add userName
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("NewUserSelenium");
			System.out.println("Added User Name");
			//Password
			driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("firedancer");
			System.out.println("Added Password");
			//Confirm Password
			driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("firedancer");
			System.out.println("Confirmed Password");
			//Click Next
			driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
			System.out.println("Click next");
			////*[@id="phoneNumberId"]
			//Page 2
			System.out.println("Page 2\n-----\n");
			Thread.sleep(5000);
			//Add Phone Number
			driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("8742007081");
			System.out.println("Add Number");
			//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div[2]/div[1]/label/input")).sendKeys("8742007081");
			//Click Next
			driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
			System.out.println("Click next");
			//Page 3
			System.out.println("Page 3\n----\n");
			//Wait for User to Enter OTP (10 sec) then click Verify
			Thread.sleep(10000);
			//Click Verify
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
			System.out.println("Click Verify");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			//driver.quit();
		}

	}

}
