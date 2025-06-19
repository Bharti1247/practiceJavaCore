package com.learn.designPatterns.abstractFactory;

import com.learn.designPatterns.factory.Factory;
import com.learn.designPatterns.factory.Profession;

public class AbstractFactory {

	public Profession getService(String choice, int input) {
		Factory fact = new Factory();
		FactoryJunior fj = new FactoryJunior();
		
		switch (choice) {
			case "Yes" : return fact.getService(input);
			case "No" : return fj.getService(input);
			default : throw new IllegalArgumentException("Invalid choice");
		}
	}

}
