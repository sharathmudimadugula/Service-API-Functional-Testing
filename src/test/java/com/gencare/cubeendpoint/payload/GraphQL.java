package com.gencare.cubeendpoint.payload;

import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.graphql.GrapthQLPage;

public class GraphQL extends BaseAutomationTest {

	public static String getGraphQLPayload() throws JsonProcessingException {

		GrapthQLPage grapthQLPage = new GrapthQLPage();

		grapthQLPage.setQuery(testDataProp.getProperty("get.query"));
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(grapthQLPage);
		System.out.println(requestBody);
		return requestBody;

	}
}
