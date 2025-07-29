package com.learn.classes.multipleObjectSingleInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
	
	// map to store strategy type and strategy
	private final Map<String, NotificationStrategy> strategyMap = new HashMap<>();
	
	// constructor
	public NotificationService(List<NotificationStrategy> strategies) {
		for (NotificationStrategy strategy : strategies) {
			strategyMap.put(strategy.getType(), strategy);
		}
	}
	
	public void notifyUser(String type, String msg, String to) {
		NotificationStrategy strategy = strategyMap.get(type.toUpperCase()); // all my classes are returning type in Upper case
		
		if (strategy == null) {
			throw new IllegalArgumentException("Unsupported Notification strategy : " + type);
		}
		
		strategy.sendNotification(to, msg);
	}

}
