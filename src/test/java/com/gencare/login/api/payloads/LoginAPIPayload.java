package com.gencare.login.api.payloads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.api.pages.LoginAPIPage;

public class LoginAPIPayload extends BaseAutomationTest {

	public static String getLoginPayload() throws JsonProcessingException {

		LoginAPIPage loginPayload = new LoginAPIPage(testDataProp.getProperty("email"),
				testDataProp.getProperty("password"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(loginPayload);

		return requestBody;
	}

}
