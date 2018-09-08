package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Exercise_02{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        //for loop to fill in the numbers array
        for (int i=0; i<numbers.length; i++){
            numbers[i]=i;
        }

        //printing array with catches
        for (int i = 0; i<15; i++){
            try {
                System.out.println(10/numbers[i]);
            }
            //catching the dividing by zero
            catch(ArithmeticException exception){
                System.out.println("You can't divide by zero!");
            }
            //catching the array out of bounds error
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println("The number is out of range!");
                return;
            }
        }
    }

}

