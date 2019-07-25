package btes.Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Btes_AssignmwntDemoClass extends Drivers {

	@Test
	public void AddBATCH(){
		
		
		
		driver.findElement(By.name("shop")).sendKeys("SDET");
	
		driver.findElement(By.name("pass")).sendKeys("trainer");
		driver.findElement(By.name("submit")).click();
		
		
	}
	
	@Test
	public void  Login(){

driver.findElement(By.xpath("//*[@id='sidebar-menu']/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='sidebar-menu']/div[1]/ul/li[1]/ul/li[1]/a")).click();
		
		
		
	}
	@Test
	public void Excel() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\lenov0\\Desktop");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ab=wb.getSheet("BtesDesktop");
		XSSFRow row=ab.getRow(0);
		System.out.println(row.getRowNum());
		System.out.println(row.getLastCellNum());
		
		
		
	}
}

//C:\Users\lenov0\Desktop