package com.gencare.permissionsPage;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostPermissionsPage {

	@JsonProperty("gateway_id")
	private String gatewayid;
	@JsonProperty("invitation_email")
	private String invitationemail;
	@JsonProperty("is_temp_access")
	private boolean istempaccess;
	@JsonProperty("access_level")
	private String accesslevel;

	
}
