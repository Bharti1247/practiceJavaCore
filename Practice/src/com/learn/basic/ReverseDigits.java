package com.learn.basic;
import java.util.Scanner;
public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the num: ");
		int num = input.nextInt();
		System.out.println();
		
		int reverse=0;
		int temp;
		while(num>0) {
			temp = num%10;
			reverse = reverse*10 + temp;
			num /= 10;
		}
		
		System.out.println("Reversed num: "+reverse);
						
		input.close();
	}

}
