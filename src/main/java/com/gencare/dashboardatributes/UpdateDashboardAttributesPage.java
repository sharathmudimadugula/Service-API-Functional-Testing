package com.gencare.dashboardatributes;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDashboardAttributesPage {
	@JsonProperty("grid_order")
	private String gridorder;
	private String id;

}
