package generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class genClass<K,V> {
    //declaring objects
    private K keyVal;
    private V myValue;

    //constructor for instance variables
    public genClass(K keyVal, V value) {
        this.keyVal = keyVal;
        this.myValue = value;
    }

    //getter methods
    public K getKeyVal() {
        return keyVal;
    }
    public V getValue() {
        return myValue;
    }

    //setter  method
    public void setKeyVal(K keyVal) {
        this.keyVal = keyVal;
    }
    public void setValue(V value) {
        this.myValue = value;
    }
}

public class Exercise_01 {
    public static void main(String[] args) {
        //creating objects of genClass with different data types
        genClass <Integer, Integer> myInt = new genClass<>(2,4);
        System.out.println(myInt.getKeyVal());
        System.out.println(myInt.getValue());


        genClass<String, Boolean> myString = new genClass<>("Hello ", true);
        System.out.println(myString.getKeyVal());
        System.out.println(myString.getValue());
    }
}