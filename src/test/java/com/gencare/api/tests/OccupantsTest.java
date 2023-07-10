package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.dashboardattributes.payload.CreateDashboardAttributes;
import com.gencare.occupants.payloads.CreateOccupantRegisterPayload;
import com.gencare.occupants.payloads.UpdateOccupantProfilePayload;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OccupantsTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(DashboardAttributesTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Verify the occupant profile")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the occupant profile")
	@Story("Verify the occupant profile")
	public void verifyGetOccupantProfile() {
		logger.info("Stating of verifyGetOccupantProfile method");

		Response response = APIUtils.setBaseRequestHeader().get("occupants/profile");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		logger.info("Ending of verifyGetOccupantProfile  method");

	}

	@Test(priority = 2, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testOccupantRegister() throws Exception {

		Response response = APIUtils.setBaseRequestHeader()
				.body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");
	}

	@Test(priority = 3, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testUpdateOccupantProfile() throws Exception {

		Response response = APIUtils.setBaseRequestHeader()
				.body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");
	}
}
