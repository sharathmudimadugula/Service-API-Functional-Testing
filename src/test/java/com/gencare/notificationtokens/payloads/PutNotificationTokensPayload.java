package com.gencare.notificationtokens.payloads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.notificationstoken.pages.PutNotificationTokenAPIPage;

public class PutNotificationTokensPayload extends BaseAutomationTest {
	
	public static String putNotificationTokenPayload(String id, String os) throws JsonProcessingException {

	PutNotificationTokenAPIPage putnotificationTokensPayload = new PutNotificationTokenAPIPage(id, os);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(putnotificationTokensPayload);

		return requestBody;
	}
}
