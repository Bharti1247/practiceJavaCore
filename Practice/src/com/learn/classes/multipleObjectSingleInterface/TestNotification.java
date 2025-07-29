package com.learn.classes.multipleObjectSingleInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestNotification {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of type of notifications you want to send : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		List<String> notificationType = new ArrayList<>();
		
		System.out.println("Enter the type of notifications : ");
		for (int i=0; i<num; i++) {
			String input = sc.nextLine().toUpperCase();
			notificationType.add(input);
		}
		
		// List of strategies
		List<NotificationStrategy> strategies =  new ArrayList<>();
		for (String str : notificationType) {
			if (str.equals("EMAIL")) {
				strategies.add(new Email());
			} else if (str.equals("TEAMS")) {
				strategies.add(new Teams());
			} else if (str.equals("SMS")) {
				strategies.add(new SMS());
			} else {
				throw new IllegalArgumentException("Unsupported Notification strategy : " + str);
			}
		}	
		
		// calling notification service
		NotificationService notification = new NotificationService(strategies);
		
		String msgForUser = "Hello User, this is a msg for testing purpose...\n";
		for (String str : notificationType) {
			notification.notifyUser(str, msgForUser, "User");
		}
		
		sc.close();
	}

}
