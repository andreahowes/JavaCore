package exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_04 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        //for loop to fill in the numbers array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        //printing array with nested try/catches
        try {
            for (int i = 0; i < 15; i++) {
                try {
                    System.out.println(10 / numbers[i]);
                }
                //catching the dividing by zero
                catch (ArithmeticException exception) {
                    System.out.println("You can't divide by zero!");
                }
            }
        }
        //catching the array out of bounds error
        //}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The number is out of range!");
        }
    }
}
