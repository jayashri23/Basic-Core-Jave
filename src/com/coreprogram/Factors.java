package com.coreprogram;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        int k=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scanner.nextInt();
        for (int i = 2; i<= n; i++) {
            while (n % i == 0){
                System.out.println(i+ "");
                n=n/i;
            }
        }
        if (n >2){
            System.out.println(n);
        }
    }
}
