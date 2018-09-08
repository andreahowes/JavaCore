package inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */
class Park{
    //two private instance variables in class Park
    private int maxOccupancy;
    private String parkName;

    //setting two private variables
    public void setMaxOccupancy(int maxOccupancy){
        this.maxOccupancy = maxOccupancy;
    }
    public void setParkName(String parkName){
        this.parkName = parkName;
    }

    //getters for both private variables
    public int getMaxOccupancy(){
        return maxOccupancy;
    }
    public String getParkName(){
        return parkName;
    }
    //method cleanPark has to be protected instead of private so Aquarium class can access it.
    protected void cleanPark() {
        System.out.println("The park is being cleaned today!");
    }

    //#5 constructor for Park class

    public Park(int maxOccupancy, String parkName) {
        this.maxOccupancy = maxOccupancy;
        this.parkName = parkName;
    }
    //default constructor in park class to use in constructor overload in zoo and aquarium
    public Park() { }

    //#7 a method in Zoo class that will be overridden in Aquarium class
    protected void howYouCleanPark(){
        System.out.println("The park will be swept!");
    }
}



class Zoo extends Park{
    //two private instance variables in class Zoo
    private int numberOfAnimals;
    private boolean hasDangerousAnimals;

    //setting two private variables
    public void setNumberOfAnimals(int numberOfAnimals){
        this.numberOfAnimals = numberOfAnimals;
    }
    public void setHasDangerousAnimals(boolean hasDangerousAnimals){
        this.hasDangerousAnimals = hasDangerousAnimals;
    }

    //getters for both private variables
    public int getNumberOfAnimals(){
        return numberOfAnimals;
    }
    public boolean getHasDangerousAnimals(){
        return hasDangerousAnimals;
    }
    //#5 constructor for Zoo class

    public Zoo(int maxOccupancy, String parkName, int numberOfAnimals, boolean hasDangerousAnimals) {
        super(maxOccupancy, parkName);
        this.numberOfAnimals = numberOfAnimals;
        this.hasDangerousAnimals = hasDangerousAnimals;
    }

    //second Zoo class constructor to be used in the Aquarium constructor overloading
    public Zoo(boolean hasDangerousAnimals) {
        this.hasDangerousAnimals = hasDangerousAnimals;
    }
}



class Aquarium extends Zoo{
    //two private instance variables in class Aquarium
    private int numberOfFish;
    private boolean hasGreatWhiteSharks;

    //setting two private variables
    public void setNumberOfFish(int numberOfFish){
        this.numberOfFish = numberOfFish;
    }
    public void setHasGreatWhiteSharks(boolean hasGreatWhiteSharks){
        this.hasGreatWhiteSharks = hasGreatWhiteSharks;
    }

    //getters for both private variables in Aquarium class
    public int getNumberOfFish(){
        return numberOfFish;
    }
    public boolean getHasGreatWhiteSharks(){
        return hasGreatWhiteSharks;
    }

    //#5 constructor for Aquarium class using the 'super' keyword from a subclass
    public Aquarium(int maxOccupancy, String parkName, int numberOfAnimals, boolean hasDangerousAnimals, int numberOfFish, boolean hasGreatWhiteSharks) {
        super(maxOccupancy, parkName, numberOfAnimals, hasDangerousAnimals);
        this.numberOfFish = numberOfFish;
        this.hasGreatWhiteSharks = hasGreatWhiteSharks;
    }
    //#6 this is constructor overloading to create an aquarium where you only want to know about dangerous animals
    public Aquarium( boolean hasDangerousAnimals, boolean hasGreatWhiteSharks) {
        super(hasDangerousAnimals);
        this.hasGreatWhiteSharks = hasGreatWhiteSharks;
    }



    //#7 override method from Zoo class
    @Override
    protected void howYouCleanPark() {
        System.out.println("The tanks will be filtered out today!");
    }

    public static void main(String[] args) {
        //#3 demonstrating setting superclass variables from a subclass
        // creating an object in class Aquarium using constructor
        Aquarium newPortAquarium = new Aquarium(400, "New Port Aquarium", 1000, true, 15000, false);
        //setting maxOccupancy (from Park class) to 500
        newPortAquarium.setMaxOccupancy(500);

        //creating a new variable to print out max occupancy
        int newPortMaxOccupancy = newPortAquarium.getMaxOccupancy();
        System.out.println(newPortMaxOccupancy);

        //creating an object using the overloaded constructor
        Aquarium Monterey = new Aquarium(true, true);

        //#4 Using the cleanPark() method from the Park class in the Aquarium class
        newPortAquarium.cleanPark();

        //#7 demonstrating use of overridden method
        newPortAquarium.howYouCleanPark();

    }

}
