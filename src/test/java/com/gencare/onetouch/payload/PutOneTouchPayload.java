package com.gencare.onetouch.payload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import com.gencare.api.base.BaseAutomationTest;

public class PutOneTouchPayload extends BaseAutomationTest{
	public static String getPutOneTouchPayload() throws Exception {
		
		Map<String, Object> payload = new HashMap();
		
		List<Map<String, Object>> oneTouchRules = new ArrayList<>();
		Map<String, Object> oneTouchRule = new HashMap();
		oneTouchRule.put("rule_trigger_key", "ruleTriggerKey-9b9047tr8cf371c9evh484b375ede929");
	
		Map<String, Object> rule = new HashMap();
		rule.put("key", "c022113ca1aa5e9dae4gy179htr570c10");
		rule.put(  "name", "Party Mode: Fan Coil Thermostat 5 1");
		
		List<Map<String,Object>> actions= new ArrayList();
		Map<String,Object> action=new HashMap();
		action.put("op", "SetValue");
		
		List<Map<String, Object>> actionParam= new ArrayList();
		Map<String, Object> paramString1 = new HashMap();
		paramString1.put("string", "001e5e09025bd990");
		actionParam.add(paramString1);
		
		Map<String, Object> paramString2 = new HashMap();
		paramString2.put(   "string", "ep_9:sTherS:SetHeatingSetpoint_x100");
		actionParam.add(paramString2);
		
		Map<String, Object> paramNumber1 = new HashMap();
		paramNumber1.put("number", 2100);
		actionParam.add(paramNumber1);
		
		action.put("parameters",actionParam);
		actions.add(action);
		
		///////////////////////////////////////////////////Actions param1////////////////////////////////
		
		
		Map<String,Object> action1= new HashMap();
		action1.put("op", "SetValue");
		List<Map<String, Object>> ActionParam2= new ArrayList();
		Map<String,Object> paramTwoString1= new HashMap();
		paramTwoString1.put("string", "001e5e09025bd990");
		ActionParam2.add(paramTwoString1);
		
		Map<String,Object> paramTwoString2= new HashMap();
		paramTwoString2.put("string", "ep_9:sTherS:SetCoolingSetpoint_x100");
		ActionParam2.add(paramTwoString2);
		
		Map<String,Object> paramTwoNumber2= new HashMap();
		paramTwoNumber2.put( "number", 2100);
		ActionParam2.add(paramTwoNumber2);
		
		action1.put("parameters", ActionParam2);
		actions.add(action1);
		///////////////////////////////////////////////////Actions param2////////////////////////////////

		
		Map<String,Object>Actions2= new HashMap();
		Actions2.put("op", "StartTimer");
		List<Map<String,Object>> actionParam3= new ArrayList();
		
		Map<String, Object> paramThreeString1= new HashMap();
		paramThreeString1.put("string", "timerTriggerKey_7c7abd4d9a181c078f0639f63a9f36f3");
		actionParam3.add(paramThreeString1);
		
		Map<String,Object> paramNumber2= new HashMap();
		paramNumber2.put("number", 7200);
		actionParam3.add(paramNumber2);
		
		Map<String, Object> paramThreeString2= new HashMap();
		paramThreeString2.put("string", "timerTriggerKey_7c7abd4d9a181c078f0639f63a9f36f3");
		actionParam3.add(paramThreeString2);
		
		Actions2.put("parameters", actionParam3);
		actions.add(Actions2);
		rule.put("action", actions);
		///////////////////////////////////////////////////Actions param3////////////////////////////////

		Map<String, Object> active= new HashMap();
		active.put("active", true);
		
		Map<String,Object> condition= new HashMap();
		condition.put("op", "OR");
		
		List<Map<String,Object>> ConditionParam1= new ArrayList();
		Map<String,Object> Param1= new HashMap();
		Param1.put("op", "EQ");
		ConditionParam1.add(Param1);
		
		List<Map<String,Object>> ConditionParam2 = new ArrayList();
		Map<String,Object> Param2= new HashMap();
		Param2.put("op", "GetValue");
		ConditionParam2.add(Param2);
		
		List<Map<String,Object>> ConditionParam3 = new ArrayList();
	
		Map<String,Object> Param3Stringone= new HashMap();
		Param3Stringone.put("string", "0000000000000000");
		ConditionParam3.add(Param3Stringone);
		
		Map<String,Object> Param3Stringtwo= new HashMap();
		Param3Stringtwo.put( "string", "ep_0:sRule:TriggerRule");
		ConditionParam3.add(Param3Stringtwo);
		Param2.put("parameters", ConditionParam3);
		ConditionParam2.add(Param1);
		
		Map<String,Object> stringthree= new HashMap();
		stringthree.put("string", "ruleTriggerKey-9b90474d8cf371c9e1b484b375ede929");
		ConditionParam2.add(stringthree);
		
		Param1.put("parameters", ConditionParam2);
		ConditionParam1.add(Param1);
		
		condition.put("parameters", ConditionParam1);
		rule.put("condition",condition);
		
		oneTouchRule.put("rule", rule);
		
		////////////////////////////////////Condition////////////////////////////////////////////////
		Map<String, Object> dashboardattributes= new HashMap();
		dashboardattributes.put("type", "one_touch_rule");
		oneTouchRule.put("dashboard_attributes", dashboardattributes);
		
		oneTouchRules.add(oneTouchRule);
		
		payload.put( "one_touch_rules", oneTouchRules);
		
		JSONObject js = new JSONObject(payload);

		String final_payload = js.toString();

		System.out.println(final_payload);
		return final_payload;
		
	
	}
	}
