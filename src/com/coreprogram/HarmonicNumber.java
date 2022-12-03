package com.coreprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double harmonic_Number=0.0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Harmonic Value: ");
        int n =scanner.nextInt();
         for (double i = 1 ;i <= n ;i++){
            harmonic_Number = harmonic_Number + 1 / i;
        }
        System.out.println("Harmonic Number : " +harmonic_Number);
    }
}
