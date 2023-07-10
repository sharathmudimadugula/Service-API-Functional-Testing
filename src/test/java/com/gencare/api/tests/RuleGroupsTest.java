package com.gencare.api.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RuleGroupsTest extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(RuleGroupsTest.class.getName());

	@BeforeClass
	@Parameters({ "baseURI" })
	public void initAuthentication(String baseURI) {
		logger.info("Starting of intiAuthentication method");

		RestAssured.baseURI = baseURI;

		logger.info("Ending of initAuthentication method");
	}

	@Test(priority = 1, description = "Verify the Get rule groups")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Get rule groups")
	@Story("Verify the Get rule groups")
	public void verifyGetRuleGroups() {
		logger.info("Stating of verifyGetRuleGroups method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("rule_group_id", testDataProp.getProperty("rule.groups.idvalue")).get("rule_groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "200");
		logger.info("Ending of verifyGetRuleGroups  method");

	}
}
