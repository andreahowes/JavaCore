package generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 */
public class Exercise_02{

    //setting the location to 0 originally
    int location = 0;
    public static < E > void printLocation( E[] inputArray, int location ){
            E x = inputArray[location];
            //print x
            System.out.println(x);
    }

    public static void main(String[] args) {
        //creating the arrays for different types
        Integer[] intArray = { 1, 2, 3, 4 };
        Double[] doubleArray = {1.1, 2.2};
        Boolean[] boolArray = {true, true, false, false};

        //see if generic method works
        printLocation(boolArray, 2);
        printLocation(intArray, 1);
        printLocation(doubleArray, 0);

    }

}