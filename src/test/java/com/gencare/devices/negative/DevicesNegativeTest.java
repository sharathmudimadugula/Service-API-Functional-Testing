package com.gencare.devices.negative;

import static org.testng.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.notificationtoken.negative.tests.NotificationTokensNegativeTests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class DevicesNegativeTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(NotificationTokensNegativeTests.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #1,Verify Delete Gateway Using Command One With Valid Auth, Access Token And Invalid Params")
	@Description("Test Case #2,Verify Delete Gateway Using Command One With Valid Auth, Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Delete Gateway Using Command One With Valid Auth, Access Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithValidAuthAndAccessWithInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeader().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

	}

	@Test(priority = 2, description = "Test Case #2,Verify Delete Gateway Using Command One With Valid Auth Token And Invalid Params")
	@Description("Test Case #4,Verify Delete Gateway Using Command One With Valid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Delete Gateway Using Command One With Valid Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithValidAuthAndInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

	}

	@Test(priority = 3, description = "Test Case #3,Verify Delete Gateway Using Command One With Invalid Auth Token")
	@Description("Test Case #5,Verify Delete Gateway Using Command One With Invalid Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Delete Gateway Using Command One With Invalid Auth Token")
	public void testDeleteGatewayUsingCommandOneWithInvalidAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 4, description = "Test Case #4,Verify Delete Gateway Using Command One With Invalid Auth Token And Invalid Params")
	@Description("Test Case #6,Verify Delete Gateway Using Command One With Invalid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Delete Gateway Using Command One With Invalid Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithInvalidAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
	}

	@Test(priority = 5, description = "Test Case #5 Verify Delete Gateway Using Command One With Valid Expired Auth Token")
	@Description("Test Case #7,Verify Delete Gateway Using Command One With Valid Expired Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Delete Gateway Using Command One With Valid Expired Auth Token")
	public void testDeleteGatewayUsingCommandOneWithValidExpiredAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 6, description = "Test Case #6,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params")
	@Description("Test Case #8,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithValidExpiredAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 7, description = "Test Case #7,Verify Delete Gateway Using Command One With Valid Auth And Invalid Access Token")
	@Description("Test Case #9,Verify Delete Gateway Using Command One With Valid Auth And Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Delete Gateway Using Command One With Valid Auth And Invalid Access Token")
	public void testDeleteGatewayUsingCommandOneWithValidAuthAndInvalidAccess() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 8, description = "Test Case #8,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params")
	@Description("Test Case #10,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithValidAuthInvalidAccessAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 9, description = "Test Case #9,Verify Delete Gateway Using Command One With Empty Auth Token")
	@Description("Test Case #11,Verify Delete Gateway Using Command One With Empty Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Delete Gateway Using Command One With Empty Auth Token")
	public void testDeleteGatewayUsingCommandOneWithEmptyAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 10, description = "Test Case #10,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params")
	@Description("Test Case #12,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandOneWithEmptyAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
	}
	
	@Test(priority = 11, description = "Test Case #10,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params Invalid Path")
	@Description("Test Case #12,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Delete Gateway Using Command One With Empty Auth Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandOneWithEmptyAuthAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway--df");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
		
	}
	
	@Test(priority = 12, description = "Test Case #9,Verify Delete Gateway Using Command One With Empty Auth Token Invalid Path")
	@Description("Test Case #11,Verify Delete Gateway Using Command One With Empty Auth Token Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Delete Gateway Using Command One With Empty Auth Token Invalid Path")
	public void testDeleteGatewayUsingCommandOneWithEmptyAuthInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gatewayrgers--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	
	@Test(priority = 13, description = "Test Case #6,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params Invalid Path")
	@Description("Test Case #8,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Delete Gateway Using Command One With Valid Expired Auth Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandOneWithValidExpiredAuthAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gatewaygferw--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	
	@Test(priority = 14, description = "Test Case #8,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	@Description("Test Case #10,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Delete Gateway Using Command One With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandOneWithValidAuthInvalidAccessAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gatewayeedh--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	/////////////////////////////////////////////////// Delete Gateway Using Command 1//////////////////////////////////////////////////////
	
	
	
	@Test(priority = 15, description = "Test Case #1,Verify Delete Gateway Using Command Three With Valid Auth, Access Token And Invalid Params")
	@Description("Test Case #2,Verify Delete Gateway Using Command Three With Valid Auth, Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Delete Gateway Using Command Three With Valid Auth, Access Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithValidAuthAndAccessWithInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeader().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

	}

	@Test(priority = 16, description = "Test Case #2,Verify Delete Gateway Using Command Three With Valid Auth Token And Invalid Params")
	@Description("Test Case #4,Verify Delete Gateway Using Command Three With Valid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Delete Gateway Using Command Three With Valid Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithValidAuthAndInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.DELETE, "devices/gateway--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

	}

	@Test(priority = 17, description = "Test Case #3,Verify Delete Gateway Using Command Three With Invalid Auth Token")
	@Description("Test Case #5,Verify Delete Gateway Using Command Three With Invalid Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Delete Gateway Using Command Three With Invalid Auth Token")
	public void testDeleteGatewayUsingCommandThreeWithInvalidAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("1")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 18, description = "Test Case #4,Verify Delete Gateway Using Command Three With Invalid Auth Token And Invalid Params")
	@Description("Test Case #6,Verify Delete Gateway Using Command Three With Invalid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Delete Gateway Using Command Three With Invalid Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithInvalidAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
	}

	@Test(priority = 19, description = "Test Case #5 Verify Delete Gateway Using Command Three With Valid Expired Auth Token")
	@Description("Test Case #7,Verify Delete Gateway Using Command Three With Valid Expired Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Delete Gateway Using Command Three With Valid Expired Auth Token")
	public void testDeleteGatewayUsingCommandThreeWithValidExpiredAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 20, description = "Test Case #6,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params")
	@Description("Test Case #8,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithValidExpiredAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.GET, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 21, description = "Test Case #7,Verify Delete Gateway Using Command Three With Valid Auth And Invalid Access Token")
	@Description("Test Case #9,Verify Delete Gateway Using Command Three With Valid Auth And Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Delete Gateway Using Command Three With Valid Auth And Invalid Access Token")
	public void testDeleteGatewayUsingCommandThreeWithValidAuthAndInvalidAccess() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 22, description = "Test Case #8,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params")
	@Description("Test Case #10,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithValidAuthInvalidAccessAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 23, description = "Test Case #9,Verify Delete Gateway Using Command Three With Empty Auth Token")
	@Description("Test Case #11,Verify Delete Gateway Using Command Three With Empty Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Delete Gateway Using Command Three With Empty Auth Token")
	public void testDeleteGatewayUsingCommandThreeWithEmptyAuth() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 24, description = "Test Case #10,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params")
	@Description("Test Case #12,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params")
	public void testDeleteGatewayUsingCommandThreeWithEmptyAuthAndInvalidParams() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gateway");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
	}
	
	@Test(priority = 25, description = "Test Case #10,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params Invalid Path")
	@Description("Test Case #12,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Delete Gateway Using Command Three With Empty Auth Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandThreeWithEmptyAuthAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gateway--df");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));
		
	}
	
	@Test(priority = 26, description = "Test Case #9,Verify Delete Gateway Using Command Three With Empty Auth Token Invalid Path")
	@Description("Test Case #11,Verify Delete Gateway Using Command Three With Empty Auth Token Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Delete Gateway Using Command Three With Empty Auth Token Invalid Path")
	public void testDeleteGatewayUsingCommandThreeWithEmptyAuthInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gatewayrgers--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	
	@Test(priority = 27, description = "Test Case #6,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params Invalid Path")
	@Description("Test Case #8,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Delete Gateway Using Command Three With Valid Expired Auth Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandThreeWithValidExpiredAuthAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.GET, "devices/gatewaygferw--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	
	@Test(priority = 28, description = "Test Case #8,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	@Description("Test Case #10,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Delete Gateway Using Command Three With Valid Auth, Invalid Access Token And Invalid Params Invalid Path")
	public void testDeleteGatewayUsingCommandThreeWithValidAuthInvalidAccessAndInvalidParamsInvalidPath() throws JsonProcessingException {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("Gateway_id", testDataProp.getProperty(""))
				.param("command", testDataProp.getProperty("3")).request(Method.DELETE, "devices/gatewayeedh--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

	}
		/////////////////////////////////////////////////// Delete Gateway Using Command Three//////////////////////////////////////////////////////
	}




