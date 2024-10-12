package myhomeassignement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement userName = driver.findElement(By.id("username"));//identified the webelement using id
		userName.sendKeys("DemoSalesManager"); //Enter user name
		
		WebElement password = driver.findElement(By.id("password"));//identified the webelement using id
		password.sendKeys("crmsfa"); //Enter password
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));//identified the webelement using class name
		loginButton.click(); //Click on login button
		
		WebElement linkCRMSFA = driver.findElement(By.linkText("CRM/SFA"));//identifined the webelement using linktext
		linkCRMSFA.click();//click the CRM/SFA link
		
		WebElement accTab = driver.findElement(By.linkText("Accounts"));//identifined the webelement using linktext
		accTab.click();//click on the account tab
		
		WebElement createAccButton = driver.findElement(By.partialLinkText("Create"));//identifined the webelement using partial linktext
		createAccButton.click();//click on the create account button
		
		WebElement accName = driver.findElement(By.id("accountName"));//identified the webelement using id
		accName.sendKeys("perumal");//enter account name
		
		boolean flag = accName.isDisplayed();//verifying account name using isdisplayed method
		System.out.println("the account name is displayed correctly: "+flag);
		
		WebElement discription = driver.findElement(By.tagName("textarea"));//identified the webelement using tagname
		discription.sendKeys("Selenium Automation Tester");//enter discription
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));//identified dropdown web element by name
		Select obj = new Select(industryDD);//create obj for select class
		obj.selectByIndex(2);//select by index
		
		WebElement ownershipDD = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));//identified dropdown web element by xpath
		Select obj1 = new Select(ownershipDD);//create obj for select class
		obj1.selectByVisibleText("S-Corporation");//select by visibility text
		
		WebElement source = driver.findElement(By.id("dataSourceId"));//identified dropdown web element by id
		Select obj2 = new Select(source);//create obj for select class
		obj2.selectByValue("LEAD_EMPLOYEE");//select by value
		
	
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));//identified dropdown web element by id
		Select obj3 = new Select(marketingCampaign);//create obj for select class
		obj3.selectByIndex(6);//select by index
		
		WebElement state_Province = driver.findElement(By.id("generalStateProvinceGeoId"));//identified dropdown web element by id
		Select obj4 = new Select(state_Province);//create obj for select class
		obj4.selectByValue("TX");//select by value
		
		WebElement createAccClick = driver.findElement(By.className("smallSubmit"));//identified the webelement by class name
		createAccClick.click();//perform click action
		
		driver.close();//close the browser
	}

}



