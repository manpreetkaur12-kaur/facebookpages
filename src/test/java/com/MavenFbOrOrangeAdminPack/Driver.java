package com.MavenFbOrOrangeAdminPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Driver {
	
		 public static WebDriver driver;
			 
		 
		 
		 public static String path;
		 @BeforeSuite
		 public void init() {
			 path=System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\chromedriver.exe";
				System.out.println(path);
				System.setProperty("webdriver.chrome.driver", path);

				driver=new ChromeDriver();
				//driver.get("http://172.16.10.77/btesportalqa/admin");
				//driver.get("https://opensource-demo.orangehrmlive.com/");
				//driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
			//driver.get("C:\\Users\\lenov0\\Desktop");
				driver.get("http://www.facebook.com");
		}
		 
		 
	}


