package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	
	
	public void findNewCars() {
		
	WebElement newCar = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
	Actions act = new Actions(driver);
	act.moveToElement(newCar).perform();
	
	WebElement findNewCar=driver.findElement(By.xpath("//div[text()='Find New Cars']"));
	findNewCar.click();
	
	}
	
	
	public void searchCar() {
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("bmw");
	/*
	 * Actions act = new Actions(driver);
	 * act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	 */
	}
	
	
	
}
