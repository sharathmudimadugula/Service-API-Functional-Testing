package com.gencare.home.negative;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Epic("Home functionality")
@Feature("Home functionality test")
public class HomeTest extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(HomeTest.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the slider list Passing With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Invalid Path")
	@Story("Verify the slider list Passing With Invalid Path")
	public void verifySliderListPassingWithInvalidPath() {
		logger.info("Stating of verify SliderListPassingWithInvalidPath method");
		
		Response response = APIUtils.setBaseRequestHeader()
				.request(Method.GET, "occupants/slider_list....");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderListPassingWithInvalidPath method");

	}
	

	@Test(priority = 2, description = "Verify the slider list Passing With Expaired Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Expaired Path")
	@Story("Verify the slider list Passing With Expaired Path")
	public void verifySliderListPassingWithExpairedAuth() {
		logger.info("Stating of verify verifySliderListPassingWithExpairedAuth method");
		
		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.request(Method.GET, "occupants/slider_list");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderListPassingWithExpairedAuth method");

	}
	
	
	
	@Test(priority = 3, description = "Verify the slider list Passing With Invalid Path and Expaired Auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Invalid Path and Expaired Auth")
	@Story("Verify the slider list Passing With Invalid Path and Expaired Auth")
	public void verifySliderListPassingWithInvalidPathandExpairedAuth() {
		logger.info("Stating of verify verifySliderListPassingWithInvalidPathandExpairedAuth method");
		
		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.request(Method.GET, "occupants/slider_list....");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderListPassingWithInvalidPathandExpairedAuth method");

	}
	
	
	
	@Test(priority = 4, description = "Verify the slider list Passing With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Invalid Token")
	@Story("Verify the slider list with Passing With Invalid Token")
	public void verifySliderListPassingWithInvalidToken() {
		logger.info("Stating of verifySliderListPassingWithInvalidToken method");
		
		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.request(Method.GET, "occupants/slider_list");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderListPassingWithInvalidToken  method");
				
	}
	@Test(priority = 5, description = "Verify the slider list Passing With Valid Auth And Invalid Access With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Valid Auth And Invalid Access With Invalid Path")
	@Story("Verify the slider list Passing With Valid Auth And Invalid Access With Invalid Path")
	public void verifySliderListPassingWithValidAuthAndInvalidAccessWithInvalidPath() {
		logger.info("Stating of verifySliderListPassingWithValidAuthAndInvalidAccessWithInvalidPath method");
		
		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.request(Method.GET, "occupants/slider_listsgfsg--++");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderListPassingWithValidAuthAndInvalidAccessWithInvalidPath  method");
				
	}
	
	
	@Test(priority = 6, description = "Verify the slider list Passing With Valid Auth And Invalid Access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Valid Auth And Invalid Access")
	@Story("Verify the slider list Passing With Valid Auth And Invalid Access")
	public void verifySliderListPassingWithValidAuthAndInvalidAccess() {
		logger.info("Stating of verifySliderListPassingWithEmptyAuth method");
		
		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.request(Method.GET, "occupants/slider_list");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderListPassingWithEmptyAuth  method");
				
	}
	@Test(priority = 7, description = "Verify the slider list Passing With Empty Auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider list Passing With Empty Auth")
	@Story("Verify the slider list Passing With Empty Auth")
	public void verifySliderListPassingWithEmptyAuth() {
		logger.info("Stating of verifySliderListPassingWithEmptyAuth method");
		
		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.request(Method.GET, "occupants/slider_list");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderListPassingWithEmptyAuth  method");
				
	}
	
		@Test(priority = 8, description = "Verify the slider list Passing With Invalid Path Invalid Token")
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description:Verify the slider list Passing With Invalid Path Invalid Token")
		@Story("Verify the slider list Passing With Invalid Path Invalid Token")
		public void verifySliderListPassingWithInvalidPathInvalidToken() {
			logger.info("Stating of verify SliderListPassingWithInvalidPath method");
			
			Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
					.request(Method.GET, "occupants/slider_list....");
			String res = response.asString();
			JsonPath js = new JsonPath(res);
			APIUtils.assertions(response, "404");

			logger.info("Ending of verifySliderListPassingWithInvalidPath method");

		
                        /////////////////////////////Slider List/////////////////////////////////
	}

	@Test(priority = 9, description = "Verify the slider details With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Invalid Path")
	@Story("Verify the slider details With Invalid Path")
	public void verifySliderDetailsWithInvalidPath() {
		logger.info("Stating of verifySliderDetailsWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderListPassingWithInvalidToken method");

	}
	
	@Test(priority = 10, description = "Verify the slider details With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Invalid Token")
	@Story("Verify the slider details With Invalid Token")
	public void verifySliderDetailsWithInvalidToken() {
		logger.info("Stating of verifySliderDetailsWithInvalidToken method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderDetailsWithInvalidToken method");

	}
	
	@Test(priority = 11, description = "Verify the slider details With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Special Characters")
	@Story("Verify the slider details With Special Characters")
	public void verifySliderDetailsWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetailsWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithSpecialCharacters method");

	}
	

	@Test(priority = 12, description = "Verify the slider details With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Numeric Value")
	@Story("Verify the slider details With Numeric Value")
	public void verifySliderDetailsWithNumericValue() {
		logger.info("Stating of verifySliderDetailsWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithNumericValue method");

	}
	@Test(priority = 13, description = "Verify the slider details With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Boolean Value")
	@Story("Verify the slider details With Boolean Value")
	public void verifySliderDetailsWithBooleanValue() {
		logger.info("Stating of verifySliderDetailsWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithBooleanValue method");

	}
	@Test(priority = 14, description = "Verify the slider details With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Null Value")
	@Story("Verify the slider details With Null Value")
	public void verifySliderDetailsWithNullValue() {
		logger.info("Stating of verifySliderDetailsWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().params("id","", null).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithNullValue method");

	}
	
	@Test(priority = 15, description = "Verify the slider details With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Alpha Numeric")
	@Story("Verify the slider details With Alpha Numeric")
	public void verifySliderDetailsWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetailsWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithAlphaNumeric method");

	}
	@Test(priority = 16, description = "Verify the slider details With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With String")
	@Story("Verify the slider details With String")
	public void verifySliderDetailsWithString() {
		logger.info("Stating of verifySliderDetailsWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =17, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderDetailsWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");
                                          /////////////////////////////Slider Details  ID     /////////////////////////////////
	}
	@Test(priority = 18, description = "Verify the slider details With Gateway Tile With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Invalid Path")
	@Story("Verify the slider details With Gateway Tile With Invalid Path")
	public void verifySliderDetailsWithGatewayTileWithInvalidPath() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithInvalidPath method");

	}
	
	@Test(priority = 19, description = "Verify the slider details With Gateway Tile With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Invalid Token")
	@Story("Verify the slider details With Gateway Tile With Invalid Token")
	public void verifySliderDetailsWithGatewayTileWithInvalidToken() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithInvalidToken method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithInvalidToken method");

	}
	
	@Test(priority = 20, description = "Verify the slider details With Gateway Tile With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Special Characters")
	@Story("Verify the slider details With Gateway Tile With Special Characters")
	public void verifySliderDetailsWithGatewayTileWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithSpecialCharacters method");

	}
	

	@Test(priority = 21, description = "Verify the slider details With Gateway Tile With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Numeric Value")
	@Story("Verify the slider details With Gateway Tile With Numeric Value")
	public void verifySliderDetailsWithGatewayTileWithNumericValue() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithNumericValue method");

	}
	@Test(priority = 22, description = "Verify the slider details With Gateway Tile With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Boolean Value")
	@Story("Verify the slider details With Gateway Tile With Boolean Value")
	public void verifySliderDetailsWithGatewayTileWithBooleanValue() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithBooleanValue method");

	}
	@Test(priority = 23, description = "Verify the slider details With Gateway Tile With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Null Value")
	@Story("Verify the slider details With Gateway Tile With Null Value")
	public void verifySliderDetailsWithGatewayTileWithNullValue() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().params("id","", null).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithNullValue method");

	}
	
	@Test(priority = 24, description = "Verify the slider details With Gateway Tile With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With Alpha Numeric")
	@Story("Verify the slider details With Gateway Tile With Alpha Numeric")
	public void verifySliderDetailsWithGatewayTileWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithAlphaNumeric method");

	}
	@Test(priority = 25, description = "Verify the slider details With Gateway Tile With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile With String")
	@Story("Verify the slider details With Gateway Tile With String")
	public void verifySliderDetailsWithGatewayTileWithString() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithString method");

	}
	
	@Test(priority =26, description = "Verify the slider details With Gateway Tile with space")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Gateway Tile with space")
	@Story("Verify the slider details With Gateway Tile with space")
	public void verifySliderDetailsWithGatewayTileWithSpace() {
		logger.info("Stating of verifySliderDetailsWithGatewayTileWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsWithGatewayTileWithSpace method");
                                          /////////////////////////////Slider Details with gateway tile/////////////////////////////////
	}
	@Test(priority = 27, description = "Verify the slider details Type With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Type With Special Characters")
	@Story("Verify the slider details Type With Special Characters")
	public void verifySliderDetailsTypeWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetailsTypeWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.withspl.character"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithSpecialCharacters method");

	}
	

	@Test(priority = 28, description = "Verify the slider details Type With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Type With Numeric Value")
	@Story("Verify the slider details Type With Numeric Value")
	public void verifySliderDetailsTypeWithNumericValue() {
		logger.info("Stating of verifySliderDetailsTypeWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.numeric"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithNumericValue method");

	}
	@Test(priority = 29, description = "Verify the slider details Type With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Type With Boolean Value")
	@Story("Verify the slider details Type With Boolean Value")
	public void verifySliderDetailsTypeWithBooleanValue() {
		logger.info("Stating of verifySliderDetailsTypeWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", false)
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithBooleanValue method");

	}
	@Test(priority = 30, description = "Verify the slider details With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Null Value")
	@Story("Verify the slider details With Null Value")
	public void verifySliderDetailsTypeWithNullValue() {
		logger.info("Stating of verifySliderDetailsTypeWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).params("type","", null)
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithNullValue method");

	}
	@Test(priority = 31, description = "Verify the slider details With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Alpha Numeric")
	@Story("Verify the slider details With Alpha Numeric")
	public void verifySliderDetailsTypeWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetailsTypeWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.alphanumeric"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithAlphaNumeric method");

	}
	@Test(priority = 32, description = "Verify the slider details Type WithS tring")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Type WithS tring")
	@Story("Verify the slider details Type WithS tring")
	public void verifySliderDetailsTypeWithString() {
		logger.info("Stating of verifySliderDetailsTypeWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty(""))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithString method");

	}
	
	@Test(priority =33, description = "Verify the slider details With Space")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details With Space")
	@Story("Verify the slider details With Space")
	public void verifySliderDetailsTypeWithSpace() {
		logger.info("Stating of verifySliderDetailsTypeWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.space"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsTypeWithSpace method");
                                          /////////////////////////////Slider Details     Type    /////////////////////////////////
	}
	
	@Test(priority = 34, description = "Verify the slider details Location Type With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Special Characters")
	@Story("Verify the slider details Location Type With Special Characters")
	public void verifySliderDetailsLocationTypeWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.withspl.character"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithSpecialCharacters method");

	}
	
	@Test(priority = 35, description = "Verify the slider details Location Type With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Numeric Value")
	@Story("Verify the slider details Location Type With Numeric Value")
	public void verifySliderDetailsLocationTypeWithNumericValue() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.numeric"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithNumericValue method");

	}
	@Test(priority = 36, description = "Verify the slider details Location Type With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Boolean Value")
	@Story("Verify the slider details Location Type With Boolean Value")
	public void verifySliderDetailsLocationTypeWithBooleanValue() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", false)
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithBooleanValue method");

	}
	@Test(priority = 37, description = "Verify the slider details Location Type With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Null Value")
	@Story("Verify the slider details Location Type With Null Value")
	public void verifySliderDetailsLocationTypeWithNullValue() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).params("type","", null)
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithNullValue method");

	}
	@Test(priority = 38, description = "Verify the slider details Location Type With Alpha Numeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Alpha Numeric")
	@Story("Verify the slider details Location Type With Alpha Numeric")
	public void verifySliderDetailsLocationTypeWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.alphanumeric"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithAlphaNumeric method");

	}
	@Test(priority = 39, description = "Verify the slider details Location Type With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With String")
	@Story("Verify the slider details Location Type With String")
	public void verifySliderDetailsLocationTypeWithString() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty(""))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithString method");

	}
	
	@Test(priority =40, description = "Verify the slider details Location Type With Space")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details Location Type With Space")
	@Story("Verify the slider details Location Type With Space")
	public void verifySliderDetailsLocationTypeWithSpace() {
		logger.info("Stating of verifySliderDetailsLocationTypeWithSpace method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.space"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetailsLocationTypeWithSpace method");
                                          /////////////////////////////Slider Details   Location  Type    /////////////////////////////////
	}
	@Test(priority = 41, description = "Verify the slider Categories With Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Invalid Path")
	@Story("Verify the slider Categories With Invalid Path")
	public void verifySliderCategoriesWithInvalidPath() {
		logger.info("Stating of verifySliderCategoriesWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderCategoriesWithInvalidPath method");

	}
	
	@Test(priority =42, description = "Verify the slider Categories With Invalid Token")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Invalid Token")
	@Story("Verify the slider Categories With Invalid Token")
	public void verifySliderCategoriesWithInvalidToken() {
		logger.info("Stating of verifySliderCategoriesWithInvalidToken method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderCategoriesWithInvalidToken method");

	}
	
	@Test(priority = 43, description = "Verify the slider Categories With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Special Characters")
	@Story("Verify the slider Categories With Special Characters")
	public void verifySliderCategoriesWithSpecialCharacters() {
		logger.info("Stating of verifySliderCategoriesWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithSpecialCharacters method");

	}
	

	@Test(priority = 44, description = "Verify the slider Categories With Numeric Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Numeric Value")
	@Story("Verify the slider Categories With Numeric Value")
	public void verifySliderCategoriesWithNumericValue() {
		logger.info("Stating of verifySliderCategoriesWithNumericValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithNumericValue method");

	}
	@Test(priority = 45, description = "Verify the slider Categories With Boolean Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Boolean Value")
	@Story("Verify the slider Categories With Boolean Value")
	public void verifySliderCategoriesWithBooleanValue() {
		logger.info("Stating of verifySliderCategoriesWithBooleanValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithBooleanValue method");

	}
	@Test(priority = 46, description = "Verify the slider Categories With Null Value")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With Null Value")
	@Story("Verify the slider Categories With Null Value")
	public void verifySliderCategoriesWithNullValue() {
		logger.info("Stating of verifySliderCategoriesWithNullValue method");

		Response response = APIUtils.setBaseRequestHeader().param("id","", null).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithNullValue method");

	}
	@Test(priority = 47, description = "Verify the slider Categories With AlphaNumeric")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With AlphaNumeric")
	@Story("Verify the slider Categories With AlphaNumeric")
	public void verifySliderCategoriesWithAlphaNumeric() {
		logger.info("Stating of verifySliderCategoriesWithAlphaNumeric method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithAlphaNumeric method");

	}
	@Test(priority = 48, description = "Verify the slider Categories With String")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories With String")
	@Story("Verify the slider Categories With String")
	public void verifySliderCategoriesWithString() {
		logger.info("Stating of verifySliderCategoriesWithString method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =49, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesWithString method");
                                          /////////////////////////////Slider Categories ID     /////////////////////////////////
	}
	
	@Test(priority = 50, description = "Verify the slider Categories Type With Special Characters")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider Categories Type With Special Characters")
	@Story("Verify the slider Categories Type With Special Characters")
	public void verifySliderCategoriesTypeWithSpecialCharacters() {
		logger.info("Stating of verifySliderCategoriesTypeWithSpecialCharacters method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.withspl.character"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderCategoriesTypeWithSpecialCharacters method");

	}
	

	@Test(priority = 51, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithNumericValue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.numeric"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 52, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithBooleanVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", false)
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 53, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithNullVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).params("type","", null)
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority = 54, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.alphanumeric"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 55, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithString() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty(""))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =53, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesTypeWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.space"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");
                                          /////////////////////////////Slider categories    type    /////////////////////////////////
	}
	
	@Test(priority = 57, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithInvalidPath() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories...");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =58, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithInvalidToken() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority = 59, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.withspl.character")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	

	@Test(priority = 60, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithNumericValue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.numeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 61, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithBooleanVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", false).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 62, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithNullVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().params("id","", null).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 63, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.alphanumeric")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/slider_details");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 64, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithString() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =65, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.with.space")).param("type", testDataProp.getProperty("gateway.slider.details"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");
                                          /////////////////////////////Slider Categories  Location   ID     /////////////////////////////////
	}
	
	@Test(priority = 66, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithSpecialCharacters() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.withspl.character"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	

	@Test(priority = 67, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithNumericValue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.numeric"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 68, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithBooleanVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", false)
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 69, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithNullVlue() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type","", null)
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority = 70, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithAlphaNumeric() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.alphanumeric"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	@Test(priority = 71, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithString() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty(""))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");

	}
	
	@Test(priority =72, description = "Verify the slider details")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the slider details")
	@Story("Verify the slider details")
	public void verifySliderCategoriesLocationTypeWithSpace() {
		logger.info("Stating of verifySliderDetails method");

		Response response = APIUtils.setBaseRequestHeader().param("id", testDataProp.getProperty("id.getvalue.sliderdetails")).param("type", testDataProp.getProperty("type.getvalue.with.space"))
				.request(Method.GET, "occupants/categories");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifySliderDetails method");
		 /////////////////////////////Slider Categories  Location   type     /////////////////////////////////
	}              
}
