package com.poo123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launbrowser {
	WebDriver driver;
@Test
public void chrometest() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
}
