/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionplayground;

import java.util.Scanner;

/**
 *
 * @author Jokubas
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println(
                "The program will take any number, ranging from 1 to 50, as a member integer of the Fibonacci sequence. It will then calculate and display the values of Fibonacci sequence members leading to it.");
        System.out.println("");

        long userInput = 0;
        long index = 0;
        boolean breakClause = true;
        Scanner persistScanner = new Scanner(System.in);

        while ((userInput <= 0) || (userInput > 1000)) {
            System.out.println(
                    "Please provide a number that fits the range parameters of 1 to 50, for the position in the Fibonacci sequence.");
            String inputStringified = persistScanner.nextLine();

            try {
                userInput = Integer.valueOf(inputStringified);
            } catch (NumberFormatException e) {
                userInput = 0;
            }
       }
        while (breakClause = true) {
            if ( index == userInput) {
                breakClause = false;
            }
            System.out.println("The number " + index
                + " in the Fibonacci sequence is: " + fibonacci(index) + ".");
            index++;
        }
        System.out.println("The end of the sequence.");

    }

    public static long fibonacci(long index) {

        if (index < 2) {
            return index;
        } else {
            return (fibonacci(index - 1)
                    + (fibonacci(index - 2)));
        }
    }

}

// sk3 = 1 + 1;
//            if (true) {
//                fibonacci(sk2, sk3, max)
