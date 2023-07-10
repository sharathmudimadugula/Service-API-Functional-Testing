package com.gencare.api.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.restassured.RestAssured;

public class BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(BaseAutomationTest.class.getName());

	protected static Properties expectedAssertionsProp = null;

	protected static Properties testDataProp = null;

	protected static String baseURI = null;

	@BeforeSuite
	public void initTestData() {
		FileReader assertionsReader = null;
		FileReader testDataReader = null;

		try {
			testDataReader = new FileReader("src/main/resources/testdata.properties");
			assertionsReader = new FileReader("src/main/resources/expectedassertions.properties");

			testDataProp = new Properties();
			testDataProp.load(testDataReader);

			expectedAssertionsProp = new Properties();
			expectedAssertionsProp.load(assertionsReader);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				assertionsReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String randomNumber(int digits) {
		logger.info("Starting of randomNumber method");
		logger.info("Ending of randomNumber method");
		return String.valueOf(RandomStringUtils.randomNumeric(digits));
	}

	public String randomAlphanumeric(int digits) {
		logger.info("Starting of randomAlphabets method");
		logger.info("Ending of randomAlphabets method");
		return RandomStringUtils.randomAlphanumeric(digits);
	}

	public static String getUniqueMobileNumber() {
		logger.info("Starting of getUniqueMobileNumber method");
		logger.info("Ending of getUniqueMobileNumber method");
		return testDataProp.getProperty("number") + randomNumber(9);
	}

	public String alphanumeric(int digits) {
		logger.info("Starting of randomAlphabets method");
		logger.info("Ending of randomAlphabets method");
		return RandomStringUtils.randomAlphabetic(digits);
	}

	public String getUniqueMail1() {
		logger.info("Starting of getUniqueMail method");
		logger.info("Ending of getUniqueMail method");

		return this.testDataProp.getProperty("text.profile.email") + randomNumber(5) + "@gmail.com";
	}
	public static String getUniqueMail() {
		logger.info("Starting of getUniqueMail method");
		logger.info("Ending of getUniqueMail method");

		return testDataProp.getProperty("text.profile.email") + randomNumber(5) + "@gmail.com";
	}
	public static String getUniqueAlphaNumericString(int length) {
		logger.info("Starting of AlphaNumeric method");
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123654789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		logger.info("Random String is: " + randomString);
		logger.info("Starting of AlphaNumeric method");
		return randomString;
	}
	public static String getUniqueToken(String value) {
		logger.info("Starting of getUniqueMail method");
		logger.info("Ending of getUniqueMail method");

		return testDataProp.getProperty("dX_9Jxu1iU5Xh9XX5ejCKM") + randomNumber(5) + ":APA91bHoXW8W4A0Rw3Pu1t17OO4ynmoyUDgCwZ1dE0KXUrmzZ8lmxm8JeHnnpkhzjyAA52vHUlAp2j8I1rBih8JQo98k7vjdka6P4H5_AujZzIg4XjwLXu8_vvaNx8DzaQazq_9-gi";
	}
	public boolean getPageLoadTime(WebDriver driver) {
		logger.info("Starting of getPageLoadTime Method");
		logger.info("Ending of getPageLoadTime Method");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		double var = (double) ((JavascriptExecutor) driver)
				.executeScript("return Date.now() - performance.timeOrigin;");
		System.out.println((var / 1000));
		if ((var / 1000) == (double) 2) {
			return true;
		}
		return false;
	}

	public static String GetUniqueAlphabet(String value) {
			return testDataProp.getProperty("name") + value +"com";

	}

	@Parameters({ "baseURI" })
	@BeforeClass
	public void initAuthentication(String uri) {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = uri;
		logger.info("Ending of initAuthentication method");
	}

}
