package com.m3.c242;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        int limit = 101, currentPercentage;
        String dogName;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("What is your dog's name? ");
        dogName = s.nextLine();
        System.out.printf("Well then, I have this highly reliable report on %s's prestigious background right here.\n" +
                        "\n" +
                        "%s is:\n" +
                        "\n" +
                        "%d%% St. Bernard\n" +
                        "%d%% Chihuahua\n" +
                        "%d%% Dramatic RedNosed Asian Pug\n" +
                        "%d%% Common Cur\n" +
                        "%d%% King Doberman\n" +
                        "\n" +
                        "Wow, that's QUITE the dog!\n",
                dogName, dogName,
                currentPercentage = rand.nextInt(limit),
                currentPercentage = rand.nextInt(limit -= currentPercentage),
                currentPercentage = rand.nextInt(limit -= currentPercentage),
                currentPercentage = rand.nextInt(limit -= currentPercentage),
                limit - currentPercentage - 1);
    }
}
