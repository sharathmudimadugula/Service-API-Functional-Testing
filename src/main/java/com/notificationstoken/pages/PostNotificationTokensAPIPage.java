package com.notificationstoken.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostNotificationTokensAPIPage {
	
	private String token;
	private String dnd;
	private String os;
}
