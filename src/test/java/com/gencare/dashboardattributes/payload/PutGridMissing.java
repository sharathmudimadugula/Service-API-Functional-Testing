package com.gencare.dashboardattributes.payload;

import org.testng.ITestContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.dashboardatributes.UpdateDashboardAttributesPage;

public class PutGridMissing extends BaseAutomationTest{

public static String getUpdateDashboardAttributesGridMissingPayload(ITestContext context) throws JsonProcessingException {
		
		UpdateDashboardAttributesPage updateDashboardAttributesPage= new UpdateDashboardAttributesPage();
		context.getAttribute("id");
		updateDashboardAttributesPage.setId((String) context.getAttribute("id"));
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;
	}}