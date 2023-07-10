package com.gencare.dashboardattributes.payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.dashboardatributes.CreateOccupantDashboardAttributesPage;
import com.gencare.dashboardatributes.negative.CreateOccupantDashboardAttributesNegativePage;

public class CreateDashboardAttributes extends BaseAutomationTest {

	public static String getCreatedashboardAttributesPayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdEmptyStringPayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty(""));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithSpacePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("postid.getvalue.with.space"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithSpecialCharactersPayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("postid.getvalue.withspl.character"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithBooleanValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();
		CreateOccupantDashboardAttributesNegativePage createOccupantDashboardAttributesNegativePage = new CreateOccupantDashboardAttributesNegativePage();
		createOccupantDashboardAttributesNegativePage.getItemid(true);
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithNullValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(null);
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithNumericValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("postid.getvalue.with.numeric"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesItemIdWithAlphaNumericValuePayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("postid.getvalue.with.alphanumeric"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;
		////// Item Id///////
	}

	public static String getCreatedashboardAttributesGridReorderEmptyStringPayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty(""));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithSpacePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("postid.gridorder.with.space"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithSpecialCharactersPayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("postid.gridorder.withspl.character"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithBooleanValuePayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();
		CreateOccupantDashboardAttributesNegativePage createOccupantDashboardAttributesNegativePage = new CreateOccupantDashboardAttributesNegativePage();
		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createOccupantDashboardAttributesNegativePage.setGridorder(false);
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithNullValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(null);
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithNumericValuePayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("postid.gridorder.with.numeric"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesGridReorderWithAlphaNumericValuePayload()
			throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("postid.gridorder.with.alphanumeric"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("type.dashboardattributes"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;
		////// Grid Reorder Id///////
	}

	public static String getCreatedashboardAttributesTypeEmptyStringPayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty(""));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithSpacePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("postid.type.with.space"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithSpecialCharactersPayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("postid.type.withspl.character"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithBooleanValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();
		CreateOccupantDashboardAttributesNegativePage createOccupantDashboardAttributesNegativePage = new CreateOccupantDashboardAttributesNegativePage();
		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createOccupantDashboardAttributesNegativePage.setType(false);

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithNullValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(null);

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithNumericValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("postid.type.with.numeric"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;

	}

	public static String getCreatedashboardAttributesTypeWithAlphaNumericValuePayload() throws JsonProcessingException {

		CreateOccupantDashboardAttributesPage createDashboardAttributesPage = new CreateOccupantDashboardAttributesPage();

		createDashboardAttributesPage.setItemid(testDataProp.getProperty("item.id.dashboardattributes"));
		createDashboardAttributesPage.setGridorder(testDataProp.getProperty("grid.order.dashboardattributes"));
		createDashboardAttributesPage.setType(testDataProp.getProperty("postid.type.with.alphanumeric"));

		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createDashboardAttributesPage);

		return requestBody;
		////// Type///////
	}
}
