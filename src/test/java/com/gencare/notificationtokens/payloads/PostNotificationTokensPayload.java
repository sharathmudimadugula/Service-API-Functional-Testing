package com.gencare.notificationtokens.payloads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.notificationstoken.pages.PostNotificationTokensAPIPage;

public class PostNotificationTokensPayload {
	public static String postNotificationTokenPayload(String token, String dns, String os) throws JsonProcessingException {

		PostNotificationTokensAPIPage notificationTokensPayload = new PostNotificationTokensAPIPage(token,dns,os);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(notificationTokensPayload);

		return requestBody;
	}
	
}
