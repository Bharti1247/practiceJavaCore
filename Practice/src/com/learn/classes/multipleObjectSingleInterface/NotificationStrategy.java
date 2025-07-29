package com.learn.classes.multipleObjectSingleInterface;

public interface NotificationStrategy {
	String getType ();
	
	void sendNotification(String to, String msg);

}
