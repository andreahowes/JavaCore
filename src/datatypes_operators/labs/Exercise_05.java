package datatypes_operators.labs;
import java.util.Scanner;
/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10");
        //user chooses a number
        int userNumber = scanner.nextInt();
        //creating int variable location
        int location = 0;

        //for loop that breaks when user number is found
        for (int i= 0; i<array.length; i++){
            if (array[i]== userNumber){
                location = i;
                break;
            }
            else {
                continue;
            }
                
        }
        //printing the location of user's number
        System.out.println(location);

    }
}