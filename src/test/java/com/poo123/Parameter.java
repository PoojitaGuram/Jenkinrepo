package com.poo123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter {
	public WebDriver driver;
@Test
public void parametertest() {
	String URL = System.getProperty("url");
    String BROWSER = System.getProperty("browser");
    if(BROWSER.equalsIgnoreCase("chrome")) {
    	driver=new ChromeDriver();
    	
    }else if(BROWSER.equalsIgnoreCase("edge")) {
    	driver=new EdgeDriver();
    }
    else if(BROWSER.equalsIgnoreCase("firefox")) {
    	driver=new FirefoxDriver();
    }
    driver.get(URL);
}
}
