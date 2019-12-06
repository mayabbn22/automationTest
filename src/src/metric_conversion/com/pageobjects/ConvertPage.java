package src.metric_conversion.com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConvertPage extends BasePage {
	@FindBy(css = "#answer")
	private WebElement answer;

	public WebElement getAnswer() {
		return answer;
	}

	@FindBy(css = "#queryFrom")
	private WebElement queryFrom;

	@FindBy(css = "#queryTo")
	private WebElement queryTo;
	
	@FindBy(css = "a.convert")
	private List <WebElement> convertButtons;

	@FindBy(css = "input.argument")
	private WebElement ArgumentConv;

	public ConvertPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * @param convertFrom text to be sent to the convert from input field
	 * @param convertTo text to be sent to the convert to input field
	 * @param amount text to be sent to amount field representing the amount for conversion
	 * @throws InterruptedException
	 */
	public void convert(String convertFrom, String convertTo, String amount) throws InterruptedException {
		fillText(queryFrom, convertFrom);
		Thread.sleep(5000);
		fillText(queryTo, convertTo);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ArgumentConv));
		fillText(ArgumentConv, amount);
		click(convertButtons.get(0));
		System.out.println("The result of converting from " + convertFrom + " To " + convertTo + " is " + getText(answer));
	}
}