package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="F:\\java\\geckodriver-v0.19.1-win64\\geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector(".btn-danger")).click();
		
		Thread.sleep(5000);
		Alert simplealert=driver.switchTo().alert();
		String text = simplealert.getText();
		System.out.println("alert msg :" + text);
		
		simplealert.accept();
		
		System.out.println("ok");
		
		
		
	}

}
