package com.gencare.occupants.payloads;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;
import com.gencare.occupants.pages.CreateOccupants;

public class CreateOccupantRegisterPayload extends BaseAutomationTest{
	public static String getCreateOccupantRegisterPayload() throws Exception {
		
		CreateOccupants createOccupants = new CreateOccupants ();
		
		createOccupants.setEmail(getUniqueMail());
		createOccupants.setPassword(testDataProp.getProperty("post.occupant.password"));
		createOccupants.setFirstname(testDataProp.getProperty("post.occupant.firstname"));
		createOccupants.setLastname(testDataProp.getProperty("post.occupant.lastname"));
		createOccupants.setPhonenumber(testDataProp.getProperty("post.occupant.phonenumber"));
		createOccupants.setLanguage(testDataProp.getProperty("post.occupant.language"));
		createOccupants.setCountry(testDataProp.getProperty("post.occupant.country"));
		createOccupants.getMetadata();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createOccupants);

		return requestBody;
}
	
	
	public static String getInvalidCreateOccupantRegisterPayload() throws Exception {
		
		CreateOccupants createOccupants = new CreateOccupants ();
		
		createOccupants.setEmail(getUniqueMail());
		createOccupants.setPassword(testDataProp.getProperty("post.occupa.password"));
		createOccupants.setFirstname(testDataProp.getProperty("post.occupa.firstname"));
		createOccupants.setLastname(testDataProp.getProperty("post.occupant.stname"));
		createOccupants.setPhonenumber(testDataProp.getProperty("post.occupant.phonenumber"));
		createOccupants.setLanguage(testDataProp.getProperty("post.occunt.language"));
		createOccupants.setCountry(testDataProp.getProperty("post.opant.country"));
		createOccupants.getMetadata();
		
		ObjectMapper objectMapper = new ObjectMapper();
		String requestBody = objectMapper.writeValueAsString(createOccupants);

		return requestBody;
}
}