package com.gencare.permissionsPage;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutPermissionsPage {
	@JsonProperty("access_level")
	private String accesslevel;

}
