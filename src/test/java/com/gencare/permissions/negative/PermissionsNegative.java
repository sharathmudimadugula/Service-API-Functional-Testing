package com.gencare.permissions.negative;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.utils.APIUtils;
import com.gencare.permissions.payload.PostPermissions;
import com.gencare.permissions.payload.PutPermissionResend;
import com.gencare.permissions.payload.UpdatePermissions;

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

@Epic("Permissions functionality")
@Feature("Permissions functionality test")
public class PermissionsNegative extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(PermissionsNegative.class.getName());

	@BeforeClass
	public void initAuthentication() {
		logger.info("Stating of intiAuthentication method");
		RestAssured.baseURI = "https://dev-service.ctiotsolution.com/api/v1/";
		logger.info("Ending of intiAuthentication method");

	}

	@Test(priority = 1, description = "Verify the get occupants permissions with passing invalid auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing invalid auth")
	@Story("Verify the get occupants permissions with passing invalid auth")
	public void verifyGetOccupantsPermissionsPassingWithInvalidAuth() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidAuth method");

	}

	@Test(priority = 2, description = "Verify the get occupants permissions with passing empty auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing empty auth")
	@Story("Verify the get occupants permissions with passing empty auth")
	public void verifyGetOccupantsPermissionsPassingWithEmptyAuth() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithEmptyAuth method");

	}

	@Test(priority = 3, description = "Verify the get occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing invalid access")
	@Story("Verify the get occupants permissions with passing invalid access")
	public void verifyGetOccupantsPermissionsPassingWithInvalidAccess() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidAccess method");

	}

	@Test(priority = 4, description = "Verify the get occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the get occupants permissions with passing valid auth and invalid access")
	public void verifyGetOccupantsPermissionsPassingWithValidAuthAndInvalidAccess() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 5, description = "Verify the get occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing valid expired auth")
	@Story("Verify the get occupants permissions with passing valid expired auth")
	public void verifyGetOccupantsPermissionsPassingWithValidExpiredAuth() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithValidExpiredAuth method");

	}

	@Test(priority = 6, description = "Verify the get occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing valid expired auth")
	@Story("Verify the get occupants permissions with passing valid expired auth")
	public void verifyGetOccupantsPermissionsPassingWithInvalidPath() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions459gff");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidPath method");
	}

	@Test(priority = 7, description = "Verify the get occupants permissions with passing valid expired auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing valid expired auth invalid path")
	@Story("Verify the get occupants permissions with passing valid expired auth and invalid path")
	public void verifyGetOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissionsdvsv5484");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

	}

	@Test(priority = 8, description = "Verify the get occupants permissions with passing invalid auth Invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing invalid auth Invalid path")
	@Story("Verify the get occupants permissions with passing invalid auth Invalid path")
	public void verifyGetOccupantsPermissionsPassingWithInvalidAuthInvalidPath() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissionsfgjsduhg265959");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

	}

	@Test(priority = 9, description = "Verify the get occupants permissions with passing empty auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing empty auth invalid path")
	@Story("Verify the get occupants permissions with passing empty auth Invaid path")
	public void verifyGetOccupantsPermissionsPassingWithEmptyAuthInvalidPath() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissions11+5159");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

	}

	@Test(priority = 10, description = "Verify the get occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing invalid access")
	@Story("Verify the get occupants permissions with passing invalid access")
	public void verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPath() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("gateway_id", testDataProp.getProperty("gateway.idvalue.get.permission"))
				.get("occupants/permissionsdg5s48g4");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

	}

	@Test(priority = 11, description = "Verify the get occupants permissions with passing invalid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing invalid access Empty Param Key")
	@Story("Verify the get occupants permissions with passing invalid access Empty Param Key")
	public void verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("gateway_id", "")
				.get("occupants/permissionsdg5s48g4");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

	}

	@Test(priority = 12, description = "Verify the get occupants permissions with passing valid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify get occupants permissions with passing valid access Empty Param Key")
	@Story("Verify the get occupants permissions with passing valid access Empty Param Key")
	public void verifyGetOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey() {
		logger.info("Stating of verifyGetOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeader().param("gateway_id", "").get("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyGetOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey method");

		//////////////////////////////////// Get Occupant
		//////////////////////////////////// permissions///////////////////////////////////////

	}

	@Test(priority = 13, description = "Verify the Post occupants permissions with passing invalid auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid auth")
	@Story("Verify the Post occupants permissions with passing invalid auth")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAuth method");

	}

	@Test(priority = 14, description = "Verify the Post occupants permissions with passing empty auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing empty auth")
	@Story("Verify the Post occupants permissions with passing empty auth")
	public void verifyPostOccupantsPermissionsPassingWithEmptyAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithEmptyAuth method");

	}

	@Test(priority = 15, description = "Verify the Post occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid access")
	@Story("Verify the Post occupants permissions with passing invalid access")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAccess(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAccess method");

	}

	@Test(priority = 16, description = "Verify the Post occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Post occupants permissions with passing valid auth and invalid access")
	public void verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccess(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 17, description = "Verify the Post occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid expired auth")
	@Story("Verify the Post occupants permissions with passing valid expired auth")
	public void verifyPostOccupantsPermissionsPassingWithValidExpiredAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.body(PostPermissions.getPostPermissionsPayload()).post("occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");
		String id_value = js.getString("data.id");
		System.out.println(id_value);
		context.setAttribute("id", id_value);

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithValidExpiredAuth method");

	}

	@Test(priority = 18, description = "Verify the Post occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid expired auth")
	@Story("Verify the Post occupants permissions with passing valid expired auth")
	public void verifyPostOccupantsPermissionsPassingWithInvalidPath() throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body(PostPermissions.getPostPermissionsPayload())
				.request(Method.POST, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidPath method");
	}

	@Test(priority = 19, description = "Verify the Post occupants permissions with passing valid expired auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid expired auth invalid path")
	@Story("Verify the Post occupants permissions with passing valid expired auth and invalid path")
	public void verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.body(PostPermissions.getPostPermissionsPayload())
				.request(Method.POST, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");


		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

	}

	@Test(priority = 20, description = "Verify the Post occupants permissions with passing invalid auth Invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid auth Invalid path")
	@Story("Verify the Post occupants permissions with passing invalid auth Invalid path")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAuthInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PostPermissions.getPostPermissionsPayload())
				.request(Method.POST, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	
		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

	}

	@Test(priority = 21, description = "Verify the Post occupants permissions with passing empty auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing empty auth invalid path")
	@Story("Verify the Post occupants permissions with passing empty auth Invaid path")
	public void verifyPostOccupantsPermissionsPassingWithEmptyAuthInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PostPermissions.getPostPermissionsPayload()).post("occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	
		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

	}

	@Test(priority = 22, description = "Verify the Post occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid access")
	@Story("Verify the Post occupants permissions with passing invalid access")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body(PostPermissions.getPostPermissionsPayload()).post("occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

	}

	@Test(priority = 23, description = "Verify the Post occupants permissions with passing invalid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid access Empty Param Key")
	@Story("Verify the Post occupants permissions with passing invalid access Empty Param Key")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body("").post("occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");


		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

	}

	@Test(priority = 24, description = "Verify the Post occupants permissions with passing valid access  Empty Payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid access Empty Payload")
	@Story("Verify the Post occupants permissions with passing valid access Empty Payload")
	public void verifyPostOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");

		Response response = APIUtils.setBaseRequestHeader().body("").request(Method.POST,
				"occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");
	}

	@Test(priority = 25, description = "Verify the Post occupants permissions with passing invalid auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing invalid auth And Invalid Path")
	@Story("Verify the Post occupants permissions with passing invalid auth And Invalid Path")
	public void verifyPostOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions6g6d66s");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

	}

	@Test(priority = 26, description = "Verify the Post occupants permissions with passing empty auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing empty auth And Invalid Path")
	@Story("Verify the Post occupants permissions with passing empty auth  And Invalid Path")
	public void verifyPostOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PostPermissions.getPostPermissionsPayload()).request(Method.POST, "occupants/permissions559w59d");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");


		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

	}

	@Test(priority = 27, description = "Verify the Post occupants permissions with passing EmptyPayLoad and invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing EmptyPayLoad and invalid path")
	@Story("Verify the Post occupants permissions with passing EmptyPayLoad and invalid path")
	public void verifyPostOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body("").post("occupants/permissionsasfa");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

	}

	@Test(priority = 28, description = "Verify the Post occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Post occupants permissions with passing valid auth and invalid access")
	public void verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.body(PostPermissions.getPostPermissionsPayload())
				.request(Method.POST, "occupants/permissionsbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

	}

	@Test(priority = 29, description = "Verify the Post occupants permissions with passing valid expired auth  empty payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid expired auth  empty payload")
	@Story("Verify the Post occupants permissions with passing valid expired auth empty payload")
	public void verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody()
			throws Exception {
		logger.info("Stating of verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body("").request(Method.POST,
				"occupants/permissionscvdz");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPostOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

	}

	@Test(priority = 30, description = "Verify the Post occupants permissions with passing valid auth and invalid access empty body")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Post occupants permissions with passing valid auth and  invalid access empty body")
	@Story("Verify the Post occupants permissions with passing valid auth and invalid access empty body")
	public void verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody() throws Exception {
		logger.info(
				"Stating of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess().body("").request(Method.POST,
				"occupants/permissionsbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");
	
		logger.info(
				"Ending of verifyPostOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");
//////////////////////////////////////Post Permissions///////////////////////////////////////
	}

	@Test(priority = 31, description = "Verify the Put occupants permissions with passing invalid auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid auth")
	@Story("Verify the Put occupants permissions with passing invalid auth")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAuth method");

	}

	@Test(priority = 32, description = "Verify the Put occupants permissions with passing empty auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing empty auth")
	@Story("Verify the Put occupants permissions with passing empty auth")
	public void verifyPutOccupantsPermissionsPassingWithEmptyAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PostPermissions.getPostPermissionsPayload()).param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithEmptyAuth method");

	}

	@Test(priority = 33, description = "Verify the Put occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid access")
	@Story("Verify the Put occupants permissions with passing invalid access")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAccess(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAccess method");

	}

	@Test(priority = 34, description = "Verify the Put occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Put occupants permissions with passing valid auth and invalid access")
	public void verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccess(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.param("id", context.getAttribute("id")).body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 35, description = "Verify the Put occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid expired auth")
	@Story("Verify the Put occupants permissions with passing valid expired auth")
	public void verifyPutOccupantsPermissionsPassingWithValidExpiredAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithValidExpiredAuth method");

	}

	@Test(priority = 36, description = "Verify the Put occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid expired auth")
	@Story("Verify the Put occupants permissions with passing valid expired auth")
	public void verifyPutOccupantsPermissionsPassingWithInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidPath method");
	}

	@Test(priority = 37, description = "Verify the Put occupants permissions with passing valid expired auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid expired auth invalid path")
	@Story("Verify the Put occupants permissions with passing valid expired auth and invalid path")
	public void verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

	}

	@Test(priority = 38, description = "Verify the Put occupants permissions with passing invalid auth Invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid auth Invalid path")
	@Story("Verify the Put occupants permissions with passing invalid auth Invalid path")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAuthInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

	}

	@Test(priority = 39, description = "Verify the Put occupants permissions with passing empty auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing empty auth invalid path")
	@Story("Verify the Put occupants permissions with passing empty auth Invaid path")
	public void verifyPutOccupantsPermissionsPassingWithEmptyAuthInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

	}

	@Test(priority = 40, description = "Verify the Put occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid access")
	@Story("Verify the Put occupants permissions with passing invalid access")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

	}

	@Test(priority = 41, description = "Verify the Put occupants permissions with passing invalid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid access Empty Param Key")
	@Story("Verify the Put occupants permissions with passing invalid access Empty Param Key")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

	}

	@Test(priority = 42, description = "Verify the Put occupants permissions with passing valid access  Empty Payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid access Empty Payload")
	@Story("Verify the Put occupants permissions with passing valid access Empty Payload")
	public void verifyPutOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id")).body("")
				.request(Method.PUT, "occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");
	}

	@Test(priority = 43, description = "Verify the Put occupants permissions with passing invalid auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing invalid auth And Invalid Path")
	@Story("Verify the Put occupants permissions with passing invalid auth And Invalid Path")
	public void verifyPutOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions6g6d66s");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

	}

	@Test(priority = 44, description = "Verify the Put occupants permissions with passing empty auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing empty auth And Invalid Path")
	@Story("Verify the Put occupants permissions with passing empty auth  And Invalid Path")
	public void verifyPutOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth().param("id", context.getAttribute("id"))
				.body(UpdatePermissions.getPutPermissionsPayload()).request(Method.PUT, "occupants/permissions559w59d");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

	}

	@Test(priority = 45, description = "Verify the Put occupants permissions with passing EmptyPayLoad and invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing EmptyPayLoad and invalid path")
	@Story("Verify the Put occupants permissions with passing EmptyPayLoad and invalid path")
	public void verifyPutOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().param("id", context.getAttribute("id")).body("")
				.request(Method.PUT, "occupants/permissionsasfa");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

	}

	@Test(priority = 46, description = "Verify the Put occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Put occupants permissions with passing valid auth and invalid access")
	public void verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.param("id", context.getAttribute("id")).body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissionsbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

	}

	@Test(priority = 47, description = "Verify the Put occupants permissions with passing valid expired auth  empty payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid expired auth  empty payload")
	@Story("Verify the Put occupants permissions with passing valid expired auth empty payload")
	public void verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().param("id", context.getAttribute("id"))
				.body("").request(Method.PUT, "occupants/permissionscvdz");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

	}

	@Test(priority = 48, description = "Verify the Put occupants permissions with passing valid auth and invalid access empty body")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put occupants permissions with passing valid auth and  invalid access empty body")
	@Story("Verify the Put occupants permissions with passing valid auth and invalid access empty body")
	public void verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody(
			ITestContext context) throws Exception {
		logger.info(
				"Stating of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.param("id", context.getAttribute("id")).body("")
				.request(Method.PUT, "occupants/permissionsbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyPutOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");
//////////////////////////////////////PUT Permissions///////////////////////////////////////
	}

	@Test(priority = 49, description = "Verify the Put Resend occupants permissions with passing invalid auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid auth")
	@Story("Verify the Put Resend occupants permissions with passing invalid auth")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAuth method");

	}

	@Test(priority = 50, description = "Verify the Put Resend occupants permissions with passing empty auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing empty auth")
	@Story("Verify the Put Resend occupants permissions with passing empty auth")
	public void verifyPutResendOccupantsPermissionsPassingWithEmptyAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithEmptyAuth method");

	}

	@Test(priority = 51, description = "Verify the Put Resend occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid access")
	@Story("Verify the Put Resend occupants permissions with passing invalid access")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAccess(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAccess method");

	}

	@Test(priority = 52, description = "Verify the Put Resend occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Put Resend occupants permissions with passing valid auth and invalid access")
	public void verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccess(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 53, description = "Verify the Put Resend occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid expired auth")
	@Story("Verify the Put Resend occupants permissions with passing valid expired auth")
	public void verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuth(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuth method");

	}

	@Test(priority = 54, description = "Verify the Put Resend occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid expired auth")
	@Story("Verify the Put Resend occupants permissions with passing valid expired auth")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidPath(ITestContext context) throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidPath method");
	}

	@Test(priority = 55, description = "Verify the Put Resend occupants permissions with passing valid expired auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid expired auth invalid path")
	@Story("Verify the Put Resend occupants permissions with passing valid expired auth and invalid path")
	public void verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

	}

	@Test(priority = 56, description = "Verify the Put Resend occupants permissions with passing invalid auth Invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid auth Invalid path")
	@Story("Verify the Put Resend occupants permissions with passing invalid auth Invalid path")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAuthInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

	}

	@Test(priority = 57, description = "Verify the Put Resend occupants permissions with passing empty auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing empty auth invalid path")
	@Story("Verify the Put Resend occupants permissions with passing empty auth Invaid path")
	public void verifyPutResendOccupantsPermissionsPassingWithEmptyAuthInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

	}

	@Test(priority = 58, description = "Verify the Put Resend occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid access")
	@Story("Verify the Put Resend occupants permissions with passing invalid access")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.put("occupants/permissionshdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

	}

	@Test(priority = 59, description = "Verify the Put Resend occupants permissions with passing invalid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid access Empty Param Key")
	@Story("Verify the Put Resend occupants permissions with passing invalid access Empty Param Key")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey(
			ITestContext context) throws Exception {
		logger.info(
				"Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

	}

	@Test(priority = 60, description = "Verify the Put Resend occupants permissions with passing valid access  Empty Payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid access Empty Payload")
	@Story("Verify the Put Resend occupants permissions with passing valid access Empty Payload")
	public void verifyPutResendOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");

		Response response = APIUtils.setBaseRequestHeader().body("").request(Method.PUT,
				"occupants/permissions/resendhdshfiuhi599595");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyPayload method");
	}

	@Test(priority = 61, description = "Verify the Put Resend occupants permissions with passing invalid auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing invalid auth And Invalid Path")
	@Story("Verify the Put Resend occupants permissions with passing invalid auth And Invalid Path")
	public void verifyPutResendOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend6g6d66s");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithInvalidAuthAndInvalidPath method");

	}

	@Test(priority = 62, description = "Verify the Put Resend occupants permissions with passing empty auth And Invalid Path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing empty auth And Invalid Path")
	@Story("Verify the Put Resend occupants permissions with passing empty auth  And Invalid Path")
	public void verifyPutResendOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.body(PutPermissionResend.getPutPermissionsResendPayload(context))
				.request(Method.PUT, "occupants/permissions/resend559w59d");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithEmptyAuthAndInvalidPath method");

	}

	@Test(priority = 63, description = "Verify the Put Resend occupants permissions with passing EmptyPayLoad and invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing EmptyPayLoad and invalid path")
	@Story("Verify the Put Resend occupants permissions with passing EmptyPayLoad and invalid path")
	public void verifyPutResendOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath(ITestContext context)
			throws Exception {
		logger.info("Stating of verifyPutResendOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader().body("").request(Method.PUT,
				"occupants/permissions/resendasfa");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyPutResendOccupantsPermissionsPassingWithEmptyPayLoadInvalidPath method");

	}

	@Test(priority = 64, description = "Verify the Put Resend occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Put Resend occupants permissions with passing valid auth and invalid access")
	public void verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath(ITestContext context)
			throws Exception {
		logger.info(
				"Stating of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.body(UpdatePermissions.getPutPermissionsPayload())
				.request(Method.PUT, "occupants/permissions/resendbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPath method");

	}

	@Test(priority = 65, description = "Verify the Put Resend occupants permissions with passing valid expired auth  empty payload")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid expired auth  empty payload")
	@Story("Verify the Put Resend occupants permissions with passing valid expired auth empty payload")
	public void verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody(ITestContext context)
			throws Exception {
		logger.info(
				"Stating of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth().body("").request(Method.PUT,
				"occupants/permissions/resendcvdz");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyPutResendOccupantsPermissionsPassingWithValidExpiredAuthInvalidPathEmptyBody method");

	}

	@Test(priority = 66, description = "Verify the Put Resend occupants permissions with passing valid auth and invalid access empty body")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Put Resend occupants permissions with passing valid auth and  invalid access empty body")
	@Story("Verify the Put Resend occupants permissions with passing valid auth and invalid access empty body")
	public void verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody(
			ITestContext context) throws Exception {
		logger.info(
				"Stating of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess().body("").request(Method.PUT,
				"occupants/permissions/resendbbfljkhaou98989");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyPutResendOccupantsPermissionsPassingWithValidAuthAndInvalidAccessInvalidPathEmptyBody method");
//////////////////////////////////////PUT Resend Permissions///////////////////////////////////////
	}

	@Test(priority = 67, description = "Verify the Delete occupants permissions with passing invalid auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing invalid auth")
	@Story("Verify the Delete occupants permissions with passing invalid auth")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidAuth(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth().param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidAuth method");

	}

	@Test(priority = 68, description = "Verify the Delete occupants permissions with passing empty auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing empty auth")
	@Story("Verify the Delete occupants permissions with passing empty auth")
	public void verifyDeleteOccupantsPermissionsPassingWithEmptyAuth(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithEmptyAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithEmptyAuth method");

	}

	@Test(priority = 69, description = "Verify the Delete occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing invalid access")
	@Story("Verify the Delete occupants permissions with passing invalid access")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidAccess(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidAccess method");

	}

	@Test(priority = 70, description = "Verify the Delete occupants permissions with passing valid auth and invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing valid auth and  invalid access")
	@Story("Verify the Delete occupants permissions with passing valid auth and invalid access")
	public void verifyDeleteOccupantsPermissionsPassingWithValidAuthAndInvalidAccess(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

		Response response = APIUtils.setBaseRequestHeaderWithValidAuthAndInvalidAccess()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithValidAuthAndInvalidAccess method");

	}

	@Test(priority = 71, description = "Verify the Delete occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing valid expired auth")
	@Story("Verify the Delete occupants permissions with passing valid expired auth")
	public void verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuth(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuth method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "401");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuth method");

	}

	@Test(priority = 72, description = "Verify the Delete occupants permissions with passing valid expired auth")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing valid expired auth")
	@Story("Verify the Delete occupants permissions with passing valid expired auth")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidPath(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidPath method");

		Response response = APIUtils.setBaseRequestHeader()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions459gff");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidPath method");
	}

	@Test(priority = 73, description = "Verify the Delete occupants permissions with passing valid expired auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing valid expired auth invalid path")
	@Story("Verify the Delete occupants permissions with passing valid expired auth and invalid path")
	public void verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithValidExpiredAuth()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissionsdvsv5484");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithValidExpiredAuthInvalidPath method");

	}

	@Test(priority = 74, description = "Verify the Delete occupants permissions with passing invalid auth Invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing invalid auth Invalid path")
	@Story("Verify the Delete occupants permissions with passing invalid auth Invalid path")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidAuthInvalidPath(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAuth()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissionsfgjsduhg265959");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidAuthInvalidPath method");

	}

	@Test(priority = 75, description = "Verify the Delete occupants permissions with passing empty auth invalid path")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing empty auth invalid path")
	@Story("Verify the Delete occupants permissions with passing empty auth Invaid path")
	public void verifyDeleteOccupantsPermissionsPassingWithEmptyAuthInvalidPath(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithEmptyAuth()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissions11+5159");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithEmptyAuthInvalidPath method");

	}

	@Test(priority = 76, description = "Verify the Delete occupants permissions with passing invalid access")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing invalid access")
	@Story("Verify the Delete occupants permissions with passing invalid access")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPath(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess()
				.param("id", context.getAttribute("id"))
				.request(Method.DELETE,"occupants/permissionsdg5s48g4");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPath method");

	}

	@Test(priority = 77, description = "Verify the Delete occupants permissions with passing invalid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing invalid access Empty Param Key")
	@Story("Verify the Delete occupants permissions with passing invalid access Empty Param Key")
	public void verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey(ITestContext context) {
		logger.info(
				"Stating of verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeaderWithInvalidAccess().param("id", "")
				.request(Method.DELETE,"occupants/permissionsdg5s48g4");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "404");

		logger.info(
				"Ending of verifyDeleteOccupantsPermissionsPassingWithInvalidAccessInvalidPathEmptyParamKey method");

	}

	@Test(priority = 78, description = "Verify the Delete occupants permissions with passing valid access  Empty Param Key")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:verify Delete occupants permissions with passing valid access Empty Param Key")
	@Story("Verify the Delete occupants permissions with passing valid access Empty Param Key")
	public void verifyDeleteOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey(ITestContext context) {
		logger.info("Stating of verifyDeleteOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey method");

		Response response = APIUtils.setBaseRequestHeader().param("id", "").request(Method.DELETE,"occupants/permissions");
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		System.out.println(res);
		APIUtils.assertions(response, "400");

		logger.info("Ending of verifyDeleteOccupantsPermissionsPassingWithvalidAccessvalidPathEmptyParamKey method");

		//////////////////////////////////// Delete Occupant
		//////////////////////////////////// permissions///////////////////////////////////////

	}
	/*
	 * }
	 * 
	 * @Test(priority = 2, description = "Verify the post permissions")
	 * 
	 * @Severity(SeverityLevel.BLOCKER)
	 * 
	 * @Description("Test Description:verify post permissions")
	 * 
	 * @Story("Verify the post permissions") public void
	 * verifyPostPermissions(ITestContext context) throws Exception {
	 * logger.info("Stating of verifyPostPermissions method");
	 * 
	 * Response response = APIUtils.setBaseRequestHeader().body(PostPermissions.
	 * getPostPermissionsPayload()).post("occupants/permissions"); String res =
	 * response.asString(); JsonPath js = new JsonPath(res);
	 * System.out.println(res); APIUtils.assertions(response, "200"); String
	 * id_value = js.getString("data.id"); System.out.println(id_value);
	 * context.setAttribute("id", id_value);
	 * 
	 * logger.info("Ending of verifyPostPermissions  method");
	 * 
	 * }
	 * 
	 * @Test(priority = 3, description = "Verify the put permissions")
	 * 
	 * @Severity(SeverityLevel.BLOCKER)
	 * 
	 * @Description("Test Description:verify put permissions")
	 * 
	 * @Story("Verify the put permissions") public void
	 * verifyPutPermissions(ITestContext context) throws JsonProcessingException {
	 * logger.info("Stating of verifyPutPermissions method");
	 * 
	 * 
	 * Response response = APIUtils.setBaseRequestHeader().param("id",
	 * context.getAttribute("id")).body(UpdatePermissions.getPutPermissionsPayload()
	 * ) .request(Method.PUT, "occupants/permissions");
	 * 
	 * String res = response.asString(); JsonPath js = new JsonPath(res);
	 * APIUtils.assertions(response, "200");
	 * 
	 * 
	 * logger.info("Ending of verifyPutPermissions method");
	 * 
	 * }
	 * 
	 * @Test(priority = 4, description = "Verify the put permissions resend")
	 * 
	 * @Severity(SeverityLevel.BLOCKER)
	 * 
	 * @Description("Test Description:verify put permissions resend")
	 * 
	 * @Story("Verify the put permissions resend ") public void
	 * verifyPutPermissionsResend(ITestContext context) throws Exception {
	 * logger.info("Stating of verifyPutPermissionsResend method");
	 * 
	 * Response response = APIUtils.setBaseRequestHeader().body(PutPermissionResend.
	 * getPutPermissionsResendPayload(context)) .request(Method.PUT,
	 * "occupants/permissions/resend");
	 * 
	 * String res = response.asString(); JsonPath js = new JsonPath(res);
	 * APIUtils.assertions(response, "200");
	 * 
	 * 
	 * logger.info("Ending of verifyPutPermissionsResend method"); }
	 * 
	 * @Test(priority = 5, description = "Verify the delete permissions ")
	 * 
	 * @Severity(SeverityLevel.NORMAL)
	 * 
	 * @Description("Test Description:verify delete permissions ")
	 * 
	 * @Story("Verify the delete permissions") public void
	 * verifyDeletePermissions(ITestContext context) {
	 * logger.info("Stating of verifyDeletePermissions method");
	 * 
	 * Response response = APIUtils.setBaseRequestHeader().param("id",
	 * context.getAttribute("id")) .request(Method.DELETE, "occupants/permissions");
	 * 
	 * String res = response.asString(); JsonPath js = new JsonPath(res);
	 * APIUtils.assertions(response, "200");
	 * 
	 * 
	 * logger.info("Ending of verifyDeletePermissions method");
	 * 
	 * }
	 */

}
