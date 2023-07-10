package com.gencare.notificationtoken.negative.tests;

import static org.testng.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
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
public class NotificationTokensNegativeTests extends BaseAutomationTest {
			private static final Logger logger = Logger.getLogger(NotificationTokensNegativeTests.class.getName());


		@BeforeClass
		@Parameters({ "baseURI" })
		public void initAuthentication(String baseURI) {
			logger.info("Starting of intiAuthentication method");

			RestAssured.baseURI = baseURI;

			logger.info("Ending of initAuthentication method");
		}


		@Test(priority = 1, description = "Test Case #2,Verify Get Notification Token API With Valid Auth, Access Token And Invalid Params")
		@Description("Test Case #2,Verify Get Notification Token API With Valid Auth, Access Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #2,Verify Get Notification Token API With Valid Auth, Access Token And Invalid Params")
		public void testGetNotificationTokenAPIWithValidAuthAndAccessWithInvalidPath() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/feqfnotification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "404");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

		}
		
		@Test(priority = 2, description = "Test Case #3,Verify Get Notification Token API With Valid Auth Token")
		@Description("Test Case #3,Verify Get Notification Token API With Valid Auth Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #3,Verify Get Notification Token API With Valid Auth Token")
		public void testGetNotificationTokenAPIWithValidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "200");
			assertNotNull(response.body().asString().contains("data"));

		}
		
		@Test(priority = 3, description = "Test Case #4,Verify Get Notification Token API With Valid Auth Token And Invalid Params")
		@Description("Test Case #4,Verify Get Notification Token API With Valid Auth Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #4,Verify Get Notification Token API With Valid Auth Token And Invalid Params")
		public void testGetNotificationTokenAPIWithValidAuthAndInvalidPath() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().request(Method.GET, "occupants/adnotification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "404");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

		}
		
		@Test(priority = 4, description = "Test Case #5,Verify Get Notification Token API With Invalid Auth Token")
		@Description("Test Case #5,Verify Get Notification Token API With Invalid Auth Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #5,Verify Get Notification Token API With Invalid Auth Token")
		public void testGetNotificationTokenAPIWithInvalidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 5, description = "Test Case #6,Verify Get Notification Token API With Invalid Auth Token And Invalid Params")
		@Description("Test Case #6,Verify Get Notification Token API With Invalid Auth Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #6,Verify Get Notification Token API With Invalid Auth Token And Invalid Params")
		public void testGetNotificationTokenAPIWithInvalidAuthAndInvalidParams() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
		}
		
		@Test(priority = 6, description = "Test Case #7,Verify Get Notification Token API With Valid Expired Auth Token")
		@Description("Test Case #7,Verify Get Notification Token API With Valid Expired Auth Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #7,Verify Get Notification Token API With Valid Expired Auth Token")
		public void testGetNotificationTokenAPIWithValidExpiredAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
			
		}
		
		@Test(priority = 7, description = "Test Case #8,Verify Get Notification Token API With Valid Expired Auth Token And Invalid Params")
		@Description("Test Case #8,Verify Get Notification Token API With Valid Expired Auth Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #8,Verify Get Notification Token API With Valid Expired Auth Token And Invalid Params")
		public void testGetNotificationTokenAPIWithValidExpiredAuthAndInvalidParams() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 8, description = "Test Case #9,Verify Get Notification Token API With Valid Auth And Invalid Access Token")
		@Description("Test Case #9,Verify Get Notification Token API With Valid Auth And Invalid Access Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #9,Verify Get Notification Token API With Valid Auth And Invalid Access Token")
		public void testGetNotificationTokenAPIWithValidAuthAndInvalidAccess() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 9, description = "Test Case #10,Verify Get Notification Token API With Valid Auth, Invalid Access Token And Invalid Params")
		@Description("Test Case #10,Verify Get Notification Token API With Valid Auth, Invalid Access Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #10,Verify Get Notification Token API With Valid Auth, Invalid Access Token And Invalid Params")
		public void testGetNotificationTokenAPIWithValidAuthInvalidAccessAndInvalidParams() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 10, description = "Test Case #11,Verify Get Notification Token API With Empty Auth Token")
		@Description("Test Case #11,Verify Get Notification Token API With Empty Auth Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #11,Verify Get Notification Token API With Empty Auth Token")
		public void testGetNotificationTokenAPIWithEmptyAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 11, description = "Test Case #12,Verify Get Notification Token API With Empty Auth Token And Invalid Params")
		@Description("Test Case #12,Verify Get Notification Token API With Empty Auth Token And Invalid Params")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #12,Verify Get Notification Token API With Empty Auth Token And Invalid Params")
		public void testGetNotificationTokenAPIWithEmptyAuthAndInvalidParams() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/notification_tokens?id=6fa1ef04-58e3-47d2-8565-57001481e511--");

			String res = response.asString();

			System.out.println(res);
		
			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
			
			
			 ///////////////////////////////////////////////////GET Notifications//////////////////////////////////////////////////////
		}
		

		
		@Test(priority = 12, description = "Test Case #2,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Url")
		@Description("Test Case #2,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #2,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Url")
		public void testPostNotificationTokenAPIWithValidAuthAndAccessWithInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeader().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 13, description = "Test Case #3,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Request Body")
		@Description("Test Case #3,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #3,Verify Post Notification Token API With Valid Auth, Access Token And Invalid Request Body")
		public void testPostNotificationTokenAPIWithValidAuthAndAccessWithInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeader().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "400");

		}
		
		@Test(priority = 14, description = "Test Case #4,Verify Post Notification Token API With Invalid Auth")
		@Description("Test Case #4,Verify Post Notification Token API With Invalid Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #4,Verify Post Notification Token API With Invalid Auth")
		public void testPostNotificationTokenAPIWithInvalidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 15, description = "Test Case #5,Verify Post Notification Token API With Invalid Auth And Invalid Url")
		@Description("Test Case #5,Verify Post Notification Token API With Invalid Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #5,Verify Post Notification Token API With Invalid Auth And Invalid Url")
		public void testPostNotificationTokenAPIWithInvalidAuthAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 16, description = "Test Case #6,Verify Post Notification Token API With Invalid Auth And Invalid Request Body")
		@Description("Test Case #6,Verify Post Notification Token API With Invalid Auth And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #6,Verify Post Notification Token API With Invalid Auth And Invalid Request Body")
		public void testPostNotificationTokenAPIWithInvalidAuthAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 17, description = "Test Case #7,Verify Post Notification Token API With Valid Expired Auth")
		@Description("Test Case #7,Verify Post Notification Token API With Valid Expired Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #7,Verify Post Notification Token API With Valid Expired Auth")
		public void testPostNotificationTokenAPIWithValidExpiredAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 18, description = "Test Case #8,Verify Post Notification Token API With Valid Expired Auth And Invalid Url")
		@Description("Test Case #8,Verify Post Notification Token API With Valid Expired Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #8,Verify Post Notification Token API With Valid Expired Auth And Invalid Url")
		public void testPostNotificationTokenAPIWithValidExpiredAuthAndInavlidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 19, description = "Test Case #9,Verify Post Notification Token API With Valid Expired Auth And Invalid Request Body")
		@Description("Test Case #9,Verify Post Notification Token API With Valid Expired Auth And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #9,Verify Post Notification Token API With Valid Expired Auth And Invalid Request Body")
		public void testPostNotificationTokenAPIWithValidExpiredAuthAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 20, description = "Test Case #10,Verify Post Notification Token API With Valid Auth")
		@Description("Test Case #10,Verify Post Notification Token API With Valid Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #10,Verify Post Notification Token API With Valid Auth")
		public void testPostNotificationTokenAPIWithValidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "200");

		}
		
		@Test(priority = 21, description = "Test Case #11,Verify Post Notification Token API With Valid Auth Invalid Url and Valid Request Body")
		@Description("Test Case #11,Verify Post Notification Token API With Valid Auth Invalid Url and Valid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #11,Verify Post Notification Token API With Valid Auth Invalid Url and Valid Request Body")
		public void testPostNotificationTokenAPIWithValidAuthInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 22, description = "Test Case #12,Verify Post Notification Token API With Valid Auth Valid Url Invalid Request Body")
		@Description("Test Case #12,Verify Post Notification Token API With Valid Auth Valid Url Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #12,Verify Post Notification Token API With Valid Auth Valid Url Invalid Request Body")
		public void testPostNotificationTokenAPIWithValidAuthInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "400");

		}
		
		@Test(priority = 23, description = "Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		@Description("Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		public void testPostNotificationTokenAPIWithValidAuthInvalidAccess() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 24, description = "Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		@Description("Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		public void testPostNotificationTokenAPIWithValidAuthInvalidAccessAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 25, description = "Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		@Description("Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		public void testPostNotificationTokenAPIWithValidAuthInvalidAccessAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 26, description = "Test Case #16,Verify Post Notification Token API With Empty Auth")
		@Description("Test Case #16,Verify Post Notification Token API With Empty Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #16,Verify Post Notification Token API With Empty Auth")
		public void testPostNotificationTokenAPIWithEmptyAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
		}
		
		@Test(priority = 27, description = "Test Case #17,Verify Post Notification Token API With Empty Auth And Invalid Url")
		@Description("Test Case #17,Verify Post Notification Token API With Empty Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #17,Verify Post Notification Token API With Empty Auth And Invalid Url")
		public void testPostNotificationTokenAPIWithEmptyAuthInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.os")))
					.request(Method.POST, "occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 28, description = "Test Case #18,Verify Post Notification Token API With Empty Auth And Inavlid Request Body")
		@Description("Test Case #18,Verify Post Notification Token API With Empty Auth And Inavlid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #18,Verify Post Notification Token API With Empty Auth And Inavlid Request Body")
		public void testPostNotificationTokenAPIWithEmptyAuthInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PostNotificationTokensPayload.postNotificationTokenPayload(testDataProp.getProperty("post.notification.token"), testDataProp.getProperty("post.notification.dnd"), testDataProp.getProperty("post.notification.invalid.os")))
					.request(Method.POST, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

			
			////////////////////////////////////POST Notifications//////////////////////////////////////////////////
		}
		
		
		@Test(priority = 29, description = "Test Case #2,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Url")
		@Description("Test Case #2,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #2,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Url")
		public void testPutNotificationTokenAPIWithValidAuthAndAccessWithInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeader().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 30, description = "Test Case #3,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Request Body")
		@Description("Test Case #3,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #3,Verify Put Notification Token API With Valid Auth And Access Token With Invalid Request Body")
		public void testPutNotificationTokenAPIWithValidAuthAndAccessWithInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeader().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 31, description = "Test Case #4,Verify Put Notification Token API With Invalid Auth")
		@Description("Test Case #4,Verify Put Notification Token API With Invalid Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #4,Verify Put Notification Token API With Invalid Auth")
		public void testPutNotificationTokenAPIWithInvalidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 32, description = "Test Case #5,Verify Put Notification Token API With Invalid Auth And Invalid Url")
		@Description("Test Case #5,Verify Put Notification Token API With Invalid Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #5,Verify Put Notification Token API With Invalid Auth And Invalid Url")
		public void testPutNotificationTokenAPIWithInvalidAuthAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 33, description = "Test Case #6,Verify Put Notification Token API With Invalid Auth And Invalid Request Body")
		@Description("Test Case #6,Verify Put Notification Token API With Invalid Auth And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #6,Verify Put Notification Token API With Invalid Auth And Invalid Request Body")
		public void testPutNotificationTokenAPIWithInvalidAuthAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 34, description = "Test Case #7,Verify Put Notification Token API With Valid Expired Auth")
		@Description("Test Case #7,Verify Put Notification Token API With Valid Expired Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #7,Verify Put Notification Token API With Valid Expired Auth")
		public void testPutNotificationTokenAPIWithValidExpiredAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 35, description = "Test Case #8,Verify Put Notification Token API With Valid Expired Auth And Invalid Url")
		@Description("Test Case #8,Verify Put Notification Token API With Valid Expired Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #8,Verify Put Notification Token API With Valid Expired Auth And Invalid Url")
		public void testPutNotificationTokenAPIWithValidExpiredAuthAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "aoccupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 36, description = "Test Case #9,Verify Put Notification Token API With Valid Expired Auth And Invalid Request Body")
		@Description("Test Case #9,Verify Put Notification Token API With Valid Expired Auth And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #9,Verify Put Notification Token API With Valid Expired Auth And Invalid Request Body")
		public void testPutNotificationTokenAPIWithValidExpiredAuthAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 37, description = "Test Case #10,Verify Put Notification Token API With Valid Auth")
		@Description("Test Case #10,Verify Put Notification Token API With Valid Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #10,Verify Put Notification Token API With Valid Auth")
		public void testPutNotificationTokenAPIWithValidAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "200");

		}
		
		@Test(priority = 38, description = "Test Case #11,Verify Put Notification Token API With Valid Auth And Invalid Url")
		@Description("Test Case #11,Verify Put Notification Token API With Valid Auth And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #11,Verify Put Notification Token API With Valid Auth And Invalid Url")
		public void testPutNotificationTokenAPIWithValidAuthAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokendh");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 39, description = "Test Case #12,Verify Put Notification Token API With Valid Auth And Invalid Request Body")
		@Description("Test Case #12,Verify Put Notification Token API With Valid Auth And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #12,Verify Put Notification Token API With Valid Auth And Invalid Request Body")
		public void testPutNotificationTokenAPIWithValidAuthAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithValidAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "400");

		}
		
		@Test(priority = 40, description = "Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		@Description("Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #13,Verify Post Notification Token API With Valid Auth Invalid Access Token")
		public void testPutNotificationTokenAPIWithValidAuthInvalidAccess() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 41, description = "Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		@Description("Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #14,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Url")
		public void testPutNotificationTokenAPIWithValidAuthInvalidAccessAndInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 42, description = "Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		@Description("Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #15,Verify Post Notification Token API With Valid Auth Invalid Access Token And Invalid Request Body")
		public void testPutNotificationTokenAPIWithValidAuthInvalidAccessAndInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 43, description = "Test Case #16,Verify Post Notification Token API With Empty Auth")
		@Description("Test Case #16,Verify Post Notification Token API With Empty Auth")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #16,Verify Post Notification Token API With Empty Auth")
		public void testPutNotificationTokenAPIWithEmptyAuth() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
		
		@Test(priority = 44, description = "Test Case #17,Verify Post Notification Token API With Empty Auth And Invalid Url")
		@Description("Test Case #17,Verify Post Notification Token API With Empty Auth  And Invalid Url")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #17,Verify Post Notification Token API With Empty Auth  And Invalid Url")
		public void testPutNotificationTokenAPIWithEmptyAuthInvalidUrl() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "api/v1/occupants/notification_token");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "404");

		}
		
		@Test(priority = 45, description = "Test Case #18,Verify Post Notification Token API With Empty Auth And Invalid Request Body")
		@Description("Test Case #18,Verify Post Notification Token API With Empty Auth  And Invalid Request Body")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #18,Verify Post Notification Token API With Empty Auth  And Invalid Request Body")
		public void testPutNotificationTokenAPIWithEmptyAuthInvalidRequestBody() throws JsonProcessingException {

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().body(PutNotificationTokensPayload.putNotificationTokenPayload(testDataProp.getProperty("put.notification.token.invalid.id"), testDataProp.getProperty("put.notification.token.os")))
					.request(Method.PUT, "occupants/notification_tokens");

			String res = response.asString();
			System.out.println(res);

			APIUtils.assertions(response, "401");
			APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

		}
////////////////////////////////////////////////////PUT Notifications//////////////////////////////////////////////////////
		
	}


