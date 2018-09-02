package datatypes_operators.labs;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creation of array
        int[] myArray = new int[10];

        //for loop to have user pick 10 numbers and put them in an array
        for (int i=0; i<myArray.length; i++){
            System.out.println("Pick ten numbers");
            myArray[i] = scanner.nextInt();
        }
        //int y used for sum of array
        int y = 0;

        //for loop to add the array
        for (int i=0; i<myArray.length; i++){
            y+=myArray[i];
        }
        //printing sum and average of array
        System.out.println("The sum of all ten numbers is " + y);
        System.out.println("The average of all ten numbers is " + y/10);
    }

}