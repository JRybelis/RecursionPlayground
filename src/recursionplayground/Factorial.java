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
public class Factorial {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long fact = 0;

        System.out.println("");
        System.out.println(
                "The program wil take any number, ranging from 0 to 256 and calculate its factorial value.");
        System.out.println(
                "Please provide a  number that fits the range parameters (0 to 256), the factorial value of which you wish to calculate: ");
        System.out.println("");
        long number = sc.nextInt();
        
        fact = factorial(number);
        System.out.println("The factorial of " + number + " is " + fact);

    }

    private static long factorial(long n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

}
