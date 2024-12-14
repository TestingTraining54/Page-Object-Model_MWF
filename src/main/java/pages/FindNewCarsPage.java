package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class FindNewCarsPage extends BasePage {
	

	public FindNewCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[text()='Maruti Suzuki']")
	WebElement maruti;
	public MarutiCarsPage goToMaruti() {
		//WebElement maruti = driver.findElement(By.xpath("//div[text()='Maruti Suzuki']"));
		maruti.click();
		return new MarutiCarsPage(driver);
	}
	@FindBy(xpath="//div[text()='Tata']")
	WebElement tata;
	public TataCarsPage goToTata() {
		//WebElement tata = driver.findElement(By.xpath("//div[text()='Tata']"));
		tata.click();
		return new TataCarsPage(driver);
	}

	@FindBy(xpath="//div[text()='Mahindra']")
	WebElement mahindra;
	public MahindraCarsPage goToMahindra() {
		//WebElement mahindra = driver.findElement(By.xpath("//div[text()='Mahindra']"));
		mahindra.click();
		return new MahindraCarsPage(driver);
	}

	@FindBy(xpath="//div[text()='Toyota']")
	WebElement toyota;
	public ToyotaCarsPage goToToyota() {
		//WebElement toyota = driver.findElement(By.xpath("//div[text()='Toyota']"));
		toyota.click();
		return new ToyotaCarsPage(driver);
	}

	@FindBy(xpath="//div[text()='BMW']")
	WebElement bmw;
	public BMWCarsPage goToBMW() {
		//WebElement bmw = driver.findElement(By.xpath("//div[text()='BMW']"));
		bmw.click();
		return new BMWCarsPage(driver);
	}

	@FindBy(xpath="//div[text()='Audi']")
	WebElement audi;
	public AudiCarsPage goToAudi() {
		//WebElement audi = driver.findElement(By.xpath("//div[text()='Audi']"));
		audi.click();
		return new AudiCarsPage(driver);
	}
}
