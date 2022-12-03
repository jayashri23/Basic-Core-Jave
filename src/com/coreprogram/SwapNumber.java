package com.coreprogram;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int reverse =0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number =scanner.nextInt();
        while (number >0){
        int lastDigit =number % 10;
         reverse =(reverse*10)+lastDigit;
         number=number/10;
        }
        System.out.println("reverse Number =" +reverse);
    }
}
