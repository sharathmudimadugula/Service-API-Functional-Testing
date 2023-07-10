package com.gencare.dashboardatributes.negative;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOccupantDashboardAttributesNegativePage {

	@JsonProperty("item_id")
		private boolean itemid ;
	@JsonProperty("grid_order")
		private boolean gridorder;
		private boolean type;
		public void getItemid(boolean b) {
			// TODO Auto-generated method stub
			
		}
			
}
