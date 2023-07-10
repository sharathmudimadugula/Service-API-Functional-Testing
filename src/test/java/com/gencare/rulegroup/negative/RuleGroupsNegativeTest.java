package com.gencare.rulegroup.negative;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.occupants.negative.OccupantsNegative;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RuleGroupsNegativeTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(RuleGroupsNegativeTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Test Case #,Verify Get Rule Groups With Valid Auth, Access Token And Invalid Path")
	@Description("Test Case #2,Verify Get Rule Groups With Valid Auth, Access Token And Invalid Path")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2,Verify Get Rule Groups With Valid Auth, Access Token And Invalid Path")
	public void testGetRuleGroupsWithValidAuthAndAccessWithInvalidParams() throws Exception {
		logger.info("Starting of testGetRuleGroupsWithValidAuthAndAccessWithInvalidParams method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.ervalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "400");

		logger.info("Ending of testGetRuleGroupsWithValidAuthAndAccessWithInvalidPath method");

	}

	@Test(priority = 2, description = "Test Case #2,Verify Get Rule Groups With Valid Auth Token And Invalid Params")
	@Description("Test Case #4,Verify Get Rule Groups With Valid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4,Verify Get Rule Groups With Valid Auth Token And Invalid Params")
	public void testGetOccupantsWithValidAuthAndInvalidParams() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.ialue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "400");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("invalid.params.error.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthAndInvalidParams method");

	}

	@Test(priority = 3, description = "Test Case #3,Verify Get Rule Groups With Invalid Auth Token")
	@Description("Test Case #5,Verify Get Rule Groups With Invalid Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5,Verify Get Rule Groups With Invalid Auth Token")
	public void testGetOccupantsWithInvalidAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithInvalidAuth method");

	}

	@Test(priority = 4, description = "Test Case #4,Verify Get Rule Groups With Invalid Auth Token And Invalid Params")
	@Description("Test Case #6,Verify Get Rule Groups With Invalid Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6,Verify Get Rule Groups With Invalid Auth Token And Invalid Params")
	public void testGetOccupantsWithInvalidAuthAndInvalidParams() throws Exception {
		logger.info("Starting of testGetOccupantsWithInvalidAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groupsvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithInvalidAuthAndInvalidParams method");

	}

	@Test(priority = 5, description = "Test Case #5,Verify Get Rule Groups With Valid Expired Auth Token")
	@Description("Test Case #7,Verify Get Rule Groups With Valid Expired Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7,Verify Get Rule Groups With Valid Expired Auth Token")
	public void testGetOccupantsWithValidExpiredAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidExpiredAuth method");

	}

	@Test(priority = 6, description = "Test Case #6,Verify Get Rule Groups With Valid Expired Auth Token And Invalid Params")
	@Description("Test Case #8,Verify Get Rule Groups With Valid Expired Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #8,Verify Get Rule Groups With Valid Expired Auth Token And Invalid Params")
	public void testGetOccupantsWithValidExpiredAuthAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidExpiredAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groupsFB");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidExpiredAuthAndInvalidPath method");

	}

	@Test(priority = 7, description = "Test Case #7,Verify Get Rule Groups With Valid Auth And Invalid Access Token")
	@Description("Test Case #9,Verify Get Rule Groups With Valid Auth And Invalid Access Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #9,Verify Get Rule Groups With Valid Auth And Invalid Access Token")
	public void testGetOccupantsWithValidAuthAndInvalidAccess() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 8, description = "Test Case #8,Verify Get Rule Groups With Valid Auth, Invalid Access Token And Invalid Params")
	@Description("Test Case #10,Verify Get Rule Groups With Valid Auth, Invalid Access Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #10,Verify Get Rule Groups With Valid Auth, Invalid Access Token And Invalid Params")
	public void testGetOccupantsWithValidAuthInvalidAccessAndInvalidPath() throws Exception {
		logger.info("Starting of testGetOccupantsWithValidAuthInvalidAccessAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groupssFV");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "404");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithValidAuthInvalidAccessAndInvalidPath method");

	}

	@Test(priority = 9, description = "Test Case #9,Verify Get Rule Groups With Empty Auth Token")
	@Description("Test Case #11,Verify Get Rule Groups With Empty Auth Token")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #11,Verify Get Rule Groups With Empty Auth Token")
	public void testGetOccupantsWithEmptyAuth() throws Exception {
		logger.info("Starting of testGetOccupantsWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithEmptyAuth method");

	}

	@Test(priority = 10, description = "Test Case #10,Verify Get Rule Groups With Empty Auth Token And Invalid Params")
	@Description("Test Case #12,Verify Get Rule Groups With Empty Auth Token And Invalid Params")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #12,Verify Get Rule Groups With Empty Auth Token And Invalid Params")
	public void testGetOccupantsWithEmptyAuthAndInvalidParams() throws Exception {
		logger.info("Starting of testGetOccupantsWithEmptyAuthAndInvalidParams method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");

		String res = response.asString();

		System.out.println(res);

		APIUtils.assertions(response, "401");
		APIUtils.assertions(response.body().asString().contains("message"),
				expectedAssertionsProp.getProperty("not.authorised.message"));

		logger.info("Ending of testGetOccupantsWithEmptyAuthAndInvalidParams method");

		/////////////////////////////////////////////////// Rule
		/////////////////////////////////////////////////// Groups///////////////////////////////////////////////////////////////
	}
}
