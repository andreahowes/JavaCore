package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method.
 *      The main method should create at least two objects using the
 *      constructors of the second and third class.
 *      The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *      Once the objects are created, try changing the values of some of the instance variables.
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class ZooAnimals {
    public static void main(String[] args) {
        //creating two new objects in classes BigCat and Bird
        BigCat tiger = new BigCat("Simba", "Dr. April", 300, true);
        Bird flamingo = new Bird("Pinky", "Sam", 30, false, true);

        //printing out both toStrings
        System.out.println(tiger.toString());
        System.out.println(flamingo.toString());
    }
}

// class BigCat creates a new cat
class BigCat{
    String name;
    String zookeeper;
    int weight;
    Boolean hasKilled;
// this constructor is for a new cat
    public BigCat(String name, String zookeeper, int weight, Boolean hasKilled) {
        this.name = name;
        this.zookeeper = zookeeper;
        this.weight = weight;
        this.hasKilled = hasKilled;
    }
//this toString prints all the cat information
    @Override
    public String toString() {
        return "BigCat{" +
                "name='" + name + '\'' +
                ", zookeeper='" + zookeeper + '\'' +
                ", weight=" + weight +
                ", hasKilled=" + hasKilled +
                '}';
    }
}

//class Bird creates a new bird
class Bird{
    String name;
    String zookeeper;
    int weight;
    Boolean canFly;
    Boolean escapedFromExhibit;
// this constructor is for a new bird
    public Bird(String name, String zookeeper, int weight, Boolean canFly, Boolean escapedFromExhibit) {
        this.name = name;
        this.zookeeper = zookeeper;
        this.weight = weight;
        this.canFly = canFly;
        this.escapedFromExhibit = escapedFromExhibit;
    }
//this toString prints all the bird information
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", zookeeper='" + zookeeper + '\'' +
                ", weight=" + weight +
                ", canFly=" + canFly +
                ", escapedFromExhibit=" + escapedFromExhibit +
                '}';
    }
}
