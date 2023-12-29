package com.SwagLab.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.SwagLab.pom.LogOutPage;
import com.SwagLab.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		
	}
		
	public static WebDriver driver;	
@BeforeClass
 public void openBrowser() {
	
	driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}

@BeforeMethod

public void logIn() throws IOException, InterruptedException {
	
	FileLib f= new FileLib();
	String acurl = f.getPropertyFile("url");
	System.out.println(acurl);
	String acuser = f.getPropertyFile("user");
	String acpass = f.getPropertyFile("pass");
	
	driver.get(acurl);
	LoginPage l= new LoginPage(driver);
	l.setUser(acuser);
	l.setPass(acpass);
     l.setLog();
	
}


@AfterMethod
 public void logOut() throws InterruptedException {
	
	LogOutPage lo= new LogOutPage(driver);
	Thread.sleep(2000);
	lo.setClic();
	Thread.sleep(2000);
	lo.setClicLog();
	
	
	
}

@AfterClass
public void closeBrowser() {
	
	driver.quit();
	
	
}


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      