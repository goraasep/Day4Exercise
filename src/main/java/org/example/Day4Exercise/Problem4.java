package org.example.Day4Exercise;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {
    public static void run() {
        System.out.println("4. Guess the number.");
        Random rand = new Random();
        int randomInt = rand.nextInt(100);
        boolean run = true;
        int attempt = 0;
        while (run) {
            try {
                attempt++;
                Scanner myObj = new Scanner(System.in);
                System.out.print("Input : ");
                int inNumber = myObj.nextInt();
                if (inNumber > randomInt) {
                    System.out.println("Too High!");
                } else if (inNumber < randomInt) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Correct!");
                    System.out.println("Attempts taken : " + attempt);
                    run = false;
//                    break;
                }
            } catch (Exception e) {
                System.out.println("Error : " + e);
                continue;
            }
        }

    }
}
