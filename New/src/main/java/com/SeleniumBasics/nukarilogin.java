package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nukarilogin {

	
		  public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 
				 driver.manage().window().maximize();
				 driver.get("https://www.naukri.com/");
				 
				 driver.findElement(By.className("err-border")).sendKeys("kavita2dadas@gmail.com");
				 
				 driver.findElement(By.name("pass")).sendKeys("721874"); 
				 driver.findElement(By.className("btn-login")).click();
		}
		}
	
