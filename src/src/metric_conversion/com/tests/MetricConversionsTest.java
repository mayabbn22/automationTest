package src.metric_conversion.com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import src.metric_conversion.com.pageobjects.ConvertPage;

public class MetricConversionsTest extends BaseTest {

	@BeforeMethod
	public void pageNavigation() {
		driver.get("https://www.metric-conversions.org/");
	}

	@Test(dataProvider = "SearchProvider", dataProviderClass = DataProviderClass.class)
	public void Conversions(String converFrom, String convertTo, String amount) throws InterruptedException {
		ConvertPage convertPage = new ConvertPage(driver, wait);
		convertPage.convert(converFrom, convertTo, amount);
		Assert.assertFalse(convertPage.getAnswer().getText().isEmpty());
	}
}
