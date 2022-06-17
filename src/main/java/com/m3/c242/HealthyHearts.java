package com.m3.c242;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        System.out.print("What is your age? ");
        Scanner s = new Scanner(System.in);
        int heartRate = 220 - s.nextInt();
        System.out.printf("Your maximum heart rate should be %d beats per minute", heartRate);
        System.out.printf("Your target HR Zone is %d - %d beats per minute\n", Math.round(heartRate * .5), Math.round(heartRate * .85));
    }
}
