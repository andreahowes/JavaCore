package exception_handling.examples;

// An exception for queue-empty errors.
class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}


public class Example17 {

    public static void main(String[] args) throws QueueEmptyException {
        int myArray[] = new int[0];
        String greeting = "Hello";
        if (myArray.length ==0) {
            throw new QueueEmptyException();
            //System.out.println("Threw new exception");
        }
        else //return greeting = "Hello";
            System.out.println("Hello, x isn't 0");
    }
}