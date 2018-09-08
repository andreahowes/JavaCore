package exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class Exercise_05{

    public static void main(String[] args) {
        try{
            System.out.println("I'm about to throw an exception!");
            throw new ArithmeticException();
        }

        catch(ArithmeticException exc){
            System.out.println("Arithmetic Exception caught!");
        }
    }
}