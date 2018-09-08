package exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class MyNewException extends Exception{
    //creating the new exception inside a class that extends the exception class
    MyNewException(int x){
        System.out.println("The number " + x + " is an exception");
    }
        }


class Exercise_07{
    public static void main(String[] args) throws MyNewException {
        int x = 5;
        try{
            if (x==5){
                //throwing the exception
                throw new MyNewException(x);
            }
            else{
                System.out.println("There was no exception.");
            }
        }
        //catching the exception
        catch(MyNewException myExc){
            System.out.println("We have caught the exception!");
        }

    }
}









        /*
        try {
        put in an if statement so it makes more sense
             throw new NonIntResultException()
                    }

        catch (NonIntResultException exc) {
                System.out.println(exc);
            }




        in a different class do this:
        lass NonIntResultException extends Exception {



        NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d +
                " is non-integer.";
         */