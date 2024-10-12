package myhomeassignement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();//invokes the browser
		driver.manage().window().maximize();//maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		
		WebElement createAccButton = driver.findElement(By.partialLinkText("Create"));
		createAccButton.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Kumaran");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Rajkumar");
		
		WebElement phoneNumber = driver.findElement(By.name("reg_email__"));
		phoneNumber.sendKeys("7305952610");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Kumaran@2025");
		
		WebElement date = driver.findElement(By.id("day"));
		Select obj = new Select(date);
		obj.selectByValue("22");
		
		WebElement month = driver.findElement(By.id("month"));
		Select obj1 = new Select(month);		
		obj1.selectByValue("11");
		
		WebElement year  = driver.findElement(By.id("year"));
		Select obj2 = new Select(year);
		obj2.selectByValue("2020");
		
		WebElement sex  = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		sex.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
