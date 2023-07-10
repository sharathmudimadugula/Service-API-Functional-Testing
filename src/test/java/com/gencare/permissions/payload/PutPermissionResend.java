package com.gencare.permissions.payload;

import org.testng.ITestContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.permissionsPage.PutPermissionsResendPage;

public class PutPermissionResend extends BaseAutomationTest {

	public static String getPutPermissionsResendPayload(ITestContext context) throws JsonProcessingException {
		context.getAttribute("id");
		PutPermissionsResendPage putPermissionsResendPage= new PutPermissionsResendPage();
		putPermissionsResendPage.setId((String) context.getAttribute("id"));
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(putPermissionsResendPage);		
		return requestBody;
}

}
