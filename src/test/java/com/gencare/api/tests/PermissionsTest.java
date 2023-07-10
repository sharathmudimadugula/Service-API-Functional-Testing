package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.permissions.payload.PostPermissions;
import com.gencare.permissions.payload.PutPermissionResend;
import com.gencare.permissions.payload.UpdatePermissions;

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

@Epic("Permissions functionality")
@Feature("Permissions functionality test")
public class PermissionsTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(PermissionsTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the get occupants permissions")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions")
	@Story("Verify the get occupants permissions")
	public void verifyGetOccupantsPermissions() {
		logger.info("Stating of verifyGetOccupantsPermissions method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyGetOccupantsPermissions method");

	}

	@Test(priority = 2, description = "Verify the post permissions")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:verify post permissions")
	@Story("Verify the post permissions")
	public void verifyPostPermissions(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostPermissions method");

		Response response = APIUtils.setBaseRequestHeader().body(PostPermissions.getPostPermissionsPayload())
				.post("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostPermissions  method");

	}

	@Test(priority = 3, description = "Verify the put permissions")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:verify put permissions")
	@Story("Verify the put permissions")
	public void verifyPutPermissions(ITestContext context) throws JsonProcessingException {
		logger.info("Stating of verifyPutPermissions method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyPutPermissions method");

	}

	@Test(priority = 4, description = "Verify the put permissions resend")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:verify put permissions resend")
	@Story("Verify the put permissions resend ")
	public void verifyPutPermissionsResend(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutPermissionsResend method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyPutPermissionsResend method");
	}

	@Test(priority = 5, description = "Verify the delete permissions ")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify delete permissions ")
	@Story("Verify the delete permissions")
	public void verifyDeletePermissions(ITestContext context) {
		logger.info("Stating of verifyDeletePermissions method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id"))
				.request(Method.DELETE, "occupants/permissions");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyDeletePermissions method");

	}

}
