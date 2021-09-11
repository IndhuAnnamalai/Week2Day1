package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String string = driver.getTitle();
		System.out.println("Title is:" +string);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		
		loginButton.click();
		
		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhumathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Annamalai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Indhu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Annamalai");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/02/86");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("IndhuProfile");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("60,00,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AABBCC");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing with java");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9940134454");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("212");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Indhu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("indhu.02@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Indhumathi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Indhu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.4,Third main road,Anna nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pammal,Chennai");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600075");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
	}

}
