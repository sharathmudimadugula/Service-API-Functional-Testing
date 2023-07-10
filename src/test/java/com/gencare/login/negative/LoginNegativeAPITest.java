package com.gencare.login.negative;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.tests.LoginAPITest;
import com.gencare.api.utils.APIUtils;
import com.gencare.login.payload.LoginAPIPayload;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginNegativeAPITest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(LoginNegativeAPITest.class.getName());

	public static String accessToken;
	public static String idToken;

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #1,Verify login API With Valid URL and Valid Request Body")
	@Description("Test Case #1,Verify login API With Valid URL and Valid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify login API With Valid URL and Valid Request Body")
	public void testLoginAPIWithValidURLAndValidRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndValidRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("email"), testDataProp.getProperty("password")))
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

		logger.info("Ending of testLoginAPIWithValidURLAndValidRequestBody method");

	}

	@Test(priority = 2, description = "Test Case #2,Verify login API With Invalid URL and Valid Request Body")
	@Description("Test Case #2,Verify login API With Invalid URL and Valid Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify login API With Invalid URL and Valid Request Body")
	public void testLoginAPIWithInvalidURLAndValidRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithInvalidURLAndValidRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("email"), testDataProp.getProperty("password")))
				.request(Method.POST, "users/logidf");

		APIUtils.assertions(response, "404");

		logger.info("Ending of testLoginAPIWithInvalidURLAndValidRequestBody method");

	}

	@Test(priority = 3, description = "Test Case #3,Verify login API With Valid URL and Empty Email And Empty Password Request Body")
	@Description("Test Case #3,Verify login API With Valid URL and Empty Email And Empty Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #3,Verify login API With Valid URL and Empty Email And Empty Password Request Body")
	public void testLoginAPIWithValidURLAndEmptyEmailAndEmptyPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndEmptyEmailAndEmptyPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader()
				.body(LoginAPIPayload.getLoginPayload(testDataProp.getProperty(""), testDataProp.getProperty("")))
				.request(Method.POST, "users/loginSFss");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		
		APIUtils.assertions(response, "404");


		logger.info("Ending of testLoginAPIWithValidURLAndEmptyEmailAndEmptyPasswordRequestBody method");

	}

	@Test(priority = 4, description = "Test Case #3,Verify login API With Valid URL and InValid Email Empty Password Request Body")
	@Description("Test Case #4,Verify login API With Valid URL and InValid Email Empty Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify login API With Valid URL and InValid Email Empty Password Request Body")
	public void testLoginAPIWithValidURLAndInValidEmailEmptyPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndInValidEmailEmptyPasswordRequestBody method");

		Response response = APIUtils
				.setLoginBaseRequestHeader().body(LoginAPIPayload
						.getLoginPayload(testDataProp.getProperty("invalidemail"), testDataProp.getProperty("")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(response.time());
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndInValidEmailEmptyPasswordRequestBody method");

	}

	@Test(priority = 5, description = "Test Case #3,Verify login API With Valid URL and Invalid Email Valid Password Request Body")
	@Description("Test Case #5,Verify login API With Valid URL and Invalid Email Valid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify login API With Valid URL and Invalid Email Valid Password Request Body")
	public void testLoginAPIWithValidURLAndInvalidEmailValidPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndInvalidEmailValidPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("invalidemail"), testDataProp.getProperty("password")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");

		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndInvalidEmailValidPasswordRequestBody method");

	}

	@Test(priority = 6, description = "Test Case #3,Verify login API With Valid URL and Valid Email Empty Password Request Body")
	@Description("Test Case #6,Verify login API With Valid URL and Valid Email Empty Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify login API With Valid URL and Valid Email Empty Password Request Body")
	public void testLoginAPIWithValidURLAndValidEmailEmptyPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndValidEmailEmptyPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader()
				.body(LoginAPIPayload.getLoginPayload(testDataProp.getProperty("email"), testDataProp.getProperty("")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndValidEmailEmptyPasswordRequestBody method");

	}
	
	@Test(priority = 7, description = "Test Case #3,Verify login API With Valid URL and Empty Email Invalid Password Request Body")
	@Description("Test Case #7,Verify login API With Valid URL and Empty Email Invalid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify login API With Valid URL and Empty Email Invalid Password Request Body")
	public void testLoginAPIWithValidURLAndEmptyEmailInvalidPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndEmptyEmailInvalidPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader()
				.body(LoginAPIPayload.getLoginPayload(testDataProp.getProperty(""), testDataProp.getProperty("invalidpassword")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndEmptyEmailInvalidPasswordRequestBody method");

	}
	
	@Test(priority = 8, description = "Test Case #3,Verify login API With Valid URL and Empty Email valid Password Request Body")
	@Description("Test Case #8,Verify login API With Valid URL and Empty Email valid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify login API With Valid URL and Empty Email valid Password Request Body")
	public void testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader()
				.body(LoginAPIPayload.getLoginPayload(testDataProp.getProperty(""), testDataProp.getProperty("password")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBody method");

	}
	@Test(priority = 9, description = "Test Case #3,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	@Description("Test Case #9,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	public void testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("email"), testDataProp.getProperty("invalidpassword")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBody method");

	}

	@Test(priority = 10, description = "Test Case #3,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	@Description("Test Case #10,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	public void testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBody() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBody method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("invalidemail"), testDataProp.getProperty("invalidpassword")))
				.request(Method.POST, "users/login");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "400");
		String message = js.get("message");
		System.out.println(message);


		logger.info("Ending of testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBody method");

	}
	@Test(priority = 11, description = "Test Case #3,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	@Description("Test Case #10,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify login API With Valid URL and InValid Email Invalid password Request Body")
	public void testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBodyWithInvalidPath() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBodyWithInvalidPath method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("invalidemail"), testDataProp.getProperty("invalidpassword")))
				.request(Method.POST, "users/loginsdg");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "404");
	


		logger.info("Ending of testLoginAPIWithValidURLAndInValidEmailInvalidpasswordRequestBodyWithInvalidPath method");

	}
	@Test(priority = 12, description = "Test Case #3,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	@Description("Test Case #9,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify login API With Valid URL and Valid Email Invalid Password Request Body")
	public void testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBodyWithInvalidPath() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBodyWithInvalidPath method");

		Response response = APIUtils.setLoginBaseRequestHeader().body(LoginAPIPayload
				.getLoginPayload(testDataProp.getProperty("email"), testDataProp.getProperty("invalidpassword")))
				.request(Method.POST, "users/logindfdv");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "404");
		


		logger.info("Ending of testLoginAPIWithValidURLAndValidEmailInvalidPasswordRequestBodyWithInvalidPath method");

	}
	
	@Test(priority = 13, description = "Test Case #3,Verify login API With Valid URL and Empty Email valid Password Request Body")
	@Description("Test Case #8,Verify login API With Valid URL and Empty Email valid Password Request Body")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify login API With Valid URL and Empty Email valid Password Request Body")
	public void testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBodyWithInvalidPath() throws JsonProcessingException {

		logger.info("Starting of testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBodyWithInvalidPath method");

		Response response = APIUtils.setLoginBaseRequestHeader()
				.body(LoginAPIPayload.getLoginPayload(testDataProp.getProperty(""), testDataProp.getProperty("password")))
				.request(Method.POST, "users/loginsd");

		String res = response.asString();

		JsonPath js = new JsonPath(res);

		System.out.println(response);
		APIUtils.assertions(response, "404");
	


		logger.info("Ending of testLoginAPIWithValidURLAndEmptyEmailvalidPasswordRequestBodyWithInvalidPath method");

	}
}
