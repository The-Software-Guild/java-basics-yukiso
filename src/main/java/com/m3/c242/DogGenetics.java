package com.m3.c242;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        String dogName;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int[] rands = rand.ints(5, 0, Short.MAX_VALUE / 5).toArray();
        int[] dogs = Arrays.stream(rands).map(i -> Math.round(i * 100.0f / Arrays.stream(rands).sum())).toArray();
        dogs[rand.nextInt(dogs.length)] += 100 - Arrays.stream(dogs).sum();

        System.out.print("What is your dog's name? ");
        dogName = s.nextLine();
        System.out.printf("Well then, I have this highly reliable report on %s's prestigious background right here.\n\n", dogName);
        System.out.printf("%s is:\n\n", dogName);
        System.out.println(dogs[0] + "% St. Bernard");
        System.out.println(dogs[1] + "% Chihuahua");
        System.out.println(dogs[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(dogs[3] + "% Common Cur");
        System.out.println(dogs[4] + "% King Doberman\n");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
