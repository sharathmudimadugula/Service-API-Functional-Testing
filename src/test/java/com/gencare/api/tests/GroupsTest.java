package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
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

public class GroupsTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(GroupsTest.class.getName());

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
	public void verifyOccupantGroups(ITestContext context) {
		logger.info("Stating of verify OccupantGroups method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("getoccupants.groups.value"))
				.param("type", testDataProp.getProperty("gateway.getoccupants"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");
		String id_value = js.getString("data[0].id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verify OccupantGroups method");

	}

	@Test(priority = 2, description = "Verify the slider list")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list")
	@Story("Verify the slider list")
	public void verifyOccupantGroup(ITestContext context) {
		logger.info("Stating of verify OccupantGroups method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id")).request(Method.GET,
				"occupants/group");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verify OccupantGroups method");

	}
}
