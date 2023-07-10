package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AlertsTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(HomeTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the Devices Alerts Count")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Devices Alerts Count")
	@Story("Verify the Devices Alerts Count")
	public void verifyDevicesAlertsCount() {
		logger.info("Stating of verifyDevicesAlertsCount method");

		Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/device_alerts_count");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyDevicesAlertsCount method");

	}

	@Test(priority = 2, description = "Verify the Occupant Alerts")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Alerts")
	@Story("Verify the Occupant Alerts")
	public void verifyOccupantAlerts() {
		logger.info("Stating of verifyOccupantAlerts method");

		Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/alerts");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyOccupantAlerts method");

	}

}
