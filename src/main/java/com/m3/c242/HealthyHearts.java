package com.m3.c242;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int heartRate = 220;
        System.out.print("What is your age? ");
        Scanner s = new Scanner(System.in);
        heartRate -= s.nextInt();
        System.out.printf("Your maximum heart rate should be %d beats per minute\n" +
                        "Your target HR Zone is %d - %d beats per minute\n",
                heartRate, Math.round(heartRate * .5), Math.round(heartRate * .85));
    }
}
