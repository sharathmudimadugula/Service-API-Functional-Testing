package com.gencare.alerts.negative;


import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.notificationtoken.negative.tests.NotificationTokensNegativeTests;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class AlertsNegativeTest  extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(NotificationTokensNegativeTests.class.getName());


@BeforeClass
@Parameters({ "baseURI" })
public void initAuthentication(String baseURI) {
	logger.info("Starting of intiAuthentication method");

	RestAssured.baseURI = baseURI;

	logger.info("Ending of initAuthentication method");
}


@Test(priority = 1, description = "Test Case #2,Verify Get Devices Alerts Count With Valid Auth, Access Token And Invalid Params")
@Description("Test Case #2,Verify Get Devices Alerts Count With Valid Auth, Access Token And Invalid Params")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #2,Verify Get Devices Alerts Count With Valid Auth, Access Token And Invalid Params")
public void testGetDevicesAlertsCountWithValidAuthAndAccessWithInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

}

@Test(priority = 2, description = "Test Case #4,Verify Get Devices Alerts Count With Valid Auth Token And Invalid Path")
@Description("Test Case #4,Verify Get Notification Token API With Valid Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #4,Verify Get Devices Alerts Count With Valid Auth Token And Invalid Path")
public void testGetDevicesAlertsCountWithValidAuthAndInvalidParams() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidAuth().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

}

@Test(priority = 3, description = "Test Case #5,Verify Get Devices Alerts Count With Invalid Auth Token")
@Description("Test Case #5,Verify Get Devices Alerts Count With Invalid Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #5,Verify Get Devices Alerts Count With Invalid Auth Token")
public void testGetDevicesAlertsCountWithInvalidAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/device_alerts_count");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 4, description = "Test Case #6,Verify Get Devices Alerts Count With Invalid Auth Token And Invalid Path")
@Description("Test Case #6,Verify Get Devices Alerts Count With Invalid Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #6,Verify Get Devices Alerts Count With Invalid Auth Token And Invalid Path")
public void testGetDevicesAlertsCountWithInvalidAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
}

@Test(priority = 5, description = "Test Case #7,Verify Get Devices Alerts Count With Valid Expired Auth Token")
@Description("Test Case #7,Verify Get Devices Alerts Count With Valid Expired Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #7,Verify Get Devices Alerts Count With Valid Expired Auth Token")
public void testGetDevicesAlertsCountWithValidExpiredAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/device_alerts_count");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
	
}

@Test(priority = 6, description = "Test Case #8,Verify Get Devices Alerts Count With Valid Expired Auth Token And Invalid Path")
@Description("Test Case #8,Verify Get Devices Alerts Count With Valid Expired Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #8,Verify Get Devices Alerts Count With Valid Expired Auth Token And Invalid Path")
public void testGetDevicesAlertsCountWithValidExpiredAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 7, description = "Test Case #9,Verify Get Devices Alerts Count With Valid Auth And Invalid Access Token")
@Description("Test Case #9,Verify Get Devices Alerts Count With Valid Auth And Invalid Access Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #9,Verify Get Devices Alerts Count With Valid Auth And Invalid Access Token")
public void testGetDevicesAlertsCountWithValidAuthAndInvalidAccess() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/device_alerts_count");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 8, description = "Test Case #10,Verify Get Devices Alerts Count With Valid Auth, Invalid Access Token And Invalid Path")
@Description("Test Case #10,Verify Get Devices Alerts Count With Valid Auth, Invalid Access Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #10,Verify Get Devices Alerts Count With Valid Auth, Invalid Access Token And Invalid Path")
public void testGetDevicesAlertsCountWithValidAuthInvalidAccessAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 9, description = "Test Case #11,Verify Get Devices Alerts Count With Empty Auth Token")
@Description("Test Case #11,Verify Get Devices Alerts Count With Empty Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #11,Verify Get Devices Alerts Count With Empty Auth Token")
public void testGetDevicesAlertsCountWithEmptyAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/device_alerts_count");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 10, description = "Test Case #12,Verify Get Devices Alerts Count With Empty Auth Token And Invalid Path")
@Description("Test Case #12,Verify Get Devices Alerts Count With Empty Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #12,Verify Get Devices Alerts Count With Empty Auth Token And Invalid Path")
public void testGetDevicesAlertsCountWithEmptyAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/device_alerts_count--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
	
	
	 ///////////////////////////////////////////////////GET Devices Alerts count//////////////////////////////////////////////////////
}


@Test(priority = 11, description = "Test Case #2,Verify Get Occuppant Alerts With Valid Auth, Access Token And Invalid Params")
@Description("Test Case #2,Verify Get Occuppant Alerts With Valid Auth, Access Token And Invalid Params")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #2,Verify Get Occuppant Alerts With Valid Auth, Access Token And Invalid Params")
public void testGetOccuppantAlertsWithValidAuthAndAccessWithInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeader().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

}

@Test(priority = 12, description = "Test Case #4,Verify Get Occuppant Alerts With Valid Auth Token And Invalid Path")
@Description("Test Case #4,Verify Get Occuppant Alerts With Valid Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #4,Verify Get Occuppant Alerts With Valid Auth Token And Invalid Path")
public void testGetOccuppantAlertsWithValidAuthAndInvalidParams() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidAuth().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("invalid.params.error.message"));

}

@Test(priority = 13, description = "Test Case #5,Verify Get Occuppant Alerts With Invalid Auth Token")
@Description("Test Case #5,Verify Get Occuppant Alerts With Invalid Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #5,Verify Get Occuppant Alerts With Invalid Auth Token")
public void testGetOccuppantAlertsWithInvalidAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/alerts");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 14, description = "Test Case #6,Verify Get Occuppant Alerts With Invalid Auth Token And Invalid Path")
@Description("Test Case #6,Verify Get Occuppant Alerts With Invalid Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #6,Verify Get Occuppant Alerts With Invalid Auth Token And Invalid Path")
public void testGetOccuppantAlertsWithInvalidAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
}

@Test(priority = 15, description = "Test Case #7,Verify Get Occuppant Alerts With Valid Expired Auth Token")
@Description("Test Case #7,Verify Get Occuppant Alerts With Valid Expired Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #7,Verify Get Occuppant Alerts With Valid Expired Auth Token")
public void testGetOccuppantAlertsWithValidExpiredAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/alerts");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
	
}

@Test(priority = 16, description = "Test Case #8,Verify Get Occuppant Alerts With Valid Expired Auth Token And Invalid Path")
@Description("Test Case #8,Verify Get Occuppant Alerts With Valid Expired Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #8,Verify Get Occuppant Alerts With Valid Expired Auth Token And Invalid Path")
public void testGetOccuppantAlertsWithValidExpiredAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 17, description = "Test Case #9,Verify Get Occuppant Alerts With Valid Auth And Invalid Access Token")
@Description("Test Case #9,Verify Get Occuppant Alerts With Valid Auth And Invalid Access Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #9,Verify Get Occuppant Alerts With Valid Auth And Invalid Access Token")
public void testGetOccuppantAlertsWithValidAuthAndInvalidAccess() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/device_alerts_count");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 18, description = "Test Case #10,Verify Get Occuppant Alerts With Valid Auth, Invalid Access Token And Invalid Path")
@Description("Test Case #10,Verify Get Occuppant Alerts With Valid Auth, Invalid Access Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #10,Verify Get Occuppant Alerts With Valid Auth, Invalid Access Token And Invalid Path")
public void testGetOccuppantAlertsWithValidAuthInvalidAccessAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 19, description = "Test Case #11,Verify Get Occuppant Alerts With Empty Auth Token")
@Description("Test Case #11,Verify Get Occuppant Alerts With Empty Auth Token")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #11,Verify Get Occuppant Alerts With Empty Auth Token")
public void testGetOccuppantAlertsWithEmptyAuth() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/alerts");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "401");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));

}

@Test(priority = 20, description = "Test Case #12,Verify Get Occuppant Alerts With Empty Auth Token And Invalid Path")
@Description("Test Case #12,Verify Get Occuppant Alerts With Empty Auth Token And Invalid Path")
@Severity(SeverityLevel.BLOCKER)
@Story("Test Case #12,Verify Get Occuppant Alerts With Empty Auth Token And Invalid Path")
public void testGetOccuppantAlertsWithEmptyAuthAndInvalidPath() throws JsonProcessingException {

	Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().request(Method.GET, "occupants/alerts--");

	String res = response.asString();

	System.out.println(res);

	APIUtils.assertions(response, "404");
	APIUtils.assertions(response.body().asString().contains("message"), expectedAssertionsProp.getProperty("not.authorised.message"));
	
	
	 ///////////////////////////////////////////////////GET Occupants Alerts //////////////////////////////////////////////////////
}
}
