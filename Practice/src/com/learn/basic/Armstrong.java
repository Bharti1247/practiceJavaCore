package com.learn.basic;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
            
            // sum += Math.pow(digit, count); // same using Math.pow
            temp /= 10;
        }

        if (sum == original) System.out.println(original + " is an Armstrong number.");
        else System.out.println(original + " is NOT an Armstrong number.");
        
        scanner.close();
    }
}
