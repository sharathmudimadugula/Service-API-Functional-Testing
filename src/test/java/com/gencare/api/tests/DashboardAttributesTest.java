package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.dashboardattributes.payload.CreateDashboardAttributes;
import com.gencare.dashboardattributes.payload.PutEmptyGridReOrder;
import com.gencare.dashboardattributes.payload.PutGridMissing;
import com.gencare.dashboardattributes.payload.PutNullGridReOrder;
import com.gencare.dashboardattributes.payload.UpdateDashboardAttributes;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DashboardAttributesTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(DashboardAttributesTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Verify the get occupant dashboard attributes")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes")
	@Story("Verify occupant dashboard attributes")
	public void verifyGetDashBoardAttributes() {
		logger.info("Stating of verifyGetDashBoardAttributes method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.get.dashboardattributes"))
				.get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		logger.info("Ending of verifyGetDashBoardAttributes  method");

	}

	@Test(priority = 2, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testCreateDashboardAttributes(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributes method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(CreateDashboardAttributes.getCreatedashboardAttributesPayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of testCreateDashboardAttributes  method");

	}

	@Test(priority = 3, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testUpdateDashBoardAttributes(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributes method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(UpdateDashboardAttributes.getUpdateDashboardAttributesPayload(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of testUpdateDashBoardAttributes  method");

	}

	@Test(priority = 4, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testUpdateDashBoardAttributesWithNullValue(ITestContext context)
			throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of testUpdateDashBoardAttributesWithNullValue  method");

	}

	@Test(priority = 5, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testUpdateDashBoardAttributesWithEmptyGridValue(ITestContext context)
			throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithEmptyGridValue method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutEmptyGridReOrder.getUpdateDashboardAttributesEmptyGridPayload(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of testUpdateDashBoardAttributesWithEmptyGridValue  method");

	}

	@Test(priority = 6, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testUpdateDashBoardAttributesWithoutGridValue(ITestContext context)
			throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithoutGridValue method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutGridMissing.getUpdateDashboardAttributesGridMissingPayload(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of testUpdateDashBoardAttributesWithoutGridValue  method");

	}

	@Test(priority = 7, description = "Verify the delete occupant dashboard attributes")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the delete occupant dashboard attributes")
	@Story("Verify delete occupant dashboard attributes")
	public void verifyDeleteDashBoardAttributes(ITestContext context) {
		logger.info("Stating of verifyDeleteDashBoardAttributes method");
		context.getAttribute("id");
		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id"))
				.delete("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		logger.info("Ending of verifyDeleteDashBoardAttributes  method");

	}
}
