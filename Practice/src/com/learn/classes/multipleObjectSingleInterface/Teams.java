package com.learn.classes.multipleObjectSingleInterface;

public class Teams implements NotificationStrategy {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "TEAMS";
	}

	@Override
	public void sendNotification(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending Teams notification to " + to + "\nMessage : " + msg);
		
	}

}
