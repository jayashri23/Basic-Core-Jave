package com.coreprogram;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Enter the first Number:");
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second Number:");
        int b = scanner.nextInt();
        System.out.println("Enter the third Number:");
        int c = scanner.nextInt();
        if (a >b && a >c ){
            System.out.println(a+ " is Maximum Number");
        }else if (b >a && b >c){
            System.out.println(b+ " is Maximum Number");
        }else if (c >a && c >b){
            System.out.println(c+ " is Maximum Number");
        }
    }
}
