package com.gencare.api.utils;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;

import com.gencare.api.tests.LoginAPITest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIUtils {

	public static RequestSpecification setBaseRequestHeader() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token", LoginAPITest.idToken).header("x-access-token",LoginAPITest.accessToken);
	}
	public static RequestSpecification setQueryBaseRequestHeader() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("authorization", LoginAPITest.idToken).header("x-access-token",LoginAPITest.accessToken);
	}

	public static RequestSpecification setBaseRequestHeaderWithInvalidAuth() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token", "asdfghtrewsdfghgfdredfgbnfdredfgngfdsd");
	}
	public static RequestSpecification setLoginBaseRequestHeader() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app");
	}

	
	public static void assertions(Response response, String expectedstatuscode) {

		int statuscode = response.getStatusCode();

		String s = Integer.toString(statuscode);
		ResponseBody body = response.getBody();
		body.prettyPeek();
		Assert.assertEquals(s, expectedstatuscode);
		ValidatableResponse valres = response.then();

		// valres.time(Matchers.lessThanOrEqualTo(2000l));
	}

	public static RequestSpecification setBaseRequestHeaderWithInvalidAccess() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token", LoginAPITest.idToken).header("x-access-token", "asdfghtrewsdfghgfdredfgbnfdredfgngfdsd");
	}
	
	public static RequestSpecification setBaseRequestHeaderWithValidExpiredAuth() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token",
						"eyJraWQiOiJcL3BRdm9QSVhoTEZcLzFWc3BHaXRtNWtneDZkaVRvcGtxaE1rS0srRWNSU1U9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiI2MzgyNGZjNi05MDkwLTQwZjYtYjFkYy01MDVkYzMxM2NiYTQiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLXdlc3QtMi5hbWF6b25hd3MuY29tXC91cy13ZXN0LTJfZXF6NHlvQm5zIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjpmYWxzZSwiY29nbml0bzp1c2VybmFtZSI6InNhbmdlZXRoYWpAYjJidGVzdGVycy5jb20iLCJsb2NhbGUiOiJlbiIsImN1c3RvbTpjb21wYW55IjoibXJwZXgiLCJhdWQiOiI1cGFnb2VsaDU5czY5dnZwYzFvZmhtdHF0bCIsImV2ZW50X2lkIjoiNDI2ZjFhMWItNTIyYS00ZDEwLWEyZTQtNmFiZjgzNjk5Yzk0IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2ODc1ODEzMzQsIm5hbWUiOiJzYW5nZWV0aGEiLCJwaG9uZV9udW1iZXIiOiIrNDIwNTU2OTM1ODQ0MjUiLCJleHAiOjE2ODc1ODQ5MzQsImlhdCI6MTY4NzU4MTMzNCwiZmFtaWx5X25hbWUiOiJqYW1wYWxhIiwiZW1haWwiOiJzYW5nZWV0aGFqQGIyYnRlc3RlcnMuY29tIn0.BerXPhH0eGLQIQU8WQg5uJPgdVw88l7EDQMeLTbFfxsGARhsE1PX6Bqh5eBXZn5-EX3cWhZUjKTCcgRM2tGQvoMJQ0WiCb3DEYskn6dV4S4v_GfD7nenpKooDxTx2l_7sO4-997pmDE_drKXPGzwklN63cGG4uJ6atqTYiK4d2KVpqs321Dm7vrB3lUTSYbXLgNNwlmUAVq0qZ1fupdnjoWNMnKcFncnwYYfjY3dh2fj9n5rSp6PMjdAYNRavV6cYfHyd1j1crv34OIoEL4nNXfWomTIUxqC3zYljCckDnhii1W_eeK9FsT41tcwfbLptErALmofKleVtjezXd-cgg").header("x-access-token",
						"eyJraWQiOiJcL3BRdm9QSVhoTEZcLzFWc3BHaXRtNWtneDZkaVRvcGtxaE1rS0srRWNSU1U9IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiI2MzgyNGZjNi05MDkwLTQwZjYtYjFkYy01MDVkYzMxM2NiYTQiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLXdlc3QtMi5hbWF6b25hd3MuY29tXC91cy13ZXN0LTJfZXF6NHlvQm5zIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjpmYWxzZSwiY29nbml0bzp1c2VybmFtZSI6InNhbmdlZXRoYWpAYjJidGVzdGVycy5jb20iLCJsb2NhbGUiOiJlbiIsImN1c3RvbTpjb21wYW55IjoibXJwZXgiLCJhdWQiOiI1cGFnb2VsaDU5czY5dnZwYzFvZmhtdHF0bCIsImV2ZW50X2lkIjoiNDI2ZjFhMWItNTIyYS00ZDEwLWEyZTQtNmFiZjgzNjk5Yzk0IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE2ODc1ODEzMzQsIm5hbWUiOiJzYW5nZWV0aGEiLCJwaG9uZV9udW1iZXIiOiIrNDIwNTU2OTM1ODQ0MjUiLCJleHAiOjE2ODc1ODQ5MzQsImlhdCI6MTY4NzU4MTMzNCwiZmFtaWx5X25hbWUiOiJqYW1wYWxhIiwiZW1haWwiOiJzYW5nZWV0aGFqQGIyYnRlc3RlcnMuY29tIn0.BerXPhH0eGLQIQU8WQg5uJPgdVw88l7EDQMeLTbFfxsGARhsE1PX6Bqh5eBXZn5-EX3cWhZUjKTCcgRM2tGQvoMJQ0WiCb3DEYskn6dV4S4v_GfD7nenpKooDxTx2l_7sO4-997pmDE_drKXPGzwklN63cGG4uJ6atqTYiK4d2KVpqs321Dm7vrB3lUTSYbXLgNNwlmUAVq0qZ1fupdnjoWNMnKcFncnwYYfjY3dh2fj9n5rSp6PMjdAYNRavV6cYfHyd1j1crv34OIoEL4nNXfWomTIUxqC3zYljCckDnhii1W_eeK9FsT41tcwfbLptErALmofKleVtjezXd-cgg");
	}
	
	public static RequestSpecification setBaseRequestHeaderWithValidAuth() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token",LoginAPITest.idToken);
	}
	public static RequestSpecification setBaseRequestHeaderWithEmptyAuth() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token", "");
	}
	
	public static RequestSpecification setBaseRequestHeaderWithValidAuthAndInvalidAccess() {

		return RestAssured.given().header("Content-Type", "application/json").header("x-company-code", "dev-app")
				.header("x-auth-token",LoginAPITest.idToken).header("x-access-token","eyJraWQiOiJ4VXZpbnZEV2tpZEFHUVMrSHFsVHYwNlN3RjZ3cEl4UGQrZUZ0UCtMZmxJPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI2MzgyNGZjNi05MDkwLTQwZjYtYjFkYy01MDVkYzMxM2NiYTQiLCJldmVudF9pZCI6IjQyNmYxYTFiLTUyMmEtNGQxMC1hMmU0LTZhYmY4MzY5OWM5NCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2ODc1ODEzMzQsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC51cy13ZXN0LTIuYW1hem9uYXdzLmNvbVwvdXMtd2VzdC0yX2VxejR5b0JucyIsImV4cCI6MTY4NzU4NDkzNCwiaWF0IjoxNjg3NTgxMzM0LCJqdGkiOiI0ZmFlMTZmZS0zNjZjLTRmMzAtOWY1My02YjhhMWEwODhkODMiLCJjbGllbnRfaWQiOiI1cGFnb2VsaDU5czY5dnZwYzFvZmhtdHF0bCIsInVzZXJuYW1lIjoic2FuZ2VldGhhakBiMmJ0ZXN0ZXJzLmNvbSJ9.M_XprhcTy7bA_vrb7JlhgewV-ITMK6DWBxNua1cX8xBtmXH2GP5AzAl_4UHerLc2uzx4-4Ea0M3nEpqrWVhdCLZednr4b48E6MokljKnvnv9P6EnetHV--N0ehcHemynSjNRZYXeUO63ypKy0LNilVNtzd5uj39uAD3XiT3KNK_t9abZ5TSS13kjTM0bPyb3FsGgSOxZeRXa0RKkVSM_7zKtqVNCgMpl1QYm5h3zoPwPnApOo17hf8R72jx57RXtEfU9MjMpHK_GodH9AFd2QFkd65geRIFtJ29K-2S8qs33ijx-ZwpANj3jx5e7V4d3aiGt57XiZMdnKpMIWKsYrw");
	}

	public static String getStatusFromResponse(Response response) {

		String res = response.asString();

		JsonPath js = new JsonPath(res);
		String status = js.getString("status");
		assertNotNull(status);

		return status;

	}

	/**
	 * @param contains
	 * @param expectedstatuscode
	 */
	public static void assertions(boolean contains, String expectedstatuscode) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param contains
	 * @param b
	 */
	public static void assertions(boolean contains, boolean b) {
		// TODO Auto-generated method stub

	}

}
