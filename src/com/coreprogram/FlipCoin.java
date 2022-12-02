package com.coreprogram;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        double head =0;
        double tail =0;
        int totalTails=0;
        int totalHeads =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times flip coins:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            Random random = new Random();
            int flip = random.nextInt(2);
            if (flip < 0.5)
                totalHeads++;

            else
                totalTails++;
        }
        double percentageOfTails =totalTails/(double)n*100;
        System.out.println("Percentage of Tails :" + percentageOfTails);
        double percentageOfHeads =totalHeads/(double)n*100;
        System.out.println("Percentage of Heads :" + percentageOfHeads);
    }
}