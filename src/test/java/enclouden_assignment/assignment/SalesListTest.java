package enclouden_assignment.assignment;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class SalesListTest extends base {
	
public WebDriver driver;
	



@BeforeTest
public void InitiateDriver() throws IOException {
	driver = InitializeDriver();
	
}
	@Test 
	public void BasePageNavigation() throws IOException, InterruptedException, ParseException {
		driver.get("https://sso.eservices.jud.ct.gov/foreclosures/Public/PendPostbyTownList.aspx"); 
		String winHandleBefore = driver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		Actions newwin = new Actions(driver);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date fromDate = new Date();
		Calendar c=Calendar.getInstance();
	    c.setTime(fromDate);
	    c.add(Calendar.DATE,7);
		
	    if
		(driver.findElements(By.linkText("Milford")).size() != 0) {
		WebElement link1 = driver.findElement(By.linkText("Milford"));
		
		newwin.keyDown(Keys.SHIFT).click(link1).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		
		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		
		String Date_of_sale = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
		System.out.println("Date_of_sale for New Milford is" +Date_of_sale);
		String[] Date1 = Date_of_sale.split("\n");
		//System.out.println(Date1[0]);
		
        Date toDate1 = sdf.parse(Date1[0]); 
       
        if(c.getTime().compareTo(toDate1)<0){
        	System.out.println("It's more than 7 days.");
        }
        else {
			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
			Thread.sleep(6000); 
		}
        
        driver.switchTo().window(winHandleBefore);
	    }else {System.out.println("Town milford not found");} 
	    
	    if((driver.findElements(By.linkText("Trumbull")).size() != 0)){
        WebElement link2 = driver.findElement(By.linkText("Trumbull"));
		newwin.keyDown(Keys.SHIFT).click(link2).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		int size2 = tabs2.size();
		driver.switchTo().window(tabs2.get(size2-1));
		//if (size2 ==3) {
		//	driver.switchTo().window(tabs2.get(2));
		//}
		//else if (size2 ==4){
		//	driver.switchTo().window(tabs2.get(3));
		//}
		
		String Date_of_sale2 = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
		System.out.println("Date_of_sale for Trumbull is" +Date_of_sale2);
		String[] Date2 = Date_of_sale2.split("\n");
		
		Date toDate2 = sdf.parse(Date2[0]);
		if(c.getTime().compareTo(toDate2)<0){
        	System.out.println("It's more than 7 days.");
        }
		else {
			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
			Thread.sleep(6000); 
		}
		
		driver.switchTo().window(winHandleBefore);}else {System.out.println("Town Trumbull not found");}
	    
	    if((driver.findElements(By.linkText("Norwalk")).size() != 0)){
		
		WebElement link3 = driver.findElement(By.linkText("Norwalk"));
		newwin.keyDown(Keys.SHIFT).click(link3).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		int size3 = tabs3.size();
		
		driver.switchTo().window(tabs3.get(size3 -1));
		
		String Date_of_sale3 = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
		System.out.println("Date_of_sale for Norwalk is" +Date_of_sale3);
		
		String[] Date3 = Date_of_sale3.split("n");
		
		Date toDate3 = sdf.parse(Date3[0]);
		
		
		if(c.getTime().compareTo(toDate3)<0){
        	System.out.println("It's more than 7 days.");
        }
		else {
			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
			Thread.sleep(6000); 
		}
		
		driver.switchTo().window(winHandleBefore);}else {System.out.println("Town Norwalk not found");}
		
	    if
	 		(driver.findElements(By.linkText("Stamford")).size() != 0) {
		WebElement link4 = driver.findElement(By.linkText("Stamford"));
		newwin.keyDown(Keys.SHIFT).click(link4).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(6000);
		
		ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
		int size4 = tabs4.size();
		
		driver.switchTo().window(tabs4.get(size4 -1));
		
		String Date_of_sale4 = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
		System.out.println("Date_of_sale for Stamford is" +Date_of_sale4);
		
        String[] Date4 = Date_of_sale4.split("n");
		
		Date toDate4 = sdf.parse(Date4[0]);
		
		
		if(c.getTime().compareTo(toDate4)<0){
        	System.out.println("It's more than 7 days.");
        }
		else {
			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
			Thread.sleep(6000); 
		}
		
		driver.switchTo().window(winHandleBefore);}else {System.out.println("Town Stamford not found");}
		
        if
		(driver.findElements(By.linkText("Shelton")).size() != 0) {
        	
        	WebElement link5 = driver.findElement(By.linkText("SHelton"));
    		newwin.keyDown(Keys.SHIFT).click(link5).keyUp(Keys.SHIFT).build().perform();
    		Thread.sleep(6000);
    		
    		ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
    		int size5 = tabs5.size();
    		
    		driver.switchTo().window(tabs5.get(size5 -1));
    		
    		String Date_of_sale5 = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
    		System.out.println("Date_of_sale for Shelton is" +Date_of_sale5);
    		
            String[] Date5 = Date_of_sale5.split("n");
    		
    		Date toDate5 = sdf.parse(Date5[0]);
    		
    		
    		if(c.getTime().compareTo(toDate5)<0){
            	System.out.println("It's more than 7 days.");
            }
    		else {
    			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
    			Thread.sleep(6000); 
    		}
    		
    		driver.switchTo().window(winHandleBefore);
        	
        }else {System.out.println("Town Shelton not found");}
        
        if
		(driver.findElements(By.linkText("Fairfield")).size() != 0) {
        	
        	WebElement link6 = driver.findElement(By.linkText("Fairfield"));
    		newwin.keyDown(Keys.SHIFT).click(link6).keyUp(Keys.SHIFT).build().perform();
    		Thread.sleep(6000);
    		
    		ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
    		int size6 = tabs6.size();
    		
    		driver.switchTo().window(tabs6.get(size6 -1));
    		
    		String Date_of_sale6 = driver.findElement(By.xpath("//span[@id = 'ctl00_cphBody_GridView1_ctl02_Label1']")).getText();
    		System.out.println("Date_of_sale for Fairfield is" +Date_of_sale6);
    		
            String[] Date6 = Date_of_sale6.split("n");
    		
    		Date toDate6 = sdf.parse(Date6[0]);
    		
    		
    		if(c.getTime().compareTo(toDate6)<0){
            	System.out.println("It's more than 7 days.");
            }
    		else {
    			driver.findElement(By.linkText("View Full Notice")).sendKeys(selectLinkOpeninNewTab);
    			Thread.sleep(6000); 
    		}
    		
    		driver.switchTo().window(winHandleBefore);
        	
        }else {System.out.println("Town Fairfield not found");}
        
        
		
        
	}

}
