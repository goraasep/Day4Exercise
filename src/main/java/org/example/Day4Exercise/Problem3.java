package org.example.Day4Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void run() {
        System.out.println("3. Write a code that reads n number of input from scanner.");
        boolean run = true;
        List<Integer> numbers = new ArrayList<Integer>();
        while (run) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input : ");
                int inNumber = scanner.nextInt();
                numbers.add(inNumber);

                scanner = new Scanner(System.in);
                System.out.print("Continue? (y/n) ");
                run = scanner.nextLine().equals("y");
            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
        }
        System.out.println("Numbers : " + numbers.toString());
    }
}
