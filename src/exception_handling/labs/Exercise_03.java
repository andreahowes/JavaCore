package exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03{

    public static void main(String[] args) {
        int x = 100;
        int y = 0;

        try{
            int z = x/y;
            System.out.println(z);
        }

        catch(ArithmeticException exception){
            System.out.println("You can't divide by zero!");
        }
        finally {
            System.out.println("This is the end of the program!");
        }
    }

}
