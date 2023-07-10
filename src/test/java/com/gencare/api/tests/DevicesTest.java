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

public class DevicesTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(DevicesTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the Delete Gateway Using Command One")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Delete Gateway Using Command One")
	@Story("Verify the Delete Gateway Using Command One")
	public void verifyDeleteGatewayUsingCommandOne() {
		logger.info("Stating of verifyDeleteGatewayUsingCommandOne method");

		Response response = APIUtils.setBaseRequestHeader().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyDeleteGatewayUsingCommandOne method");

	}

	@Test(priority = 2, description = "Verify the Delete Gateway Using Command Three")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Delete Gateway Using Command Three")
	@Story("Verify the Delete Gateway Using Command Three")
	public void verifyDeleteGatewayUsingCommandThree() {
		logger.info("Stating of verifyDeleteGatewayUsingCommandThree method");

		Response response = APIUtils.setBaseRequestHeader().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.GET, "devices/gateway");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyDeleteGatewayUsingCommandThree method");

	}
}
