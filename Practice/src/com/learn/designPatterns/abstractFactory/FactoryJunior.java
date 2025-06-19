package com.learn.designPatterns.abstractFactory;

import com.learn.designPatterns.factory.Profession;

public class FactoryJunior {
	
	public Profession getService(int num) {
		if (num == 1) return new JuniorDoctor();
		else if (num == 2) return new JuniorEngineer();
		else throw new IllegalArgumentException("Reverify your input");
	}
}
