package com.coreprogram;
import java.util.Scanner;

public class PowerOfNumber {
     static void Power(int num){
        int a=1, b=(int) Math.pow(2,num);
        if(num >=0 && num < 31) {
            while (a < b) {
                a = a * 2;
                System.out.println(a);
            }
        }else
            System.out.println("Invalid Number :");
    }
    public static void main(String[] args) {
        System.out.println("Enter the Power Value : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("\n The Power table of 2 : ");
        Power(num);
    }
}
