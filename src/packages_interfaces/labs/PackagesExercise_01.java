package packages_interfaces.labs;

import static packages_interfaces.labs.package1.Class1inPackage1.publicMethod1;
import static packages_interfaces.labs.package2.Class2inPackage2.publicMethod2;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

class PackagesExercise_01{

    public static void main(String[] args) {
        //demonstrating calling the two public methods from this package
        publicMethod1();
        publicMethod2();
        //demonstrating being unable to call two protected methods from this package
        //secretNumber1();
        //secretWord();

    }


}