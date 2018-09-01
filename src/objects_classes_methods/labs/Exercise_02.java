package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


public class Exercise_02 {
    public static void main(String[] args) {
        //1. this is the static method calling another static method (the main method calling method add2)
        int y = add2(5);
        System.out.println(y);

        //jimmy is an object for the non-static methods to use
        //jimmyWeight is the original int changed by the non-static methods
        Exercise_02 jimmy = new Exercise_02();
        int jimmyWeight = 8;
        //2. A static method call a non-static method
        //3. this is also an example of a non-static method returning a value (as int x)
        //4. this is also an example of a non-static method passing a value (int jimmyweight) back to the main method
        int x = jimmy.jimmyFirstPie(jimmyWeight);
        System.out.println(x);
    }

    // 1. add2 is a static method that the static main method will call
    public static int add2(int x){
        int newWeight = x + 5;
        return newWeight;
    }

    // jimmyFirstPie is a non-static method that will be called by the object jimmy (in the static main method) and adds 7 to int jimmyWeight
    public int jimmyFirstPie(int jimmyWeight){
        int newJimmyWeight = jimmyWeight + 7;
        return newJimmyWeight;
    }

}