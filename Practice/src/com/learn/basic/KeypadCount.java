package com.learn.basic;

public class KeypadCount {

	public static void main(String[] args) {
		
		String input = "I love India";
		input = input.toLowerCase();
		int len = input.length();
		int count = 0;
		
		for (int i=0; i<len; i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'd' || ch == 'g' || ch == 'j' || ch == 'm' || ch == 'p' || ch == 't' || ch == 'w' || ch == ' ')
				count++;
			else if (ch == 'b' || ch == 'e' || ch == 'h' || ch == 'k' || ch == 'n' || ch == 'q' || ch == 'u' || ch == 'x')
				count += 2;
			else if (ch == 'c' || ch == 'f' || ch == 'i' || ch == 'l' || ch == 'o' || ch == 'r' || ch == 'v' || ch == 'y')
				count += 3;
			else if (ch == 's' || ch == 'z')
				count += 4;
		}
		
		if (count > 0)
			System.out.println("No. of times keys were pressed : " + count);
		else System.out.println("Empty string.");
	}

}
