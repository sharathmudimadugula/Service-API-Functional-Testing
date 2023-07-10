package com.gencare.occupants.pages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateOccupantProfile {

	
	@JsonProperty("country")
    private String country;

    @JsonProperty("attributes")
    private Attributes attributes;

    @JsonProperty("metadata")
    private Metadata metadata;

	}

    // Constructors, getters, and setters (you can generate them using your IDE or manually)


class Attributes {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    // Constructors, getters, and setters
}

class Metadata {
    @JsonProperty("is_terms_condition")
    private String isTermsCondition;

    // Constructors, getters, and setters
}
	
	

