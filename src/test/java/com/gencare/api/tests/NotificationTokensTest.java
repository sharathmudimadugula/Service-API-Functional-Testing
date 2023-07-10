package com.gencare.api.tests;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.notificationtokens.payloads.PostNotificationTokensPayload;
import com.gencare.notificationtokens.payloads.PutNotificationTokensPayload;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class NotificationTokensTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(NotificationTokensTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #1,Verify Get Notification Token API With Valid Auth And Access Token")
	@Description("Test Case #1,Verify Get Notification Token API With Valid Auth And Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Get Notification Token API With Valid Auth And Access Token")
	public void testGetNotificationTokenAPIWithValidAuthAndAccess() throws Exception {
		logger.info("Starting of testGetNotificationTokenAPIWithValidAuthAndAccess method");

		Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/notification_tokens");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "200");
		assertNotNull(response.body().asString().contains("data"));
		
		logger.info("Ending of testGetNotificationTokenAPIWithValidAuthAndAccess method");

	}

	@Test(priority = 2, description = "Test Case #1,Verify Post Notification Token API With Valid Auth And Access Token")
	@Description("Test Case #1,Verify Post Notification Token API With Valid Auth And Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Post Notification Token API With Valid Auth And Access Token")
	public void testPostNotificationTokenAPIWithValidAuthAndAccess() throws Exception {
		logger.info("Starting of testPostNotificationTokenAPIWithValidAuthAndAccess method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PostNotificationTokensPayload.postNotificationTokenPayload(
						testDataProp.getProperty("post.notification.token"),
						testDataProp.getProperty("post.notification.dnd"),
						testDataProp.getProperty("post.notification.os")))
				.request(Method.POST, "occupants/notification_tokens");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "200");
		assertNotNull(response.body().asString().contains("data"));

		logger.info("Ending of testPostNotificationTokenAPIWithValidAuthAndAccess method");

	}

	@Test(priority = 3, description = "Test Case #1,Verify Put Notification Token API With Valid Auth And Access Token")
	@Description("Test Case #1,Verify Put Notification Token API With Valid Auth And Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1,Verify Put Notification Token API With Valid Auth And Access Token")
	public void testPutNotificationTokenAPIWithValidAuthAndAccess() throws Exception {
		logger.info("Starting of testPutNotificationTokenAPIWithValidAuthAndAccess method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutNotificationTokensPayload.putNotificationTokenPayload(
						testDataProp.getProperty("put.notification.token.id"), getUniqueAlphaNumericString(3)))
				.request(Method.PUT, "occupants/notification_tokens");

		String res = response.asString();
		System.out.println(res);

		APIUtils.assertions(response, "200");

		logger.info("Ending of testPutNotificationTokenAPIWithValidAuthAndAccess method");

	}

}
