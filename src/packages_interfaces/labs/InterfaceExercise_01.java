package packages_interfaces.labs;

import packages_interfaces.labs.Coffee.ColdBrew;

/**
 * Interfaces Exercise 1:
 *
 *      1) Write an interface with at least three methods. Write two classes that implement the
 *          interface in different ways.
 *      2) Write a class that extends one of the classes from the previous step. Overwrite the methods in
 *          the parent class.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle interface, that is extended by a Tractor class and a Scooter class. Two of the methods could be
 *          turnOn() and brake().
 *       - A PersonalDevice interface that is extended by a iPad class and a Computer class. Two of the methods could be
 *          playMusic() and turnOff().
 */

//using a java file named Coffee.java
//the classes and interface are in the Coffee package inside labs inside packages_interfaces (same location as this class)

class InterfaceExercise_01{
public static void main(String[] args){
        //creating an object in class ColdBrew (extends PoutOverCoffee class which implements coffee interface)
        ColdBrew myColdBrew=new ColdBrew();
        //running an overridden method in ColdBrew class with object myColdBrew
        myColdBrew.brewCoffee();
        }
}