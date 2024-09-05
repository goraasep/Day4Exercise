package org.example;

import org.example.Day4Exercise.Exercise;
import org.example.Day4Exercise.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Choose Exercise: ");
        String arg = myObj.nextLine();
        if (Utils.isInteger(arg)) {
            Exercise.run(Integer.parseInt(arg));
        } else {
            System.out.println("Input is not integer type.");
        }
    }
}