package org.example.Day4Exercise;

import java.util.Scanner;

public class Problem2 {
    public static void run() {
        System.out.println("2. Write a program to print the following pattern for n rows.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        try {
            int inNumber = myObj.nextInt();
            for (int i = 1; i <= inNumber; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
