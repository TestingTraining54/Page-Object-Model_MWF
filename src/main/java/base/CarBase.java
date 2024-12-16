package base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarBase {

	WebDriver driver;
	
	public CarBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement carTitle;
	public String getCarTitle() {
		//WebElement carTitle = driver.findElement(By.xpath("//h1"));
		return carTitle.getText();
	}
	
	@FindBy(xpath="//h3")
	List<WebElement> carModel;
	
	@FindBy(xpath="//span[@class='o-cpnuEd']/span[1]")
	List<WebElement> carPrice;
	
	public void getCarModelAndPrice() {
		for(int i=0;i<carPrice.size();i++) {
			System.out.println("Car Model: " + carModel.get(i).getText()+ 
					"---- Car Price: " + carPrice.get(i).getText());
		}
	}
}
