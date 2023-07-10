package com.gencare.permissions.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.permissionsPage.PutPermissionsPage;

public class UpdatePermissions extends BaseAutomationTest {

	public static String getPutPermissionsPayload() throws JsonProcessingException {
		
		PutPermissionsPage putPermissionsPage= new PutPermissionsPage();
		putPermissionsPage.setAccesslevel(testDataProp.getProperty("access.level.put.permissions"));
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(putPermissionsPage);		
		return requestBody;
}
}