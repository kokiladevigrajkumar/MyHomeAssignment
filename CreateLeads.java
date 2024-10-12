package myhomeassignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager"); //Enter user name
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa"); //Enter password
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click(); //Click on login button
		
		WebElement linkCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		linkCRMSFA.click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement createLeadsButton = driver.findElement(By.partialLinkText("Create"));
		createLeadsButton.click();
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Kokiladevi");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Gopalakrishnan");
		
		WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
		compName.sendKeys("TestLeaf");
		
		WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title.sendKeys("AutomationTesting");
		
		WebElement creatLead = driver.findElement(By.name("submitButton"));
		creatLead.click();
		
		String exptitle = driver.getCurrentUrl(); //returns the current url
		System.out.println("the current url is: "+exptitle);
		
		String acttitle = driver.getTitle();// returns the title of the page
		System.out.println("the title of the web page is: "+acttitle);
		
		// verification or validation of the webpage
		if(acttitle.contains("Lead"))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		 Thread.sleep(10000);
		
		driver.close();//close the browser
	
	}

}
