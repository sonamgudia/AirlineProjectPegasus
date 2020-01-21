package com.org;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ProjectClass {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "E:\\SELENIUM\\project\\Project1\\driver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	//driver.manage().window().maximize();
	
	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/3.141.59");
}
}
