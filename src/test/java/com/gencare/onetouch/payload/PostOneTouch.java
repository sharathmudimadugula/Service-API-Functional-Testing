package com.gencare.onetouch.payload;

import java.util.*;
import com.gencare.api.base.BaseAutomationTest;

public class PostOneTouch extends BaseAutomationTest{
	public static String getPostOneTouchPayload() throws Exception {

    	 Map<String, Object> payload = new HashMap<>();
         payload.put("gateway_code", "SAL3AG1GW-001E5E04440C");

         List<Map<String, Object>> oneTouchRules = new ArrayList<>();

         Map<String, Object> rule = new HashMap<>();
         rule.put("key", "c022113ca1aa5e9dae4578c179htr570c10");
         rule.put("name", "Party Mode: Fan Coil Thermostat 5 1");
         rule.put("active", true);

         List<Map<String, Object>> action = new ArrayList<>();

         Map<String, Object> setValueAction1 = new HashMap<>();
         setValueAction1.put("op", "SetValue");

         List<Map<String, Object>> setValueParams1 = new ArrayList<>();
         setValueParams1.add(Map.of("string", "001e5e09025bd990"));
         setValueParams1.add(Map.of("string", "ep_9:sTherS:SetHeatingSetpoint_x100"));
         setValueParams1.add(Map.of("number", 2100));

         setValueAction1.put("parameters", setValueParams1);
         action.add(setValueAction1);

         Map<String, Object> setValueAction2 = new HashMap<>();
         setValueAction2.put("op", "SetValue");

         List<Map<String, Object>> setValueParams2 = new ArrayList<>();
         setValueParams2.add(Map.of("string", "001e5e09025bd990"));
         setValueParams2.add(Map.of("string", "ep_9:sTherS:SetCoolingSetpoint_x100"));
         setValueParams2.add(Map.of("number", 2100));

         setValueAction2.put("parameters", setValueParams2);
         action.add(setValueAction2);

         Map<String, Object> startTimerAction = new HashMap<>();
         startTimerAction.put("op", "StartTimer");

         List<Map<String, Object>> startTimerParams = new ArrayList<>();
         startTimerParams.add(Map.of("string", "timerTriggerKey_7c7abd4d9a181c078f0639f63a9f36f3"));
         startTimerParams.add(Map.of("number", 7200));
         startTimerParams.add(Map.of("string", "timerTriggerKey_7c7abd4d9a181c078f0639f63a9f36f3"));

         startTimerAction.put("parameters", startTimerParams);
         action.add(startTimerAction);

         rule.put("action", action);

         Map<String, Object> condition = new HashMap<>();
         condition.put("op", "OR");

         List<Map<String, Object>> conditionParams = new ArrayList<>();

         Map<String, Object> getValueParam = new HashMap<>();
         getValueParam.put("op", "GetValue");

         List<Map<String, Object>> getValueParams = new ArrayList<>();
         getValueParams.add(Map.of("string", "0000000000000000"));
         getValueParams.add(Map.of("string", "ep_0:sRule:TriggerRule"));

         getValueParam.put("parameters", getValueParams);
         conditionParams.add(getValueParam);

         conditionParams.add(Map.of("string", "ruleTriggerKey-9b90474d8cf371c9e1b4842875ede929"));

         List<Map<String, Object>> parameters = new ArrayList<>();
         parameters.add(Map.of("op", "EQ", "parameters", conditionParams));

         condition.put("parameters", parameters);
         rule.put("condition", condition);

         Map<String, Object> dashboardAttributes = new HashMap<>();
         dashboardAttributes.put("type", "one_touch_rule");

         Map<String, Object> oneTouchRule = new HashMap<>();
         oneTouchRule.put("id", "8529f77a-2ff6-4a05-ba1d-0362ed96160c");
         oneTouchRule.put("rule_trigger_key", "ruleTriggerKey-9b9047tr8cf2451c9e1b484b375ede929");
         oneTouchRule.put("rule", rule);
         oneTouchRule.put("dashboard_attributes", dashboardAttributes);

         oneTouchRules.add(oneTouchRule);

         payload.put("one_touch_rules", oneTouchRules);
         
         String jsonString = mapToJsonString(payload);

         System.out.println(jsonString);
		return jsonString;
         
	}

         private static String mapToJsonString(Map<String, Object> map) {
             StringBuilder sb = new StringBuilder();
             sb.append("{");

             for (Map.Entry<String, Object> entry : map.entrySet()) {
                 sb.append("\"").append(entry.getKey()).append("\":");
                 Object value = entry.getValue();
                 if (value instanceof Map) {
                     sb.append(mapToJsonString((Map<String, Object>) value));
                 } else if (value instanceof List) {
                     sb.append(listToJsonString((List<Object>) value));
                 } else if (value instanceof String) {
                     sb.append("\"").append(value).append("\"");
                 } else {
                     sb.append(value);
                 }
                 sb.append(",");
             }

             if (sb.length() > 1) {
                 sb.setLength(sb.length() - 1);
             }

             sb.append("}");

             return sb.toString();
         }

         private static String listToJsonString(List<Object> list) {
             StringBuilder requestBody = new StringBuilder();
             requestBody.append("[");

             for (Object item : list) {
                 if (item instanceof Map) {
                	 requestBody.append(mapToJsonString((Map<String, Object>) item));
                 } else if (item instanceof List) {
                	 requestBody.append(listToJsonString((List<Object>) item));
                 } else if (item instanceof String) {
                	 requestBody.append("\"").append(item).append("\"");
                 } else {
                	 requestBody.append(item);
                 }
                 requestBody.append(",");
             }

             if (requestBody.length() > 1) {
            	 requestBody.setLength(requestBody.length() - 1);
             }

             requestBody.append("]");

             return requestBody.toString();
         }
}
         

