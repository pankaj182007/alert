package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="F:\\java\\geckodriver-v0.19.1-win64\\geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(3) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".btn-info")).click();
		Alert prompt=driver.switchTo().alert();

		System.out.println(prompt.getText());
		prompt.sendKeys("Pankaj");
		Thread.sleep(5000);
		prompt.accept();
		
		String text=driver.findElement(By.cssSelector("#demo1")).getText();
		System.out.println(text);
		System.out.println("ok");

	}

}
