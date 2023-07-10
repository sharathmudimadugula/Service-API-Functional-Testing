package com.gencare.notificationtoken.payload;

import com.gencare.api.base.BaseAutomationTest;
import com.gencare.notificationtoken.pages.PostNotificationTokensPages;

public class NotificationTokenPayload extends BaseAutomationTest {

	public static String getNotificationTokenPayload() throws Exception {
		
		PostNotificationTokensPages postNotificationTokensPages =new PostNotificationTokensPages();
		postNotificationTokensPages.setToken(getUniqueToken("6"));
		postNotificationTokensPages.setDnd(true);
		postNotificationTokensPages.setOs("iOS");
		return baseURI;
	
	
	}
	}
