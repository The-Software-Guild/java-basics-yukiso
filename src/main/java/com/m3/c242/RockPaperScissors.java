package com.m3.c242;

//        +=============+=========+==========+=============+
//        |     -       | Rock(0) | Paper(1) | Scissors(2) |
//        +=============+=========+==========+=============+
//        | Rock(1)     |       1 |        0 |          -1 |
//        +-------------+---------+----------+-------------+
//        | Paper(2)    |       2 |        1 |           0 |
//        +-------------+---------+----------+-------------+
//        | Scissors(3) |       3 |        2 |           1 |
//        +-------------+---------+----------+-------------+


//        +=============+==============+==============+==============+
//        |     -       |   Rock(0)    |   Paper(1)   | Scissors(2)  |
//        +=============+==============+==============+==============+
//        | Rock(1)     | Tie          | Computer Win | Player Win   |
//        +-------------+--------------+--------------+--------------+
//        | Paper(2)    | Player Win   | Tie          | Computer Win |
//        +-------------+--------------+--------------+--------------+
//        | Scissors(3) | Computer Win | Player Win   | Tie          |
//        +-------------+--------------+--------------+--------------+


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int rounds, playerChoice, computerChoice, playerWins, computerWins, ties;
        String[] choices = new String[]{"Rock", "Paper", "Scissors"};
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            playerWins = 0;
            computerWins = 0;
            ties = 0;
            System.out.print("Number of rounds(1, 10): ");
            rounds = s.nextInt();
            if (rounds < 1 || rounds > 10) {
                System.out.printf("%d is out of range(1, 10)\n", rounds);
                return;
            }

            for (int i = 0; i < rounds; i++) {
                System.out.print("Choose between 1 = Rock, 2 = Paper, 3 = Scissors: ");
                playerChoice = s.nextInt();
                computerChoice = rand.nextInt(3);
                switch (playerChoice - computerChoice) {
                    case 0:
                    case 3:
                        System.out.print("You lost! ");
                        computerWins++;
                        break;
                    case -1:
                    case 2:
                        System.out.print("You Won! ");
                        playerWins++;
                        break;
                    case 1:
                        System.out.print("It's a tie! ");
                        ties++;
                        break;

                }
                System.out.printf("The computer chose %s\n", choices[computerChoice]);

            }

            if (playerWins < computerWins)
                System.out.println("Computer won the overall game");
            else if (playerWins > computerWins)
                System.out.println("You won the overall game");
            else
                System.out.println("The overall game is a tie");
            System.out.printf("User wins: %d ;Computer wins: %d ;Ties: %d\n", playerWins, computerWins, ties);

            System.out.print("Play next?(Yes/No) ");
            if (s.next().equals("No")) {
                System.out.println("Thanks for playing!");
                return;
            }
        }
    }
}
