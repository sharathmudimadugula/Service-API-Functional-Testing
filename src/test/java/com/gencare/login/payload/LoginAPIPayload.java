package com.gencare.login.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.pages.LoginAPIPage;

public class LoginAPIPayload extends BaseAutomationTest {

	public static String getLoginPayload(String email, String password) throws JsonProcessingException {

		LoginAPIPage loginPayload = new LoginAPIPage(email, password);

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(loginPayload);

		return requestBody;
	}

}
