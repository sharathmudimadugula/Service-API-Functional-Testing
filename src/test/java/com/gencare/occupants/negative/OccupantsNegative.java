package com.gencare.occupants.negative;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.notificationtokens.payloads.PostNotificationTokensPayload;
import com.gencare.notificationtokens.payloads.PutNotificationTokensPayload;
import com.gencare.occupants.payloads.CreateOccupantRegisterPayload;
import com.gencare.occupants.payloads.UpdateOccupantProfilePayload;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class OccupantsNegative extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(OccupantsNegative.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #2,Verify Get Occupants With Valid Auth, Access Token And Invalid Params")
	@Description("Test Case #2,Verify Get Occupants With Valid Auth, Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Get Occupants With Valid Auth, Access Token And Invalid Params")
	public void testGetOccupantsWithValidAuthAndAccessWithInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthAndAccessWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().request(Method.GET,
				"occupants/profile--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");

		logger.info("Ending of testGetOccupantsWithValidAuthAndAccessWithInvalidPath method");

	}

	@Test(priority = 2, description = "Test Case #4,Verify Get Occupants With Valid Auth Token And Invalid Params")
	@Description("Test Case #4,Verify Get Occupants With Valid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Get Occupants With Valid Auth Token And Invalid Params")
	public void testGetOccupantsWithValidAuthAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().request(Method.GET,
				"occupants/profile--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthAndInvalidParams method");

	}

	@Test(priority = 3, description = "Test Case #5,Verify Get Occupants With Invalid Auth Token")
	@Description("Test Case #5,Verify Get Occupants With Invalid Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Get Occupants With Invalid Auth Token")
	public void testGetOccupantsWithInvalidAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET,
				"occupants/profile");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithInvalidAuth method");

	}

	@Test(priority = 4, description = "Test Case #6,Verify Get Occupants With Invalid Auth Token And Invalid Params")
	@Description("Test Case #6,Verify Get Occupants With Invalid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Get Occupants With Invalid Auth Token And Invalid Params")
	public void testGetOccupantsWithInvalidAuthAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithInvalidAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET,
				"occupants/profile--");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithInvalidAuthAndInvalidParams method");

	}

	@Test(priority = 5, description = "Test Case #7,Verify Get Occupants With Valid Expired Auth Token")
	@Description("Test Case #7,Verify Get Occupants With Valid Expired Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Get Occupants With Valid Expired Auth Token")
	public void testGetOccupantsWithValidExpiredAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET,
				"occupants/profile");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidExpiredAuth method");

	}

	@Test(priority = 6, description = "Test Case #8,Verify Get Occupants With Valid Expired Auth Token And Invalid Params")
	@Description("Test Case #8,Verify Get Occupants With Valid Expired Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Get Occupants With Valid Expired Auth Token And Invalid Params")
	public void testGetOccupantsWithValidExpiredAuthAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidExpiredAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET,
				"occupants/profilesf");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidExpiredAuthAndInvalidParams method");

	}

	@Test(priority = 7, description = "Test Case #9,Verify Get Occupants With Valid Auth And Invalid Access Token")
	@Description("Test Case #9,Verify Get Occupants With Valid Auth And Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Get Occupants With Valid Auth And Invalid Access Token")
	public void testGetOccupantsWithValidAuthAndInvalidAccess() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET,
				"occupants/profile");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 8, description = "Test Case #10,Verify Get Occupants With Valid Auth, Invalid Access Token And Invalid Params")
	@Description("Test Case #10,Verify Get Occupants With Valid Auth, Invalid Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Get Occupants With Valid Auth, Invalid Access Token And Invalid Params")
	public void testGetOccupantsWithValidAuthInvalidAccessAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthInvalidAccessAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET,
				"occupants/profileliu");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthInvalidAccessAndInvalidParams method");

	}

	@Test(priority = 9, description = "Test Case #11,Verify Get Occupants With Empty Auth Token")
	@Description("Test Case #11,Verify Get Occupants With Empty Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Get Occupants With Empty Auth Token")
	public void testGetOccupantsWithEmptyAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET,
				"occupants/profile");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithEmptyAuth method");

	}

	@Test(priority = 10, description = "Test Case #12,Verify Get Occupants With Empty Auth Token And Invalid Params")
	@Description("Test Case #12,Verify Get NOccupants With Empty Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Get Occupants With Empty Auth Token And Invalid Params")
	public void testGetOccupantsWithEmptyAuthAndInvalidParams() throws Exception {
		logger.info("Starting of testGetOccupantsWithEmptyAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET,
				"occupants/profile");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithEmptyAuthAndInvalidParams method");

		/////////////////////////////////////////////////// GET
		/////////////////////////////////////////////////// Occupants//////////////////////////////////////////////////////
	}
	

	@Test(priority = 1, description = "Test Case #2,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Url")
	@Description("Test Case #2,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Url")
	public void testPostOccupantRegisterWithValidAuthAndAccessWithInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeader().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registerdg");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 12, description = "Test Case #3,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Request Body")
	@Description("Test Case #3,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #3,Verify Post Occupant Register With Valid Auth, Access Token And Invalid Request Body")
	public void testPostOccupantRegisterWithValidAuthAndAccessWithInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeader().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");

	}
	
	@Test(priority = 13, description = "Test Case #4,Verify Post Occupant Register With Invalid Auth")
	@Description("Test Case #4,Verify Post Occupant Register With Invalid Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Post Occupant Register With Invalid Auth")
	public void testPostOccupantRegisterWithInvalidAuthAndInvalidBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 14, description = "Test Case #5,Verify Post Occupant Register With Invalid Auth And Invalid Url")
	@Description("Test Case #5,Verify Post Occupant Register With Invalid Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Post Occupant Register With Invalid Auth And Invalid Url")
	public void testPostOccupantRegisterWithInvalidAuthAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registersc");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 15, description = "Test Case #6,Verify Post Occupant Register With Invalid Auth And Invalid Request Body")
	@Description("Test Case #6,Verify Post Occupant Register With Invalid Auth And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Post Occupant Register With Invalid Auth And Invalid Request Body")
	public void testPostOccupantRegisterWithInvalidAuthAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 16, description = "Test Case #7,Verify Post Occupant Register With Valid Expired Auth")
	@Description("Test Case #7,Verify Post Occupant Register With Valid Expired Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Post Occupant Register With Valid Expired Auth")
	public void testPostOccupantRegisterWithValidExpiredAuth() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 17, description = "Test Case #8,Verify Post Occupant Register With Valid Expired Auth And Invalid Url")
	@Description("Test Case #8,Verify Post Occupant Register With Valid Expired Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Post Occupant Register With Valid Expired Auth And Invalid Url")
	public void testPostOccupantRegisterWithValidExpiredAuthAndInavlidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registersc");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 18, description = "Test Case #9,Verify Post Occupant Register With Valid Expired Auth And Invalid Request Body")
	@Description("Test Case #9,Verify Post Occupant Register With Valid Expired Auth And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Post Occupant Register With Valid Expired Auth And Invalid Request Body")
	public void testPostOccupantRegisterWithValidExpiredAuthAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	

	
	@Test(priority = 19, description = "Test Case #11,Verify Post Occupant Register With Valid Auth Invalid Url and Valid Request Body")
	@Description("Test Case #11,Verify Post Occupant Register With Valid Auth Invalid Url and Valid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Post Occupant Register With Valid Auth Invalid Url and Valid Request Body")
	public void testPostOccupantRegisterWithValidAuthInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registerasc");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 20, description = "Test Case #12,Verify Post Occupant Register With Valid Auth Valid Url Invalid Request Body")
	@Description("Test Case #12,Verify Post Occupant Register With Valid Auth Valid Url Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Post Occupant Register With Valid Auth Valid Url Invalid Request Body")
	public void testPostOccupantRegisterWithValidAuthInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");

	}
	
	@Test(priority = 21, description = "Test Case #13,Verify Post Occupant Register With Valid Auth Invalid Access Token")
	@Description("Test Case #13,Verify Post Occupant Register With Valid Auth Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #13,Verify Post Occupant Register With Valid Auth Invalid Access Token")
	public void testPostOccupantRegisterWithValidAuthInvalidAccessInvalidBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 22, description = "Test Case #14,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Url")
	@Description("Test Case #14,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #14,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Url")
	public void testPostOccupantRegisterWithValidAuthInvalidAccessAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registerscsdf");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 23, description = "Test Case #15,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Request Body")
	@Description("Test Case #15,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #15,Verify Post Occupant Register With Valid Auth Invalid Access Token And Invalid Request Body")
	public void testPostOccupantRegisterWithValidAuthInvalidAccessAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 24, description = "Test Case #16,Verify Post Occupant Register With Empty Auth")
	@Description("Test Case #16,Verify Post Occupant Register With Empty Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #16,Verify Post Occupant Register With Empty Auth")
	public void testPostOccupantRegisterWithEmptyAuthInvalidBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
	}
	
	@Test(priority = 25, description = "Test Case #17,Verify Post Occupant Register With Empty Auth And Invalid Url")
	@Description("Test Case #17,Verify Post Occupant Register With Empty Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #17,Verify Post Occupant Register With Empty Auth And Invalid Url")
	public void testPostOccupantRegisterWithEmptyAuthInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(CreateOccupantRegisterPayload.getCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/registerdaf");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 26, description = "Test Case #18,Verify Post Occupant Register With Empty Auth And Inavlid Request Body")
	@Description("Test Case #18,Verify Post Occupant Register With Empty Auth And Inavlid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #18,Verify Post Occupant Register With Empty Auth And Inavlid Request Body")
	public void testPostOccupantRegisterWithEmptyAuthInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(CreateOccupantRegisterPayload.getInvalidCreateOccupantRegisterPayload())
				.request(Method.POST, "occupants/register");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		
		////////////////////////////////////POST Occupant register //////////////////////////////////////////////////
	}
	
	@Test(priority = 27, description = "Test Case #2,Verify Edit Occupant With Valid Auth And Access Token With Invalid Url")
	@Description("Test Case #2,Verify Edit Occupant With Valid Auth And Access Token With Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Edit Occupant With Valid Auth And Access Token With Invalid Url")
	public void testEditOccupantWithValidAuthAndAccessWithInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeader().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantfsg");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 28, description = "Test Case #3,Verify Edit Occupant With Valid Auth And Access Token With Invalid Request Body")
	@Description("Test Case #3,Verify  Edit Occupant With Valid Auth And Access Token With Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #3,Verify Edit Occupant With Valid Auth And Access Token With Invalid Request Body")
	public void testEditOccupantWithValidAuthAndAccessWithInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeader().body(UpdateOccupantProfilePayload.getInvalidUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");

	}
	
	@Test(priority = 29, description = "Test Case #4,Verify Edit Occupant With Invalid Auth")
	@Description("Test Case #4,Verify Edit Occupant With Invalid Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Edit Occupant With Invalid Auth")
	public void testEditOccupantWithInvalidAuth() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 30, description = "Test Case #5,Verify Edit Occupant With Invalid Auth And Invalid Url")
	@Description("Test Case #5,Verify Edit Occupant With Invalid Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Edit Occupant With Invalid Auth And Invalid Url")
	public void testEditOccupantWithInvalidAuthAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantadf");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 31, description = "Test Case #6,Verify Edit Occupant With Invalid Auth And Invalid Request Body")
	@Description("Test Case #6,Verify Edit Occupant With Invalid Auth And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Edit Occupant With Invalid Auth And Invalid Request Body")
	public void testEditOccupantWithInvalidAuthAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(UpdateOccupantProfilePayload.getInvalidUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 32, description = "Test Case #7,Verify Edit Occupant With Valid Expired Auth")
	@Description("Test Case #7,Verify Edit Occupant With Valid Expired Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Edit Occupant With Valid Expired Auth")
	public void testEditOccupantWithValidExpiredAuth() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 33, description = "Test Case #8,Verify Edit Occupant With Valid Expired Auth And Invalid Url")
	@Description("Test Case #8,Verify Edit Occupant With Valid Expired Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Edit Occupant With Valid Expired Auth And Invalid Url")
	public void testEditOccupantWithValidExpiredAuthAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantgh");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 34, description = "Test Case #9,Verify Edit Occupant With Valid Expired Auth And Invalid Request Body")
	@Description("Test Case #9,Verify Edit Occupant With Valid Expired Auth And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Edit Occupant With Valid Expired Auth And Invalid Request Body")
	public void testEditOccupantWithValidExpiredAuthAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}

	@Test(priority = 35, description = "Test Case #11,Verify Edit Occupant With Valid Auth And Invalid Url")
	@Description("Test Case #11,Verify Edit Occupant With Valid Auth And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Edit Occupant With Valid Auth And Invalid Url")
	public void testEditOccupantWithValidAuthAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantgg");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 36, description = "Test Case #12,Verify Edit Occupant With Valid Auth And Invalid Request Body")
	@Description("Test Case #12,Verify Edit Occupant With Valid Auth And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Edit Occupant With Valid Auth And Invalid Request Body")
	public void testEditOccupantWithValidAuthAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(UpdateOccupantProfilePayload.getInvalidUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "400");

	}
	
	@Test(priority = 37, description = "Test Case #13,Verify Edit Occupant With Valid Auth Invalid Access Token")
	@Description("Test Case #13,Verify Edit Occupant With Valid Auth Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #13,Verify Edit Occupant With Valid Auth Invalid Access Token")
	public void testEditOccupantWithValidAuthInvalidAccess() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 38, description = "Test Case #14,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Url")
	@Description("Test Case #14,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #14,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Url")
	public void testEditOccupantWithValidAuthInvalidAccessAndInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantrgg");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 39, description = "Test Case #15,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Request Body")
	@Description("Test Case #15,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #15,Verify Edit Occupant With Valid Auth Invalid Access Token And Invalid Request Body")
	public void testEditOccupantWithValidAuthInvalidAccessAndInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(UpdateOccupantProfilePayload.getInvalidUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 40, description = "Test Case #16,Verify Edit Occupant With Empty Auth")
	@Description("Test Case #16,Verify Edit Occupant With Empty Auth")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #16,Verify Edit Occupant With Empty Auth")
	public void testEditOccupantWithEmptyAuth() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
	
	@Test(priority = 41, description = "Test Case #17,Verify Edit Occupant With Empty Auth And Invalid Url")
	@Description("Test Case #17,Verify Edit Occupant With Empty Auth  And Invalid Url")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #17,Verify Edit Occupant With Empty Auth  And Invalid Url")
	public void testEditOccupantWithEmptyAuthInvalidUrl() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(UpdateOccupantProfilePayload.getUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupantfdfh");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "404");

	}
	
	@Test(priority = 42, description = "Test Case #18,Verify Edit Occupant With Empty Auth And Invalid Request Body")
	@Description("Test Case #18,Verify Edit Occupant With Empty Auth  And Invalid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #18,Verify Edit Occupant With Empty Auth  And Invalid Request Body")
	public void testEditOccupantWithEmptyAuthInvalidRequestBody() throws Exception {

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(UpdateOccupantProfilePayload.getInvalidUpdateOccupantProfile())
				.request(Method.PUT, "occupants/edit_occupant");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

	}
////////////////////////////////////////////////////PUT Edit Occupant//////////////////////////////////////////////////////
	
	
}
