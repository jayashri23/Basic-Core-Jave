package com.coreprogram;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet");
        Scanner scanner = new Scanner(System.in);
        char check =scanner.next().charAt(0);
        if (check =='a'|| check =='e'|| check == 'i' || check == 'o' || check == 'u'||
              check == 'A' ||check == 'E' || check == 'I' || check == 'O' || check == 'U')
        {
          System.out.println(check+ " is Vowel");
        }
        else
        {
          System.out.println(check + " is Consonant");
        }
    }
}

