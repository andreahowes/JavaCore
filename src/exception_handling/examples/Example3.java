package exception_handling.examples;

import java.sql.SQLOutput;

// Let JVM handle the error.
class NotHandled {
    public static void main(String args[]) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // generate an index out-of-bounds exception
        try {
            nums[7] = 10;
            System.out.println("This isn't displayed- the program switches to the catch.");
        }
        catch (ArrayIndexOutOfBoundsException myException){
            System.out.println("This array is out of bounds!");
        }
    }
}
