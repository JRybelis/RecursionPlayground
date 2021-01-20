/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionplayground;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Jokubas
 */
public class Factorial {

    public static void main(String args[]) {

        System.out.println("");
        System.out.println(
                "The program wil take any number, ranging from 0 to 256 and calculate its factorial value.");
        System.out.println("");

        BigInteger fact = BigInteger.ONE;
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
        BigInteger number = sc.nextBigInteger();
        fact = factorial(number);

        System.out.println("The factorial of " + number + " is: " + fact + ".");
    }

    public static BigInteger factorial(BigInteger number) {
        Scanner sc = new Scanner(System.in);

        if ((number.compareTo(BigInteger.ZERO) < 0) || (number.compareTo(
                BigInteger.valueOf(256)) > 0)) {
            System.out.println(
                    "Please provide a number that fits the range parameters (0 to 256), the factorial value of which you wish to calculate: ");
            return number = sc.nextBigInteger();
        } else if (number.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return (number.multiply(factorial(number.subtract(BigInteger.ONE))));
        }
    }
}

//    private static long factorial(long n) {
//        if ((number == 0) || (number == 1)) {
//            return 1;
//        } else {
//            return (number * factorial(number - 1));
//        }
