package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		driver.quit();
		}
		}
