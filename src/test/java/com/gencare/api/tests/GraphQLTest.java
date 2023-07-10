package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.cubeendpoint.payload.GraphQL;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GraphQLTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(GraphQLTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI1" })
	public void initAuthentication(String baseURI1) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI1;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Verify the get occupant dashboard attributes")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:the get occupant dashboard attributes")
	@Story("Verify occupant dashboard attributes")
	public void verifyGetDashBoardAttributes() throws Exception {
		logger.info("Stating of verifyGetDashBoardAttributes method");

		Response response = APIUtils.setQueryBaseRequestHeader().body(GraphQL.getGraphQLPayload()).get();

		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		logger.info("Ending of verifyGetDashBoardAttributes  method");

	}
}
