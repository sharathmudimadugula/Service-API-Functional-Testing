package com.gencare.groups.negative;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GroupsNegativeTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(GroupsNegativeTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the Occupant Groups With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Invalid Path")
	@Story("Verify the Occupant Groups With Invalid Path")
	public void verifyOccupantGroupsWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithInvalidPath method");

	}

	@Test(priority = 2, description = "Verify the Occupant Groups With Invalid Token With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Invalid Token With Invalid Path")
	@Story("Verify the Occupant Groups With Invalid Token With Invalid Path")
	public void verifyOccupantGroupsWithInvalidTokenWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidTokenWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups...--");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithInvalidTokenWithInvalidPath method");

	}

	@Test(priority = 3, description = "Verify the Occupant Groups With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Invalid Token")
	@Story("Verify the Occupant Groups With Invalid Token")
	public void verifyOccupantGroupsWithInvalidToken() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidToken method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyOccupantGroupsWithInvalidToken method");

	}

	@Test(priority = 4, description = "Verify the Occupant Groups With Special Characters With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Special Characters With Invalid Path")
	@Story("Verify the Occupant Groups With Special Characters With Invalid Path")
	public void verifyOccupantGroupsWithSpecialCharactersAndInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithSpecialCharactersAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.withspl.character"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups-..,--");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithSpecialCharactersAndInvalidPath method");

	}

	@Test(priority = 5, description = "Verify the Occupant Groups With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Special Characters")
	@Story("Verify the Occupant Groups With Special Characters")
	public void verifyOccupantGroupsWithSpecialCharacters() {
		logger.info("Stating of verifyOccupantGroupsWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.withspl.character"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithSpecialCharacters method");

	}

	@Test(priority = 6, description = "Verify the Occupant Groups With Numeric Value With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Numeric Value With Invalid Path")
	@Story("Verify the Occupant Groups With Numeric Value With Invalid Path")
	public void verifyOccupantGroupsWithNumericValueWithInvalidPath() {
		logger.info("Stating of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.numeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

	}

	@Test(priority = 7, description = "Verify the Occupant Groups With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Numeric Value")
	@Story("Verify the Occupant Groups With Numeric Value")
	public void verifyOccupantGroupsWithNumericValue() {
		logger.info("Stating of verifySliderDetailsliderDetailsWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.numeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

	}

	@Test(priority = 8, description = "Verify the Occupant Groups With Boolean Value With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Boolean Value With Invalid Path")
	@Story("Verify the Occupant Groups With Boolean Value With Invalid Path")
	public void verifyOccupantGroupsWithBooleanValuewithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithBooleanValuewithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groupsgerwye-++");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithBooleanValuewithInvalidPath method");

	}

	@Test(priority = 9, description = "Verify the Occupant Groups With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Boolean Value")
	@Story("Verify the Occupant Groups With Boolean Value")
	public void verifyOccupantGroupsWithBooleanValue() {
		logger.info("Stating of verifyOccupantGroupsWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithBooleanValue method");

	}

	@Test(priority = 10, description = "Verify the Occupant Groups With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Null Value")
	@Story("Verify the Occupant Groups With Null Value")
	public void verifyOccupantGroupsWithNullValue() {
		logger.info("Stating of verifyOccupantGroupsWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().params("id", "", null)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithNullValue method");

	}

	@Test(priority = 11, description = "Verify the Occupant Groups With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With Alpha Numeric")
	@Story("Verify the Occupant Groups With Alpha Numeric")
	public void verifyOccupantGroupsWithAlphaNumeric() {
		logger.info("Stating of verifyOccupantGroupsWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithAlphaNumeric method");

	}
	@Test(priority = 12, description = "Verify the Occupant Groups With String With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With String With Invalid Path")
	@Story("Verify the Occupant Groups With String With Invalid Path")
	public void verifyOccupantGroupsWithStringWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithStringWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty(""))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithStringWithInvalidPath method");

	}
	@Test(priority = 13, description = "Verify the Occupant Groups With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups With String")
	@Story("Verify the Occupant Groups With String")
	public void verifyOccupantGroupsWithString() {
		logger.info("Stating of verifyOccupantGroupsWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty(""))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groupsfgger--sg");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithString method");

	}

	@Test(priority = 14, description = "Verify the Occupant Groups with space")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Groups with space")
	@Story("Verify the Occupant Groups with space")
	public void verifyOccupantGroupsWithSpace() {
		logger.info("Stating of verifyOccupantGroupsWithSpace method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.space"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithSpace method");
		///////////////////////////////////////////////// Get occupant Groups//////////////////////////////////////////////////////////////
	}
	
	
	@Test(priority = 15, description = "Verify the Occupant Group With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Invalid Path")
	@Story("Verify the Occupant Group With Invalid Path")
	public void verifyOccupantGroupWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithInvalidPath method");

	}

	@Test(priority = 16, description = "Verify the Occupant Group With Invalid Token With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Invalid Token With Invalid Path")
	@Story("Verify the Occupant Group With Invalid Token With Invalid Path")
	public void verifyOccupantGroupWithInvalidTokenWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidTokenWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups...--");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithInvalidTokenWithInvalidPath method");

	}

	@Test(priority = 17, description = "Verify the Occupant Group With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Invalid Token")
	@Story("Verify the Occupant Group With Invalid Token")
	public void verifyOccupantGroupWithInvalidToken() {
		logger.info("Stating of verifyOccupantGroupsWithInvalidToken method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("id", testDataProp.getProperty("id.getvalue.sliderdetails"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyOccupantGroupsWithInvalidToken method");

	}

	@Test(priority = 18, description = "Verify the Occupant Group With Special Characters With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Special Characters With Invalid Path")
	@Story("Verify the Occupant Group With Special Characters With Invalid Path")
	public void verifyOccupantGroupWithSpecialCharactersAndInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithSpecialCharactersAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.withspl.character"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups-..,--");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithSpecialCharactersAndInvalidPath method");

	}

	@Test(priority = 19, description = "Verify the Occupant Group With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Special Characters")
	@Story("Verify the Occupant Group With Special Characters")
	public void verifyOccupantGroupWithSpecialCharacters() {
		logger.info("Stating of verifyOccupantGroupsWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.withspl.character"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithSpecialCharacters method");

	}

	@Test(priority = 20, description = "Verify the Occupant Group With Numeric Value With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Numeric Value With Invalid Path")
	@Story("Verify the Occupant Group With Numeric Value With Invalid Path")
	public void verifyOccupantGroupWithNumericValueWithInvalidPath() {
		logger.info("Stating of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.numeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

	}

	@Test(priority = 21, description = "Verify the Occupant Group With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Numeric Value")
	@Story("Verify the Occupant Group With Numeric Value")
	public void verifyOccupantGroupWithNumericValue() {
		logger.info("Stating of verifySliderDetailsliderDetailsWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.numeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsliderDetailsWithNumericValueWithInvalidPath method");

	}

	@Test(priority = 22, description = "Verify the Occupant Group With Boolean Value With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Boolean Value With Invalid Path")
	@Story("Verify the Occupant Group With Boolean Value With Invalid Path")
	public void verifyOccupantGroupWithBooleanValuewithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithBooleanValuewithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groupsgerwye-++");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyOccupantGroupsWithBooleanValuewithInvalidPath method");

	}

	@Test(priority = 23, description = "Verify the Occupant Group With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Boolean Value")
	@Story("Verify the Occupant Group With Boolean Value")
	public void verifyOccupantGroupWithBooleanValue() {
		logger.info("Stating of verifyOccupantGroupsWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithBooleanValue method");

	}

	@Test(priority = 24, description = "Verify the Occupant Group With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Null Value")
	@Story("Verify the Occupant Group With Null Value")
	public void verifyOccupantGroupWithNullValue() {
		logger.info("Stating of verifyOccupantGroupsWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().params("id", "", null)
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithNullValue method");

	}

	@Test(priority = 25, description = "Verify the Occupant Group With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With Alpha Numeric")
	@Story("Verify the Occupant Group With Alpha Numeric")
	public void verifyOccupantGroupWithAlphaNumeric() {
		logger.info("Stating of verifyOccupantGroupsWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithAlphaNumeric method");

	}
	@Test(priority = 26, description = "Verify the Occupant Group With String With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With String With Invalid Path")
	@Story("Verify the Occupant Group With String With Invalid Path")
	public void verifyOccupantGroupWithStringWithInvalidPath() {
		logger.info("Stating of verifyOccupantGroupsWithStringWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty(""))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/groups");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithStringWithInvalidPath method");

	}
	@Test(priority = 27, description = "Verify the Occupant Group With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group With String")
	@Story("Verify the Occupant Group With String")
	public void verifyOccupantGroupWithString() {
		logger.info("Stating of verifyOccupantGroupsWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty(""))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/group");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyOccupantGroupsWithString method");

	}

	@Test(priority = 28, description = "Verify the Occupant Group with space")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the Occupant Group with space")
	@Story("Verify the Occupant Group with space")
	public void verifyOccupantGroupWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", testDataProp.getProperty("id.getvalue.with.space"))
				.param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");
		///////////////////////////////////////////////// Get occupant Group//////////////////////////////////////////////////////////////
	}
}
