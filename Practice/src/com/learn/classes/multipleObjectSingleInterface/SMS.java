package com.learn.classes.multipleObjectSingleInterface;

public class SMS implements NotificationStrategy {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "SMS";
	}

	@Override
	public void sendNotification(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS notification to " + to + "\nMessage : " + msg);
	}

}
