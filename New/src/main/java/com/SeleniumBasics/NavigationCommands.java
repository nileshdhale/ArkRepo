package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 
         driver.navigate().to("https://www.naukri.com/");
         driver.navigate().back();
         driver.navigate().forward();
         
         driver.navigate().refresh();
}
}
