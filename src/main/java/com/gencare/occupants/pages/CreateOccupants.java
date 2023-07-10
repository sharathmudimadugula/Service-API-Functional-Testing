package com.gencare.occupants.pages;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOccupants {

	public String  email;
	public String  password;
	@JsonProperty("first_name")
	public String  firstname;
	@JsonProperty("last_name")
	public String  lastname;
	@JsonProperty("phone_number")
	public String  phonenumber;
	public String  language;
	public String  country;
	HashMap< String, Object> Metadata = new HashMap<>();

}
