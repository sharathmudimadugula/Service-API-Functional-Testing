package com.gencare.dashboardattributes.payload;

import org.testng.ITestContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.dashboardatributes.UpdateDashboardAttributesPage;
import com.gencare.dashboardatributes.negative.UpdateDashboardAttributesNegativePage;

public class UpdateDashboardAttributes extends BaseAutomationTest {

	public static String getUpdateDashboardAttributesPayload(ITestContext context) throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		context.getAttribute("id");
		updateDashboardAttributesPage.setId((String) context.getAttribute("id"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}
	
	public static String getUpdateDashboardAttributesWithEmptyStringPayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId("");
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithEmptySpacePayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("putid.getvalue.with.space"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithNullValuePayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(null);
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithSpecialCharactersPayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("putid.getvalue.withspl.character"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithBooleanPayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		UpdateDashboardAttributesNegativePage updateDashboardAttributesNegativePage = new UpdateDashboardAttributesNegativePage();
		updateDashboardAttributesNegativePage.setId(false);
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithNumericValuePayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		UpdateDashboardAttributesNegativePage updateDashboardAttributesNegativePage = new UpdateDashboardAttributesNegativePage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("putid.getvalue.with.numeric"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesWithAlphaNumericValuePayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		UpdateDashboardAttributesNegativePage updateDashboardAttributesNegativePage = new UpdateDashboardAttributesNegativePage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("putid.getvalue.with.alphanumeric"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;
                                    ///Id Value/////
	}
	
	public static String getUpdateDashboardAttributesGridOrderWithEmptyStringPayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
			updateDashboardAttributesPage.setGridorder("");

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesGridOrderWithEmptySpacePayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("put.gridorder.with.space"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesGridOrderWithNullValuePayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
		updateDashboardAttributesPage.setGridorder(null);

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesGridOrderWithSpecialCharactersPayload() throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("put.gridorder.withspl.character"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesGridOrderWithBooleanPayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		UpdateDashboardAttributesNegativePage updateDashboardAttributesNegativePage = new UpdateDashboardAttributesNegativePage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));		
		updateDashboardAttributesNegativePage.setGridorder(true);

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesGridOrderWithNumericValuePayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("put.gridorder.with.numeric"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;

	}

	public static String getUpdateDashboardAttributesridOrderWithAlphaNumericValuePayload()
			throws JsonProcessingException {

		UpdateDashboardAttributesPage updateDashboardAttributesPage = new UpdateDashboardAttributesPage();
		updateDashboardAttributesPage.setId(testDataProp.getProperty("id.update.dashboardattributes"));
		updateDashboardAttributesPage.setGridorder(testDataProp.getProperty("put.gridorder.with.alphanumeric"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(updateDashboardAttributesPage);

		return requestBody;
                               ////Grid Reorder/////
	}
}
