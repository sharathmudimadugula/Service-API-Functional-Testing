package com.gencare.dashboardattributes.negative;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.dashboardattributes.payload.CreateDashboardAttributes;
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

public class DashboardAttributesTest  extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(DashboardAttributesTest.class.getName());
	
	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}
	@Test(priority = 1, description = "Verify the get occupant dashboard attributes passing with invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes passing with invalid path")
	@Story("Verify occupant dashboard attributes passing with invalid path")
	public void verifyGetDashBoardAttributesWithInvalidPath() {
		logger.info("Stating of verifyGetDashBoardAttributesWithInvalidPath method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.get.dashboardattributes")).get("occupants/dashboard_attributes.,guy");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
		logger.info("Ending of verifyGetDashBoardAttributesWithInvalidPath  method");

	}
	
	@Test(priority = 2, description = "Verify the get occupant dashboard attributes passing with invalid Auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes passing with invalid Auth")
	@Story("Verify occupant dashboard attributes passing with invalid Auth")
	public void verifyGetDashBoardAttributesWithInvalidAuth() {
		logger.info("Stating of verifyGetDashBoardAttributesWithInvalidAuth method");

		Response response =  APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.get.dashboardattributes")).get("occupants/dashboard_attributes.,guy");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
		logger.info("Ending of verifyGetDashBoardAttributesWithInvalidAuth  method");

	}

	@Test(priority = 3, description = "Verify the get occupant dashboard attributes with passing empty string")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing empty string")
	@Story("Verify occupant dashboard attributes with passing empty string")
	public void verifyGetDashBoardAttributesWithemptyString() {
		logger.info("Stating of verifyGetDashBoardAttributesWithemptyString method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithemptyString  method");

	}
	@Test(priority = 4, description = "Verify the get occupant dashboard attributes with passing space value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing space value")
	@Story("Verify occupant dashboard attributes with passing space value")
	public void verifyGetDashBoardAttributesWithSpace() {
		logger.info("Stating of verifyGetDashBoardAttributesWithSpace method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithSpace  method");

	}
	
	@Test(priority = 5, description = "Verify the get occupant dashboard attributes with passing alpha numeric value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing alpha numeric value")
	@Story("Verify occupant dashboard attributes with passing alpha numeric value")
	public void verifyGetDashBoardAttributesWithAlphaNumeric() {
		logger.info("Stating of verifyGetDashBoardAttributesWithAlphaNumeric method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithAlphaNumeric  method");

	}
	
	@Test(priority = 6, description = "Verify the get occupant dashboard attributes with passing numeric value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing numeric value")
	@Story("Verify occupant dashboard attributes with passing numeric value")
	public void verifyGetDashBoardAttributesWithNumeric() {
		logger.info("Stating of verifyGetDashBoardAttributesWithNumeric method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithNumeric  method");

	}
	@Test(priority = 7, description = "Verify the get occupant dashboard attributes with passing Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing Special Characters")
	@Story("Verify occupant dashboard attributes with passing Special Characters")
	public void verifyGetDashBoardAttributesWithSpecialCharacters() {
		logger.info("Stating of verifyGetDashBoardAttributesWithSpecialCharacters method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithSpecialCharacters  method");

	}
	@Test(priority = 8, description = "Verify the get occupant dashboard attributes with passing null value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with passing null value")
	@Story("Verify occupant dashboard attributes with passing null value")
	public void verifyGetDashBoardAttributesWithNullValue() {
		logger.info("Stating of verifyGetDashBoardAttributesWithNullValue method");

		Response response =  APIUtils.setBaseRequestHeader().param("id","",null).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributesWithNullValue  method");

	}
	@Test(priority = 9, description = "Verify the get occupant dashboard attributes with boolean value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes with boolean value")
	@Story("Verify occupant dashboard attributes with boolean value")
	public void verifyGetDashBoardAttributesWithBooleanValue() {
		logger.info("Stating of verifyGetDashBoardAttributes method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", false).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyGetDashBoardAttributes  method");
                                       // Get Dashboard Attributes///
	}
	
	@Test(priority = 10, description = "Verify Create Dashboard Attributes With passing Invaldv Auth token")
	@Description("TVerify Create Dashboard Attributes With passing Invaldv Auth token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With passing Invaldv Auth token")
	public void testCreateDashboardAttributesWithInvaldAuth(ITestContext context) throws JsonProcessingException, Exception {

		logger.info("Stating of testCreateDashboardAttributesWithInvaldAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(CreateDashboardAttributes.getCreatedashboardAttributesPayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);
		
		logger.info("Ending of testCreateDashboardAttributesWithInvaldAuth  method");

	}
	@Test(priority = 11, description = "Verify Create Dashboard Attributes With passing Invald path")
	@Description("TVerify Create Dashboard Attributes With passing Invald path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With passing Invald path")
	public void testCreateDashboardAttributesWithInvaldPath() throws Exception, Exception {

		logger.info("Stating of testCreateDashboardAttributesWithInvaldPath method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesPayload())
				.request(Method.POST, "occupants/dashboard_attributesfrg5w");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesWithInvaldPath  method");

	}
	@Test(priority =12, description = "Verify Create Dashboard Attributes With ItemId Empty String")
	@Description("Verify Create Dashboard Attributes With ItemId Empty String")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId Empty String")
	public void testCreateDashboardAttributesItemIdEmptyString() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdEmptyString method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdEmptyStringPayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
	
		logger.info("Ending of testCreateDashboardAttributesItemIdEmptyString  method");

	}
	@Test(priority =13, description = "Verify Create Dashboard Attributes With ItemId passing space")
	@Description("Verify Create Dashboard Attributes With ItemId passing space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing space")
	public void testCreateDashboardAttributesItemIdWithSpace() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithSpacePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testCreateDashboardAttributesItemIdWithSpace  method");

	}
	@Test(priority =14, description = "Verify Create Dashboard Attributes With ItemId passing Special characters")
	@Description("Verify Create Dashboard Attributes With ItemId passing Special characters")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing Special characters")
	public void testCreateDashboardAttributesItemIdWithSpecialCharacters() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithSpecialCharactersPayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of testCreateDashboardAttributesItemIdWithSpecialCharacters  method");

	}
	
	@Test(priority =15, description = "Verify Create Dashboard Attributes With ItemId passing Boolean value")
	@Description("Verify Create Dashboard Attributes With ItemId passing Boolean value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing Boolean value")
	public void testCreateDashboardAttributesItemIdWithBooleanValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithBooleanValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
	
		logger.info("Ending of testCreateDashboardAttributesItemIdWithBooleanValue  method");

	}
	@Test(priority =16, description = "Verify Create Dashboard Attributes With ItemId passing Null value")
	@Description("Verify Create Dashboard Attributes With ItemId passing Null value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing Null value")
	public void testCreateDashboardAttributesItemIdWithNullValue(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithNullValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of testCreateDashboardAttributesItemIdWithNullValue  method");

	}
	
	@Test(priority =17, description = "Verify Create Dashboard Attributes With ItemId passing Numeric value")
	@Description("Verify Create Dashboard Attributes With ItemId passing Numeric value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing Numeric value")
	public void testCreateDashboardAttributesItemIdWithNumericValue(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testCreateDashboardAttributesItemIdWithNumericValue  method");

	}
	@Test(priority =18, description = "Verify Create Dashboard Attributes With ItemId passing Alpha Numeric value")
	@Description("Verify Create Dashboard Attributes With ItemId passing Alpha Numeric value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With ItemId passing Alpha Numeric value")
	public void testCreateDashboardAttributesItemIdWithAlphaNumericValue(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesItemIdWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesItemIdWithAlphaNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testCreateDashboardAttributesItemIdWithAlphaNumericValue  method");

		                ////ID value////
	}
	@Test(priority =19, description = "Verify Create Dashboard Attributes With GridOrder Empty String")
	@Description("Verify Create Dashboard Attributes With GridOrder Empty String")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder Empty String")
	public void testCreateDashboardAttributesGridOrderEmptyString() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderEmptyString method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderEmptyStringPayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
	
		logger.info("Ending of testCreateDashboardAttributesGridOrderEmptyString  method");

	}
	@Test(priority =20, description = "Verify Create Dashboard Attributes With GridOrder passing space")
	@Description("Verify Create Dashboard Attributes With GridOrder passing space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing space")
	public void testCreateDashboardAttributesGridOrderWithSpace() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithSpacePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithSpace  method");

	}
	@Test(priority =21, description = "Verify Create Dashboard Attributes With GridOrder passing Special characters with Invalid pATH")
	@Description("Verify Create Dashboard Attributes With GridOrder passing Special characters with Invalid pATH")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing Special characters with Invalid pATH")
	public void testCreateDashboardAttributesGridOrderWithSpecialCharactersWithInvalidPath() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithSpecialCharactersWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithSpecialCharactersPayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of testCreateDashboardAttributesGridOrderWithSpecialCharactersWithInvalidPath  method");

	}
	
	@Test(priority =22, description = "Verify Create Dashboard Attributes With GridOrder passing Boolean value")
	@Description("Verify Create Dashboard Attributes With GridOrder passing Boolean value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing Boolean value")
	public void testCreateDashboardAttributesGridOrderWithBooleanValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithBooleanValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
	
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithBooleanValue  method");

	}
	@Test(priority =23, description = "Verify Create Dashboard Attributes With GridOrder passing Null value")
	@Description("Verify Create Dashboard Attributes With GridOrder passing Null value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing Null value")
	public void testCreateDashboardAttributesGridOrderWithNullValue(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithNullValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of testCreateDashboardAttributesGridOrderWithNullValue  method");

	}
	
	@Test(priority =24, description = "Verify Create Dashboard Attributes With GridOrder passing Numeric value with Invalid pATH")
	@Description("Verify Create Dashboard Attributes With GridOrder passing Numeric value with Invalid pATH")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing Numeric value with Invalid pATH")
	public void testCreateDashboardAttributesGridOrderWithNumericValuewithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithNumericValuewithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithNumericValuewithInvalidPath  method");

	}
	@Test(priority =25, description = "Verify Create Dashboard Attributes With GridOrder passing Alpha Numeric value")
	@Description("Verify Create Dashboard Attributes With GridOrder passing Alpha Numeric value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With GridOrder passing Alpha Numeric value")
	public void testCreateDashboardAttributesGridOrderWithAlphaNumericValueWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithAlphaNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesGridReorderWithAlphaNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithAlphaNumericValue  method");

		                ////Grid Order value////
	}
	
	@Test(priority =26, description = "Verify Create Dashboard Attributes With Type Empty String")
	@Description("Verify Create Dashboard Attributes With Type Empty String")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type Empty String")
	public void testCreateDashboardAttributesTypeEmptyStringWithInvalidPath() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderEmptyString method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeEmptyStringPayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
	
		logger.info("Ending of testCreateDashboardAttributesGridOrderEmptyString  method");

	}
	@Test(priority =27, description = "Verify Create Dashboard Attributes With Type passing space")
	@Description("Verify Create Dashboard Attributes With Type passing space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing space")
	public void testCreateDashboardAttributesTypeWithSpaceWithInvalidPath() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithSpacePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithSpace  method");

	}
	@Test(priority =28, description = "Verify Create Dashboard Attributes With Type passing Special characters")
	@Description("Verify Create Dashboard Attributes With Type passing Special characters")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing Special characters")
	public void testCreateDashboardAttributesTypeWithSpecialCharactersWithInvalidPath() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithSpecialCharactersPayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of testCreateDashboardAttributesGridOrderWithSpecialCharacters  method");

	}
	
	@Test(priority =29, description = "Verify Create Dashboard Attributes With Type passing Boolean value")
	@Description("Verify Create Dashboard Attributes With Type passing Boolean value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing Boolean value")
	public void testCreateDashboardAttributesTypeWithBooleanValueWithInvalidPath() throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithBooleanValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
	
		logger.info("Ending of testCreateDashboardAttributesGridOrderWithBooleanValue  method");

	}
	@Test(priority =30, description = "Verify Create Dashboard Attributes With Type passing Null value")
	@Description("Verify Create Dashboard Attributes With Type passing Null value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing Null value")
	public void testCreateDashboardAttributesTypeWithNullValueWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesGridOrderWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithNullValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of testCreateDashboardAttributesGridOrderWithNullValue  method");

	}
	
	@Test(priority =31, description = "Verify Create Dashboard Attributes With Type passing Numeric value")
	@Description("Verify Create Dashboard Attributes With Type passing Numeric value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing Numeric value")
	public void testCreateDashboardAttributesTypeWithNumericValueWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesTypeWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesTypeWithNumericValue  method");

	}
	@Test(priority =32, description = "Verify Create Dashboard Attributes With Type passing Alpha Numeric value")
	@Description("Verify Create Dashboard Attributes With Type passing Alpha Numeric value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Create Dashboard Attributes With Type passing Alpha Numeric value")
	public void testCreateDashboardAttributesTypeWithAlphaNumericValueWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testCreateDashboardAttributesTypeWithAlphaNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(CreateDashboardAttributes.getCreatedashboardAttributesTypeWithAlphaNumericValuePayload())
				.request(Method.POST, "occupants/dashboard_attributes--");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testCreateDashboardAttributesTypeWithAlphaNumericValue  method");

		                ////Type value////
		
		
		////////////////////////////////////////////////////Post DashBoard Attributes////////////////////////////////////////
	}
	
	@Test(priority = 33, description = "Verify Update DashBoard Attributes Passing Invalid Token")
	@Description("Verify Update DashBoard Attributes Passing Invalid Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Invalid Token")
	public void testUpdateDashBoardAttributesWithInvalidAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(UpdateDashboardAttributes.getUpdateDashboardAttributesPayload(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithInvalidAuth  method");

	}
	
	@Test(priority = 34, description = "Verify Update DashBoard Attributes Passing Invalid Path")
	@Description("Verify Update DashBoard Attributes Passing Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Invalid Path")
	public void testUpdateDashBoardAttributesWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(UpdateDashboardAttributes.getUpdateDashboardAttributesPayload(context))
				.request(Method.PUT, "occupants/dashboard_attributeshsjghuhgweiu46565489");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithInvalidPath  method");

	}
	
	@Test(priority = 35, description = "Verify Update DashBoard Attributes Passing Empty String")
	@Description("Verify Update DashBoard Attributes Passing Empty String")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Empty String")
	public void testUpdateDashBoardAttributesWithPassingEmptyString() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithPassingEmptyString method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithEmptyStringPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithPassingEmptyString  method");

	}
	
	@Test(priority = 36, description = "Verify Update DashBoard Attributes Passing Empty Space")
	@Description("Verify Update DashBoard Attributes Passing Empty Space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Empty Space")
	public void testUpdateDashBoardAttributesWithPassingEmptySpace() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithPassingEmptySpace method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithEmptySpacePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithPassingEmptySpace  method");

	}
	
	@Test(priority = 37, description = "Verify Update DashBoard Attributes Passing Null Value")
	@Description("Verify Update DashBoard Attributes Passing Null Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Null Value")
	public void testUpdateDashBoardAttributesWithPassingNullValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithPassingNullValue method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithNullValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithPassingNullValue  method");

	}
	
	@Test(priority = 38, description = "Verify Update DashBoard Attributes Passing Special Character")
	@Description("Verify Update DashBoard Attributes Passing Special Character")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Special Character")
	public void testUpdateDashBoardAttributesWithSpecialCharacter() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithSpecialCharacter method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithSpecialCharactersPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithSpecialCharacter  method");

	}
	
	@Test(priority = 39, description = "Verify Update DashBoard Attributes Passing Boolean")
	@Description("Verify Update DashBoard Attributes Passing Boolean")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Boolean")
	public void testUpdateDashBoardAttributesWithBoolean() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithBoolean method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithBooleanPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithBoolean  method");

	}
	
	@Test(priority = 40, description = "Verify Update DashBoard Attributes Passing Numeric Value")
	@Description("Verify Update DashBoard Attributes Passing Numeric Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Numeric Value")
	public void testUpdateDashBoardAttributesWithNumericValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithNumericValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithNumericValue  method");

	}
	
	@Test(priority = 41, description = "Verify Update DashBoard Attributes Passing AlphaNumeric Value")
	@Description("Verify Update DashBoard Attributes Passing  AlphaNumeric Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Alpha Numeric Value")
	public void testUpdateDashBoardAttributesWithAlphaNumericValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithAlphaNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithAlphaNumericValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithAlphaNumericValue  method");

	}
	
	@Test(priority = 42, description = "Verify Update Dashboard Attributes GridOrder With EmptyString")
	@Description("Verify Update Dashboard Attributes GridOrder With EmptyString")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With EmptyString")
	public void testUpdateDashboardAttributesGridOrderWithEmptyString() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithEmptyString method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithEmptyStringPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithEmptyString  method");

	}
	
	@Test(priority = 43, description = "Verify Update Dashboard Attributes GridOrder With Empty Space")
	@Description("Verify Update Dashboard Attributes GridOrder With Empty Space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With Empty Space")
	public void testUpdateDashboardAttributesGridOrderWithEmptySpace() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithEmptySpace method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithEmptySpacePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithEmptySpace  method");

	}
	
	@Test(priority = 44, description = "Verify Update Dashboard Attributes GridOrder With Null Value")
	@Description("Verify Update Dashboard Attributes GridOrder With Null Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With Null Value")
	public void testUpdateDashboardAttributesGridOrderWithNullValue() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithNullValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithNullValue  method");

	}
	
	@Test(priority = 45, description = "Verify Update Dashboard Attributes GridOrder With Special Charcters")
	@Description("Verify Update Dashboard Attributes GridOrder With Special Charcters")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With Special Charcters")
	public void testUpdateDashboardAttributesGridOrderWithSpecialCharacter() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithSpecialCharacter method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithSpecialCharactersPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "422");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithSpecialCharacter  method");

	}
	
	@Test(priority = 46, description = "Verify Update Dashboard Attributes GridOrder With Boolean")
	@Description("Verify Update Dashboard Attributes GridOrder With Boolean")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With Boolean")
	public void testUpdateDashboardAttributesGridOrderWithBoolean() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithBoolean method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithBooleanPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithBoolean  method");

	}
	@Test(priority = 47, description = "Verify Update Dashboard Attributes GridOrder With Numeric Values")
	@Description("Verify Update Dashboard Attributes GridOrder With Numeric Values")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With Numeric Values")
	public void testUpdateDashboardAttributesGridOrderWithNumericValues() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithNumericValues method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesGridOrderWithNumericValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "422");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithNumericValues  method");

	}
	
	@Test(priority = 48, description = "Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	@Description("Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	public void testUpdateDashboardAttributesGridOrderWithAlphaNumericValues() throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesGridOrderWithAlphaNumericValues method");

		Response response = APIUtils.setBaseRequestHeader().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithAlphaNumericValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");
		
		logger.info("Ending of testUpdateDashboardAttributesGridOrderWithAlphaNumericValues  method");
//////////////////////////// PUT Dashboard Attributes/////////////////////////////////////////
	}
	@Test(priority = 49, description = "Verify the Delete occupant dashboard attributes passing with invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes passing with invalid path")
	@Story("Verify Delete occupant dashboard attributes passing with invalid path")
	public void verifyDeleteDashBoardAttributesWithInvalidPath() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithInvalidPath method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.get.dashboardattributes")).get("occupants/dashboard_attributes.,guy");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithInvalidPath  method");

	}
	
	@Test(priority = 50, description = "Verify the Delete occupant dashboard attributes passing with invalid Auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes passing with invalid Auth")
	@Story("Verify Delete occupant dashboard attributes passing with invalid Auth")
	public void verifyDeleteDashBoardAttributesWithInvalidAuth() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithInvalidAuth method");

		Response response =  APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.get.dashboardattributes")).get("occupants/dashboard_attributes.,guy");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithInvalidAuth  method");

	}

	@Test(priority = 51, description = "Verify the Delete occupant dashboard attributes with passing empty string")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing empty string")
	@Story("Verify Delete occupant dashboard attributes with passing empty string")
	public void verifyDeleteDashBoardAttributesWithemptyString() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithemptyString method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithemptyString  method");

	}
	@Test(priority = 52, description = "Verify the Delete occupant dashboard attributes with passing space value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing space value")
	@Story("Verify Delete occupant dashboard attributes with passing space value")
	public void verifyDeleteDashBoardAttributesWithSpace() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithSpace method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithSpace  method");

	}
	
	@Test(priority = 53, description = "Verify the Delete occupant dashboard attributes with passing alpha numeric value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing alpha numeric value")
	@Story("Verify Delete occupant dashboard attributes with passing alpha numeric value")
	public void verifyDeleteDashBoardAttributesWithAlphaNumeric() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithAlphaNumeric method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithAlphaNumeric  method");

	}
	
	@Test(priority = 54, description = "Verify the Delete occupant dashboard attributes with passing numeric value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing numeric value")
	@Story("Verify occupant dashboard attributes with passing numeric value")
	public void verifyDeleteDashBoardAttributesWithNumeric() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithNumeric method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithNumeric  method");

	}
	@Test(priority = 55, description = "Verify the Delete occupant dashboard attributes with passing Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing Special Characters")
	@Story("Verify Delete occupant dashboard attributes with passing Special Characters")
	public void verifyDeleteDashBoardAttributesWithSpecialCharacters() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithSpecialCharacters method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithSpecialCharacters  method");

	}
	@Test(priority = 56, description = "Verify the Delete occupant dashboard attributes with passing null value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with passing null value")
	@Story("Verify occupant dashboard attributes with passing null value")
	public void verifyDeleteDashBoardAttributesWithNullValue() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithNullValue method");

		Response response =  APIUtils.setBaseRequestHeader().param("id","",null).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithNullValue  method");

	}
	@Test(priority = 57, description = "Verify the Delete occupant dashboard attributes with boolean value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the Delete occupant dashboard attributes with boolean value")
	@Story("Verify Delete occupant dashboard attributes with boolean value")
	public void verifyDeleteDashBoardAttributesWithBooleanValue() {
		logger.info("Stating of verifyDeleteDashBoardAttributesWithBooleanValue method");

		Response response =  APIUtils.setBaseRequestHeader().param("id", false).get("occupants/dashboard_attributes");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");
		logger.info("Ending of verifyDeleteDashBoardAttributesWithBooleanValue  method");
                                       // Delete Dashboard Attributes///
	}

	
	@Test(priority = 58, description = "Verify Update DashBoard Attributes NullValue Passing Invalid Token")
	@Description("Verify Update DashBoard Attributes Passing NullValue Invalid Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes Passing Invalid Token")
	public void testUpdateDashBoardAttributesNullValueWithInvalidAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithInvalidAuth  method");

	}
	
	@Test(priority = 59, description = "Verify Update DashBoard Attributes NullValue Passing Invalid Path")
	@Description("Verify Update DashBoard Attributes NullValue Passing  Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Invalid Path")
	public void testUpdateDashBoardAttributesNullValueWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributeshsjghuhgweiu46565489");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashBoardAttributesWithInvalidPath  method");

	}
	
	@Test(priority = 60, description = "Verify Update DashBoard Attributes NullValue Passing Empty String")
	@Description("Verify Update DashBoard Attributes NullValue Passing Empty String")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Empty String")
	public void testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptyString(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptyString method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithEmptyStringPayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptyString  method");

	}
	
	@Test(priority = 61, description = "Verify Update DashBoard Attributes NullValue Passing Empty Space")
	@Description("Verify Update DashBoard Attributes NullValue Passing Empty Space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Empty Space")
	public void testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptySpace(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptySpace method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithEmptySpacePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithPassingEptyAuthEmptySpace  method");

	}
	
	@Test(priority = 62, description = "Verify Update DashBoard Attributes NullValue Passing Null Value")
	@Description("Verify Update DashBoard Attributes NullValue Passing Null Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Null Value")
	public void testUpdateDashBoardAttributesNullValueWithPassingInvalidAccess(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithPassingInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(UpdateDashboardAttributes.getUpdateDashboardAttributesWithNullValuePayload())
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithPassingInvalidAccess  method");

	}
	
	@Test(priority = 63, description = "Verify Update DashBoard Attributes NullValue Passing Special Character")
	@Description("Verify Update DashBoard Attributes NullValue Passing Special Character")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Special Character")
	public void testUpdateDashBoardAttributesNullValueWithExpairedAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithExpairedAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithExpairedAuth  method");

	}
	
	@Test(priority = 64, description = "Verify Update DashBoard Attributes  NullValuePassing Boolean")
	@Description("Verify Update DashBoard Attributes NullValue Passing Boolean")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Boolean")
	public void testUpdateDashBoardAttributesNullValueValidAuthWithInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueValidAuthWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueValidAuthWithInvalidPath  method");

	}
	
	@Test(priority = 65, description = "Verify Update DashBoard Attributes NullValue Passing Numeric Value")
	@Description("Verify Update DashBoard Attributes NullValue Passing Numeric Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Numeric Value")
	public void testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributesrtrhs");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAuth  method");

	}
	
	@Test(priority = 66, description = "Verify Update DashBoard Attributes NullValue Passing AlphaNumeric Value")
	@Description("Verify Update DashBoard Attributes NullValue Passing  AlphaNumeric Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update DashBoard Attributes NullValue Passing Alpha Numeric Value")
	public void testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAccess(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributeshfsd896-");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashBoardAttributesNullValueWithInvalidPathInvalidAccess  method");

	}
	
	@Test(priority = 67, description = "Verify Update Dashboard Attributes NullValue With EmptyString")
	@Description("Verify Update Dashboard Attributes NullValue With EmptyString")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With EmptyString")
	public void testUpdateDashboardAttributesNullValueWithValidAuthInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithValidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributeserhgwfhg");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithValidAuthInvalidPath  method");

	}
	
	@Test(priority = 68, description = "Verify Update Dashboard Attributes NullValue With Empty Space")
	@Description("Verify Update Dashboard Attributes NullValue With Empty Space")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With Empty Space")
	public void testUpdateDashboardAttributesNullValueWithExpairedAuthInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithExpairedAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributesdhshr---");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithExpairedAuthInvalidPath  method");

	}
	
	@Test(priority = 69, description = "Verify Update Dashboard Attributes NullValue With Null Value")
	@Description("Verify Update Dashboard Attributes NullValue With Null Value")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With Null Value")
	public void testUpdateDashboardAttributesInvalidAuthWithNullValue(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithNullValue method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithNullValue  method");

	}
	
	@Test(priority = 70, description = "Verify Update Dashboard Attributes NullValue With Special Charcters")
	@Description("Verify Update Dashboard Attributes NullValue With Special Charcters")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With Special Charcters")
	public void testUpdateDashboardAttributesNullValueWithEmptyAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithEmptyAuth  method");

	}
	
	@Test(priority = 71, description = "Verify Update Dashboard Attributes NullValue With Boolean")
	@Description("Verify Update Dashboard Attributes NullValue With Boolean")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With Boolean")
	public void testUpdateDashboardAttributesNullValueWithInvalidAccess(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithBoolean method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithBoolean  method");

	}
	@Test(priority = 72, description = "Verify Update Dashboard Attributes NullValue With Numeric Values")
	@Description("Verify Update Dashboard Attributes NullValue With Numeric Values")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes NullValue With Numeric Values")
	public void testUpdateDashboardAttributesNullValueWithExpiredAuth(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributes");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithExpiredAuth  method");

	}
	
	@Test(priority = 73, description = "Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	@Description("Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Update Dashboard Attributes GridOrder With AlphaNumeric Values")
	public void testUpdateDashboardAttributesNullValueWithValidAuthAndInvalidAccessInvalidPath(ITestContext context) throws JsonProcessingException, Exception {
		logger.info("Stating of testUpdateDashboardAttributesNullValueWithValidAuthAndInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess().body(PutNullGridReOrder.getUpdateDashboardAttributesPayloadWithNullValue(context))
				.request(Method.PUT, "occupants/dashboard_attributesfgjdj");

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");
		
		logger.info("Ending of testUpdateDashboardAttributesNullValueWithValidAuthAndInvalidAccessInvalidPath  method");
}
}