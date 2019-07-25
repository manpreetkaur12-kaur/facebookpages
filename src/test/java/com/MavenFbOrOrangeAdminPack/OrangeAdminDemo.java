package com.MavenFbOrOrangeAdminPack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;





public class OrangeAdminDemo extends Driver{

	private static final int ESS = 0;
	private static final int Disabled = 0;

	@Test
	public void Login() throws InterruptedException{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("manpreet");
		
		//driver.findElement(By.xpath("")).sendKeys("");
	  
        
		Select dropdown1 = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		dropdown1.selectByIndex(1);
		//searchSystemUser_userType
				//Select using selectByValue
				//dropdown1.selectByValue(“Ser64”);
		//*[@id="searchSystemUser_userType"]/option[3]
		
		
		  driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Jass");
		
		Select dropdown2 =new Select(driver.findElement(By.id("searchSystemUser_status")));
		dropdown2.selectByIndex(1);
	//}
	//@Test
	//public void Add(){
		
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("btnAdd")).click();
		Select dropdown3 = new Select(driver.findElement(By.id("systemUser_userType")));
		dropdown3.selectByIndex(ESS);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("jass");
		driver.findElement(By.id("systemUser_userName")).sendKeys("manpreet");
		
		
		Select dropdown4 = new Select(driver.findElement(By.id("systemUser_status")));
		dropdown4.selectByIndex(Disabled);
		
		driver.findElement(By.id("systemUser_password")).sendKeys("@Admin123");
		
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("@Admin123");;
		
		
		
		
		
		
		
	}
}
 