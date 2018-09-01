package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */
//Class1 is used to create an airplane with number of seats and if it's on time
class Class1 {
    int seats;
    Boolean onTime;

    //this is the constructor to create an object- airplane
    public Class1(int seats, Boolean onTime) {
        this.seats = seats;
        this.onTime = onTime;
    }

    public static void main(String[] args) {
        //creating an object for Class1
        Class1 Boeing737 = new Class1 (300, false);
        //creating an object for Class2
        Class2 oldLady = new Class2 ("Hello sir", 3, true);
        //creating an object for Class3
        Class3 poodle = new Class3 ("poodle", 5, true);
        //calling a non-static get method from Class2
        System.out.println(oldLady.getGreeting());
        //calling a non-static set method from Class3
        int newNoise = poodle.setNoise();
        System.out.println(newNoise);

    }

}

//Class2 is used to create a person with a favorite greeting, a walking pace, and if they are polite
class Class2 {
    String greeting;
    int pace;
    Boolean polite;

    //this is the constructor to create an object person
    public Class2(String greeting, int pace, Boolean polite) {
        this.greeting = greeting;
        this.pace = pace;
        this.polite = polite;
    }

    //this is the non-static method in Class2 to get the greeting
    public String getGreeting() {
        return this.greeting;
    }
}


//Class3 is used to create a dog with a breed, their noise level, and if they are large
class Class3{
    String breed;
    int noise;
    Boolean large;

    //this is the constructor to create an object dog
    public Class3(String breed, int noise, Boolean large) {
        this.breed = breed;
        this.noise = noise;
        this.large = large;
    }
    //this is a non-static method in Class3 to set the noise level
    public int setNoise(){
        this.noise = 10;
        return noise;
    }
}
