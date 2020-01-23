package com.org;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.collect.Table.Cell;

public class PegasusAir {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\project\\Project1\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flypgs.com/en");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File s1 = tk.getScreenshotAs(OutputType.FILE);
		File d1 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\HomePage.jpeg");
		FileUtils.copyFile(s1, d1);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[1]/div[1]/div/div[2]/div/label")).click();
		
		File s2 = tk.getScreenshotAs(OutputType.FILE);
		File d2 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\Accessing Page.jpeg");
		FileUtils.copyFile(s2, d2);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[2]/div[1]/div/span/span[1]/span")).click();
		WebElement from = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		from.sendKeys(getData(3,2));
		from.sendKeys(Keys.ENTER);
		
		File s3 = tk.getScreenshotAs(OutputType.FILE);
		File d3 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\FlightSelection.jpeg");
		FileUtils.copyFile(s3, d3);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[2]/div[2]/div/span/span[1]/span")).click();
		WebElement to = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		to.sendKeys(getData(4,2));
		to.sendKeys(Keys.ENTER);
		
		File s4 = tk.getScreenshotAs(OutputType.FILE);
		File d4 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\seat.jpeg");
		FileUtils.copyFile(s4, d4);
		
		//date calendar
		driver.findElement(By.xpath("//*[@id=\"dp1\"]")).click();
        WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[1]/div/div[2]/div/div[1]/table/tbody/tr[4]/td[5]/a"));
        date.sendKeys(getData(15,2));
        date.sendKeys(Keys.ENTER);
        
        File s5 = tk.getScreenshotAs(OutputType.FILE);
		File d5 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\robot.jpeg");
		FileUtils.copyFile(s5, d5);
		
		//passenger
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[3]/div")).click();
		//Search Cheap Flights
		Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[3]/div/div[2]/ul/li[1]/div/a[2]/i")).click();
       
        File s6 = tk.getScreenshotAs(OutputType.FILE);
		File d6 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\search.jpeg");
		FileUtils.copyFile(s6, d6);

		//Flight Selection by seeing the time    
     	Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[2]/ul/li[1]/div/form/div[3]/div[4]/div/button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/button/div")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]/button/div[2]/div/div/div")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/div[1]/div[6]/div[2]/button[2]/div")).click();
		
		File s7 = tk.getScreenshotAs(OutputType.FILE);
		File d7 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\PassengerDetails1.jpeg");
		FileUtils.copyFile(s7, d7);
		
		Thread.sleep(5000);  // have to change in this location
		driver.findElement(By.className("bundle-upgrade-modal-continue")).click();
		
		Thread.sleep(2000);
		
		//passenger 1 //Name
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(getData(5,2));
		//surname
		driver.findElement(By.xpath("//input[@label=\"Surname\"]")).sendKeys(getData(6,2));
		//date of birth
		driver.findElement(By.xpath("(//input[@maxlength=\"2\"])[1]")).sendKeys(getData(7,2));
		//month of birth
		driver.findElement(By.xpath("(//input[@maxlength=\"2\"])[2]")).sendKeys(getData(8,2));
		//year of birth
		driver.findElement(By.xpath("//input[@maxlength=\"4\"]")).sendKeys(getData(9,2));
		//gender click btn
		driver.findElement(By.xpath("//input[@value=\"F\"]")).click();
		//nationality
		driver.findElement(By.xpath("//input[@value=\"foreign\"]")).click();
		//Whether bolbol member
		
		File s8 = tk.getScreenshotAs(OutputType.FILE);
		File d8 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\PassengerDetails12.jpeg");
		FileUtils.copyFile(s8, d8);
		
		driver.findElement(By.xpath("(//button[@class=\"button passive\"])[1]")).click();
		//continue btn
		WebElement ctnbtn = driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div/form/div/div[3]/button/div"));
		
		Actions acc = new Actions(driver);
		acc.contextClick(ctnbtn).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		File s9 = tk.getScreenshotAs(OutputType.FILE);
		File d9 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\seat.jpeg");
		FileUtils.copyFile(s9, d9);

		driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
		driver.switchTo().window(x);
		
		File s10 = tk.getScreenshotAs(OutputType.FILE);
		File d10 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\windowsHandle.jpeg");
		FileUtils.copyFile(s10, d10);
		}
               //passenger 2	//Name
				driver.findElement(By.xpath("//input[@label=\"Name\"]")).sendKeys(getData(10,2));
				//surname
				driver.findElement(By.xpath("//input[@label=\"Surname\"]")).sendKeys(getData(11,2));
				//date of birth
				driver.findElement(By.xpath("(//input[@maxlength=\"2\"])[1]")).sendKeys(getData(12,2));
				//month of birth
				driver.findElement(By.xpath("(//input[@maxlength=\"2\"])[2]")).sendKeys(getData(13,2));
				//year of birth
				driver.findElement(By.xpath("//input[@maxlength=\"4\"]")).sendKeys(getData(14,2));
				//gender click btn
				driver.findElement(By.xpath("//input[@value=\"F\"]")).click();
				//nationality
				driver.findElement(By.xpath("//input[@value=\"foreign\"]")).click();
				//Whether bolbol member
				driver.findElement(By.xpath("(//button[@class=\"button passive\"])[1]")).click();
				//continue btn
				driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div/form/div/div[3]/button/div")).click();
				
				//contact Details
				
				//area-code
				driver.findElement(By.xpath("//input[@name=\"area-code\"]")).sendKeys(getData(16,2));

				//PhoneNumber
				driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys(getData(17,2));
				
				//Email
				driver.findElement(By.xpath("//input[@label=\"Email\"]")).sendKeys(getData(18,2));
	
				//Continue
				driver.findElement(By.xpath("(//div[@class=\"button-text\"])[3]")).click();
				
				//Seat Selection passenger 1
				driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[5]/div[4]/div[1]/div[1]/div[2]/div/div[2]/div[32]/div/div[1]/button[3]")).click();
				
				//fix to passenger 1
				driver.findElement(By.xpath("/html/body/div[20]/div/div/div/div[3]/div[1]/div/div[1]/button")).click();
				
				//Seat Selection passenger 2
				driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[5]/div[4]/div[1]/div[1]/div[2]/div/div[2]/div[32]/div/div[2]/button[1]")).click();
				
				//fix to passenger 1
				driver.findElement(By.xpath("/html/body/div[20]/div/div/div/div[3]/div[1]/div/div[2]/button")).click();
				
				Thread.sleep(2000);
				//Proceed to payment
				driver.findElement(By.xpath("//button[@class=\"ssr-outer-step-text payment\"]")).click();
				
				WebElement FlightDetails = driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div[1]/div[1]"));
				System.out.println(FlightDetails);
				
				File s11 = tk.getScreenshotAs(OutputType.FILE);
				File d11 = new File ("E:\\SELENIUM\\project\\Project1\\ScreenShotsOfPegasus\\Result.jpeg");
				FileUtils.copyFile(s11, d11);
		
				File loc1 = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\FlyPassionAir\\testdatas\\Pegasus.xlsx");
				FileInputStream stm = new FileInputStream (loc1);
				Workbook w1 = new XSSFWorkbook(stm);
				Sheet s28 = w1.createSheet("PEGASUS");
				Row r1 = s28.createRow(13);
				Cell c1 = (Cell) r1.createCell(4);
				String stringCellValue = ((org.apache.poi.ss.usermodel.Cell) c1).getStringCellValue();
				if (stringCellValue.equals("1")) {
				Object t2 = null;
				 ((org.apache.poi.ss.usermodel.Cell) c1).setCellValue((Double) t2);	
			}
				FileOutputStream o = new FileOutputStream(loc1);
				w1.write(o);
				System.out.println("Sucessfull");
				}
			public static String getData(int rowNo, int cellNo) throws Throwable {
				String v = null;
				File loc = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\FlyPassionAir\\testdatas\\Pegasus.xlsx");
				FileInputStream stream = new FileInputStream(loc);
				Workbook w = new XSSFWorkbook(stream);
				Sheet s = w.getSheet("PEGASUS");
				Row r = s.getRow(rowNo);
				Cell c = (Cell) r.getCell( cellNo );
				
				v = ((org.apache.poi.ss.usermodel.Cell) c).getStringCellValue();
				return v;}}
