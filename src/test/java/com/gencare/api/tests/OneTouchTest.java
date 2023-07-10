package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.onetouch.payload.PostOneTouch;
import com.gencare.onetouch.payload.PutOneTouchPayload;
import com.gencare.permissions.payload.PostPermissions;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OneTouchTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(OneTouchTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the post permissions")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:verify post permissions")
	@Story("Verify the post permissions")
	public void verifyCreateOneTouch() throws Exception {
		logger.info("Stating of verifyCreateOneTouch method");

		Response response = APIUtils.setBaseRequestHeader().body(PostOneTouch.getPostOneTouchPayload())
				.post("one_touch");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyCreateOneTouch  method");

	}

	@Test(priority = 2, description = "Verify the post permissions")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:verify post permissions")
	@Story("Verify the post permissions")
	public void verifyUpdateOneTouch() throws Exception {
		logger.info("Stating of verifyCreateOneTouch method");

		Response response = APIUtils.setBaseRequestHeader().body(PutOneTouchPayload.getPutOneTouchPayload())
				.put("one_touch");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");

		logger.info("Ending of verifyCreateOneTouch  method");

	}
}
