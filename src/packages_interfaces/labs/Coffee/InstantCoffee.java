package packages_interfaces.labs.Coffee;

//the InstantCoffee class implements the coffee interface
//it is abstract so it doens't have to implement the grindCoffee() method

public abstract class InstantCoffee implements Coffee{

    //below are the four methods needed for the coffee interface
    public int priceOfCoffee(){
        int price = 1;
        return price;
    }
    public String nameOfCoffee(){
        String name = "Starbuck'sInstant";
        return name;
    }
    //public void grindCoffee(){
        //this isn't needed so make it default on coffee interface }

    public void brewCoffee(){
        //method to brew instant coffee
    }
}
