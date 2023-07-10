package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Epic("Home functionality")
@Feature("Home functionality test")
public class HomeTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(HomeTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the slider list")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list")
	@Story("Verify the slider list")
	public void verifySliderList() {
		logger.info("Stating of verifySliderList method");

		Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/slider_list");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifySliderList method");

	}

	@Test(priority = 2, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderDetails() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifySliderDetails method");

	}

	@Test(priority = 3, description = "Verify the slider details with gateway tile")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details with gateway tile")
	@Story("Verify the slider details with gateway tile")
	public void verifySliderDetailsWithGatewayTile() {
		logger.info("Stating of verifySliderDetailsWithGatewayTile method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifySliderDetailsWithGatewayTile method");

	}

	@Test(priority = 4, description = "Verify the slider categories")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider categories")
	@Story("Verify the slider categories")
	public void verifySliderCategories() {
		logger.info("Stating of verifySliderCategories method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.slider.categories"))
				.param("type", testDataProp.getProperty("gateway.slider.categories"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifySliderCategories method");

	}
}
