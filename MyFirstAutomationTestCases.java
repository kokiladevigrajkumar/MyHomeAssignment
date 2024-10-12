package myhomeassignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationTestCases {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver is a class, driver is a object, new ChromeDriver is a constructor, which invokes the browser.
		// this line of code invokes(open a empty browser page) the specific Chrome browser ()
		ChromeDriver driver=new ChromeDriver();
		
		//an other of invoking(open a empty browser page) the browser which is come/general for all browser
		//WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.get method is used to get the url and open it in the browser.
		driver.get("http://leaftaps.com/opentaps/");
		
		//this is one way of statement to find the WebElement and pass the input to check.
		//after finding element should check the web element by giving some input.
		//sendKeys("") method used to get input text from the tester in the text box.

		//driver.findElement(By.id("username")).sendKeys("kokiladevi"); 
		
		//this WebElement is a datatype userName is variable that stores the WebElement.
		// this is another way of statement to find and store the WebElement then pass inputdata to check.
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager"); //Enter user name
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa"); //Enter password
		
		//since it is a button type here only action takes place instead of passing some inputdata to check.
		//here click() method is used for button type WebElements
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click(); //Click on login button
		
		WebElement linkCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		linkCRMSFA.click();
		
		WebElement accTab = driver.findElement(By.linkText("Accounts"));
		accTab.click();
		
		WebElement createAccButton = driver.findElement(By.partialLinkText("Create"));
		createAccButton.click();
		
		WebElement accName = driver.findElement(By.id("accountName"));
		accName.sendKeys("NRIAccount");
		
		//driver.findElements(By.tagName("a"));
		
		//WebElement discription = driver.findElement(By.name("discription"));
		//discription.sendKeys("Selenium Automation Tester");
		
		//The tagName() locator in Selenium is used to identify elements using tag names like <div>, <table>, <h1>, and so on.
		//It is particularly useful when attribute values such as id, class, or name are unavailable.
		//Since the id, name, or class locators are not working for this test case i have tried the tagName() locator.
		WebElement discription = driver.findElement(By.tagName("textarea"));
		discription.sendKeys("Selenium Automation Tester");
		
		WebElement noOfEmp = driver.findElement(By.id("numberEmployees"));
		noOfEmp.sendKeys("5"); //CreateAccount9 (11965) - output
		
		//WebElement noOfEmp = driver.findElement(By.name("numberEmployees"));
		//noOfEmp.sendKeys("5");
		
		WebElement siteName = driver.findElement(By.id("officeSiteName"));
		siteName.sendKeys("LeafTaps");
		
		//WebElement noOfEmp = driver.findElement(By.tagName("input"));
		//noOfEmp.sendKeys("5"); //CreateAccount10 (11966) - output
		
		//driver.navigate().to("http://leaftaps.com");
		//Thread.sleep(100000);
		//driver.navigate().back();
		//Xpath is address of a WebElement
		
		WebElement createAcc = driver.findElement(By.className("smallSubmit"));
		createAcc.click();
		
		String exptitle = driver.getCurrentUrl(); //returns the current url
		System.out.println("the current url is: "+exptitle);
		
		String acttitle = driver.getTitle();// returns the title of the page
		System.out.println("the title of the web page is: "+acttitle);
		
		// verification or validation of the webpage
		if(acttitle.contains("Account"))
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
