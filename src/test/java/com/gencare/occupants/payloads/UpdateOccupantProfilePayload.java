package com.gencare.occupants.payloads;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gencare.api.base.BaseAutomationTest;

public class UpdateOccupantProfilePayload extends BaseAutomationTest {

	public static String getUpdateOccupantProfile() throws Exception {

			 Map<String, Object> payload = new HashMap<>();
		        
		        payload.put("country", testDataProp.get("country.occupants"));
		        payload.put("attributes", new HashMap<String, Object>() {{
		            put("first_name", testDataProp.get("put.occupant.firstname"));
		            put("last_name", GetUniqueAlphabet("sfs"));
		            put("email", testDataProp.get("put.occupant.email"));
		            put("phone_number", testDataProp.get("put.occupant.number"));
		        }});
		        payload.put("metadata", new HashMap<String, Object>() {{
		            put("is_terms_condition", testDataProp.get("put.occupant.condition"));
		        }});		    
		            ObjectMapper objectMapper = new ObjectMapper();
		            String requestBody  = objectMapper.writeValueAsString(payload);
		            System.out.println(requestBody);
		           
		        return requestBody;
		        }
	
	
	public static String getInvalidUpdateOccupantProfile() throws Exception {

		 Map<String, Object> payload = new HashMap<>();
	        
	        payload.put("country", testDataProp.get("country.occupants"));
	        payload.put("attributes", new HashMap<String, Object>() {{
	            put("first_name", testDataProp.get("put.occupan.firstname"));
	            put("last_name", "sfs");
	            put("email", testDataProp.get("put.occupant.eail"));
	            put("phone_number", testDataProp.get("put.occuant.number"));
	        }});
	        payload.put("metadata", new HashMap<String, Object>() {{
	            put("is_terms_condition", testDataProp.get("put.occpant.condition"));
	        }});		    
	            ObjectMapper objectMapper = new ObjectMapper();
	            String requestBody  = objectMapper.writeValueAsString(payload);
	            System.out.println(requestBody);
	           
	        return requestBody;
	        
	        }
	
}
