package com.coreprogram;
import java.util.Scanner;

public class QuotientAndReminder {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the two number:");
        int number1 =scanner.nextInt();
        int number2 =scanner.nextInt();

            int reminder = number1 % number2 ;
            int quotient = number1 / number2 ;
            System.out.println("Reminder " + reminder);
            System.out.println("Quotient " + quotient);
        }
    }

