package com.gencare.permissions.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.permissionsPage.PostPermissionsPage;

public class PostPermissions extends BaseAutomationTest {

	public static String getPostPermissionsPayload() throws JsonProcessingException {

		PostPermissionsPage postPermissions = new PostPermissionsPage();

		postPermissions.setGatewayid(testDataProp.getProperty("gateway.id.post.permission"));
		postPermissions.setInvitationemail(getUniqueMail());
		postPermissions.setIstempaccess(false);
		postPermissions.setAccesslevel(testDataProp.getProperty("access.level.post.permission"));
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(postPermissions);

		return requestBody;

	}
}
