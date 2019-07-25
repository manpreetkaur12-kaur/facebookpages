package com.MavenFbOrOrangeAdminPack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class LoginTest extends Driver {
	
	
	@Test
	public void login()
	{
		//driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
	}
}
