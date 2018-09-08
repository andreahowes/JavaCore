package exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06{

    public static void main(String[] args) {
        try{
            System.out.println("I'm about to throw an exception!");
            myThrow();
        }
        catch(ArithmeticException excep){
            System.out.println("I've caught the exception!");
        }
        finally {
            System.out.println("Finished!");
        }
    }

    public static void myThrow(){
        throw new ArithmeticException();
    }
}