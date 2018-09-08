package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01{

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try{
            int z = x/y;
            System.out.println(z);
        }

        catch(ArithmeticException exception){
            System.out.println("You can't divide by zero!");
        }
        finally {
            System.out.println("The end");
        }
    }

}
