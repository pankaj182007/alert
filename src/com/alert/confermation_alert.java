package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class confermation_alert {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="F:\\java\\geckodriver-v0.19.1-win64\\geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(5000);
		
		Alert conalert=driver.switchTo().alert();
		String text=conalert.getText();
		System.out.println("alert msg" + text);
		
		conalert.dismiss();
		
		String text1=driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println("button seleceted " + text1);
		
		

}
}
