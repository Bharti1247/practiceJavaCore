package com.learn.classes.multipleObjectSingleInterface;

public class Email implements NotificationStrategy {
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "EMAIL";
	}

	@Override
	public void sendNotification(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email notification to " + to + "\nMessage : " + msg);
	}

}
