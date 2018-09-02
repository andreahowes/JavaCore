package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        //using alternative declaration syntax to create and populate an irregular array
        int[][] irregArray = {{1, 2, 3},{4, 5},{6, 7, 8},{9, 10, 11, 12}};
        //printing the array (with a blank line after each iteration of the first for loop
        for (int i= 0; i<irregArray.length; i++) {
            for (int x = 0; x < irregArray[i].length; x++) {
                System.out.print(irregArray[i][x] +" ");
            }
            System.out.println();
        }
    }
}
