package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */

class Exercise_04{
    static int x;

    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method1(4));
        System.out.println(method1("Hello"));
        System.out.println(method1(4,10));

    }
    //this method sets x=2 without any parameters
    public static int method1(){
        x = 2;
        return x;
    }
    //this method sets x=y where the parameter is an int
    public static int method1(int y){
        x = y;
        return x;
    }
    //this method sets x=z where the parameter is a string
    public static String method1(String z){
        String x = z;
        return x;
    }
    //this method sets x = y+z when two int parameters are given
    public static int method1(int y, int z){
        x = y+z;
        return x;
    }
}
