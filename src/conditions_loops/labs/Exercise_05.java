package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner first_input = new Scanner(System.in);
        System.out.println("Choose a higher number:");
        int high = first_input.nextInt();

        Scanner second_input = new Scanner(System.in);
        System.out.println("Choose a lower number:");
        int low = second_input.nextInt();
        int y = 0;

        for(int x=low; x<=high; x++){
            y+=x;
        }
        System.out.println("the sum of numbers from the lower bound to the upper bound is " + y);

        double average = (high + low) / 2.00;
        System.out.println("The average of these two numbers is: " + average);
    }
}
