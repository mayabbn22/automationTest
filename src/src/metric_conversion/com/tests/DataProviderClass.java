package src.metric_conversion.com.tests;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataProvider() {
		return new Object[][] { { "Celsius", "Fahrenheit", "10" }, { "Meters", "Feet", "20" },
				{ "Ounces", "Grams", "30" }, };
	}
}