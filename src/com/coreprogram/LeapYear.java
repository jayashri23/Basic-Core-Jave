package com.coreprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year > 999) {
            if (year % 400 != 0 && year % 100 == 0 || year % 4 == 0) {
                System.out.println(year + " : Leap Year");
            } else
                System.out.println(year + ": Not Leap Year");
        }
    }
}