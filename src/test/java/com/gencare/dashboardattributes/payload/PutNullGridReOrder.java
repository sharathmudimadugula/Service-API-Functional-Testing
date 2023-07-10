package com.gencare.dashboardattributes.payload;

import org.testng.ITestContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.dashboardatributes.UpdateDashboardAttributesPage;

public class PutNullGridReOrder extends BaseAutomationTest{

public static String getUpdateDashboardAttributesPayloadWithNullValue(ITestContext context) throws JsonProcessingException {
		
	UpdateDashboardAttributesPage updateDashboardAttributesPage= new UpdateDashboardAttributesPage();
	updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
	context.getAttribute("id");
	updateDashboardAttributesPage.setId((String) context.getAttribute("id"));
	updateDashboardAttributesPage.setGridorder(null);
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);
		return requestBody;
	}}