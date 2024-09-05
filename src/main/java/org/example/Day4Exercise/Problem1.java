package org.example.Day4Exercise;

import java.util.Scanner;

public class Problem1 {
    public static void run() {
        System.out.println("1. Create a program that prints a multiplication table up to n x n.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        try {
            int inNumber = myObj.nextInt();
            for (int i = 1; i <= inNumber; i++) {
                for (int j = 1; j <= inNumber; j++) {
                    System.out.print(j * i + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
