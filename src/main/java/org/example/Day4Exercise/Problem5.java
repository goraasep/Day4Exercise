package org.example.Day4Exercise;

import java.util.Scanner;

public class Problem5 {
    public static void run() {
        System.out.println("5. Write a code to swap the case of each character from string.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        try {
            String inString = myObj.nextLine();
            char[] arrChar = inString.toCharArray();
            for (int i = 0; i < arrChar.length; i++) {
                if (Character.isUpperCase(arrChar[i])) {
                    arrChar[i] = Character.toLowerCase(arrChar[i]);
                } else {
                    arrChar[i] = Character.toUpperCase(arrChar[i]);
                }
            }
            String text = String.valueOf(arrChar);
            System.out.println("Output : " + text);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
