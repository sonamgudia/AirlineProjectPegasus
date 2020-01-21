package com.org;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jbhifi {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\project\\Project1\\driver\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.jbhifi.com.au/");
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[1]/div[6]/div/a/span/span")).click();
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("sonamgudia.shaik@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("Project@12");
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	File s1 = tk.getScreenshotAs(OutputType.FILE);
	File d1 = new File("E:\\SELENIUM\\project\\Project1\\ScreenShots\\Login.jpeg");
	FileUtils.copyFile(s1,d1);
	
	driver.findElement(By.xpath("//*[@id=\"customerloginbutton\"]")).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div[2]/div/ul/li[6]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[4]/div[3]/div[1]/div/a/div/div[1]/h4")).click();
	
	File s4 = tk.getScreenshotAs(OutputType.FILE);
	File d4 = new File("E:\\SELENIUM\\project\\Project1\\ScreenShots\\SelectProduct.jpeg");
	FileUtils.copyFile(s4,d4);
	
	driver.findElement(By.xpath("//*[@id=\"AddToCart-inpage\"]")).click();
	
	File s5 = tk.getScreenshotAs(OutputType.FILE);
	File d5 = new File("E:\\SELENIUM\\project\\Project1\\ScreenShots\\AddToCart.jpeg");
	FileUtils.copyFile(s5,d5);
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/header/div[1]/div[7]/button/span")).click();
	Thread.sleep(5000);
	
	File s6 = tk.getScreenshotAs(OutputType.FILE);
	File d6 = new File("E:\\SELENIUM\\project\\Project1\\ScreenShots\\Checkout.jpeg");
	FileUtils.copyFile(s6,d6);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/div[3]/button[2]/span")).click();
	
	File s7 = tk.getScreenshotAs(OutputType.FILE);
	File d7 = new File("E:\\SELENIUM\\project\\Project1\\ScreenShots\\Checkout1.jpeg");
	FileUtils.copyFile(s7,d7);
	
	}}

//Actions acc=new Actions(driver);
//acc.contextClick().perform();
//Robot r=new Robot();
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);