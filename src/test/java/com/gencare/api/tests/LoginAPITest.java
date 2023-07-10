package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.login.api.payloads.LoginAPIPayload;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginAPITest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(LoginAPITest.class.getName());

	public static String accessToken;
	public static String idToken;

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #1,Verify Login API")
	@Description("Test Case #1,Verify Login API")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Login API")
	public void testLoginAPI() throws JsonProcessingException {

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload.getLoginPayload())
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		String authtoken = js.get("data.access_token");
		String idtoken = js.get("data.id_token");

		LoginAPITest.accessToken = authtoken;
		LoginAPITest.idToken = idtoken;

		System.out.println(res);
		System.out.println(authtoken);
		System.out.println(idtoken);

		APIUtils.assertions(response, "200");

	}
}
