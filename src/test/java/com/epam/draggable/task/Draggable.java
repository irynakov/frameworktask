package com.epam.draggable.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Draggable {

	private WebDriver driver;

	@BeforeClass
	public void initialize() {
		// open web site
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void dragAndDrop() {

		 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(frame);
		 WebElement findElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(findElement, 380, 30).perform();

		


	}
}
