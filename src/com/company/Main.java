package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Not tested on the AP Exam
        //Step 1: Create the Scanner
        Scanner kb = new Scanner(System.in);
        //Step 2: Ask your user
        System.out.println("Enter your favorite int");
        //Step 3: Record input
        int i = kb.nextInt();
        //test
        System.out.println("Your favorite int is " + i);

        //Step 2, Step 3
        System.out.println("Enter your favorite double");
        double d = kb.nextDouble();
        System.out.println("Your favorite double is " + d);
        Scanner kbString = new Scanner(System.in);

        System.out.println("Enter your favorite color");
        String color = kb.nextLine();
        System.out.println("Your favorite color is " + color);
        //WTJ

        // || = or true wins
        // && = and false wins
        // ! = opposite !true = false !false = true
        // == = equal to y == 3
        // Operator precedence
        // !
        // == !=
        // &&
        // ||


    }
}
