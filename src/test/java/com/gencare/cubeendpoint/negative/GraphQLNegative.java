package com.gencare.cubeendpoint.negative;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.tests.GraphQLTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.cubeendpoint.payload.GraphQL;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GraphQLNegative extends BaseAutomationTest {

private static final Logger logger = Logger.getLogger(GraphQLTest.class.getName());

  @BeforeClass
  @Parameters({ "baseURI1" }) public void initAuthentication( String baseURI1)
  { logger.info("Starting of intiAuthentication method");
  
  RestAssured.baseURI =baseURI1 ;
  }
		@Test(priority = 1, description = "Verify the get GraphQL with passing invalid auth")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing invalid auth")
		@Story("Verify the get GraphQL with passing invalid auth")
		public void verifyGetGraphQLPassingWithInvalidAuth() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithInvalidAuth method");

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
					.body(GraphQL.getGraphQLPayload()).get();
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithInvalidAuth method");

		}

		@Test(priority = 2, description = "Verify the get GraphQL with passing empty auth")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing empty auth")
		@Story("Verify the get GraphQL with passing empty auth")
		public void verifyGetGraphQLPassingWithEmptyAuth() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithEmptyAuth method");

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
					.body(GraphQL.getGraphQLPayload()).get();
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithEmptyAuth method");

		}

		@Test(priority = 3, description = "Verify the get GraphQL with passing invalid access")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing invalid access")
		@Story("Verify the get GraphQL with passing invalid access")
		public void verifyGetGraphQLPassingWithInvalidAccess() throws JsonProcessingException {
			logger.info("Stating of verifyGetGraphQLPassingWithInvalidAccess method");

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
					.body(GraphQL.getGraphQLPayload()).get();
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithInvalidAccess method");

		}

		@Test(priority = 4, description = "Verify the get GraphQL with passing valid auth and invalid access")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing valid auth and  invalid access")
		@Story("Verify the get GraphQL with passing valid auth and invalid access")
		public void verifyGetGraphQLPassingWithValidAuthAndInvalidAccess() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithValidAuthAndInvalidAccess method");

			Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
					.body(GraphQL.getGraphQLPayload()).get();
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithValidAuthAndInvalidAccess method");

		}

		@Test(priority = 5, description = "Verify the get GraphQL with passing valid expired auth")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing valid expired auth")
		@Story("Verify the get GraphQL with passing valid expired auth")
		public void verifyGetGraphQLPassingWithValidExpiredAuth() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithValidExpiredAuth method");

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
					.body(GraphQL.getGraphQLPayload()).get();
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithValidExpiredAuth method");

		}

		@Test(priority = 6, description = "Verify the get GraphQL with passing valid expired auth")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing valid expired auth")
		@Story("Verify the get GraphQL with passing valid expired auth")
		public void verifyGeGraphQLPassingWithInvalidPath() throws Exception {
			logger.info("Stating of verifyGeGraphQLPassingWithInvalidPath method");

			Response response = APIUtils.setBaseRequestHeader()
					.body(GraphQL.getGraphQLPayload()).get("/1246ewfrf");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGeGraphQLPassingWithInvalidPath method");
		}

		@Test(priority = 7, description = "Verify the get GraphQL with passing valid expired auth invalid path")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing valid expired auth invalid path")
		@Story("Verify the get GraphQL with passing valid expired auth and invalid path")
		public void verifyGetGraphQLPassingWithValidExpiredAuthInvalidPath() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithValidExpiredAuthInvalidPath method");

			Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
					.body(GraphQL.getGraphQLPayload()).get("/ydgfy45878");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithValidExpiredAuthInvalidPath method");

		}

		@Test(priority = 8, description = "Verify the get GraphQL with passing invalid auth Invalid path")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing invalid auth Invalid path")
		@Story("Verify the get GraphQL with passing invalid auth Invalid path")
		public void verifyGetGraphQLPassingWithInvalidAuthInvalidPath() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithInvalidAuthInvalidPath method");

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
					.body(GraphQL.getGraphQLPayload()).get("/ydgfy45878");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithInvalidAuthInvalidPath method");

		}

		@Test(priority = 9, description = "Verify the get GraphQL with passing empty auth invalid path")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing empty auth invalid path")
		@Story("Verify the get GraphQL with passing empty auth Invaid path")
		public void verifyGetGraphQLPassingWithEmptyAuthInvalidPath() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithEmptyAuthInvalidPath method");

			Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
					.body(GraphQL.getGraphQLPayload()).get("/ydgfy45878");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithEmptyAuthInvalidPath method");

		}

		@Test(priority = 10, description = "Verify the get GraphQL with passing invalid access")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing invalid access")
		@Story("Verify the get GraphQL with passing invalid access")
		public void verifyGetGraphQLPassingWithInvalidAccessInvalidPath() throws Exception {
			logger.info("Stating of verifyGetGraphQLPassingWithInvalidAccessInvalidPath method");

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
					.body(GraphQL.getGraphQLPayload()).get("/ydgfy45878");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithInvalidAccessInvalidPath method");

		}

		@Test(priority = 11, description = "Verify the get GraphQL with passing invalid access  Empty Param Key")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing invalid access Empty Param Key")
		@Story("Verify the get GraphQL with passing invalid access Empty Param Key")
		public void verifyGetGraphQLPassingWithInvalidAccessInvalidPathEmptyBody() {
			logger.info("Stating of verifyGetGraphQLPassingWithInvalidAccessInvalidPathEmptyBody method");

			Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().body("").get("/ydgfy45878");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithInvalidAccessInvalidPathEmptyBody method");

		}

		@Test(priority = 12, description = "Verify the get GraphQL with passing valid access  Empty Param Key")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:verify get GraphQL with passing valid access Empty Param Key")
		@Story("Verify the get GraphQL with passing valid access Empty Param Key")
		public void verifyGetGraphQLPassingWithvalidAccessvalidPathEmptyParamKey() {
			logger.info("Stating of verifyGetGraphQLPassingWithvalidAccessvalidPathEmptyParamKey method");

			Response response = APIUtils.setBaseRequestHeader().body("").get("/uiehfuig");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			System.out.println(res);
			APIUtils.assertions(response, "500");

			logger.info("Ending of verifyGetGraphQLPassingWithvalidAccessvalidPathEmptyParamKey method");

			//////////////////////////////////// Get GraphQL///////////////////////////////////////

		}}