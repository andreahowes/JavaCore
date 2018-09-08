package packages_interfaces.labs.Coffee;

//the ColdBrew class is extending the PourOverCoffee

public class ColdBrew extends PourOverCoffee{
    //creating a new method for brewing coffee to override super class
    public void BrewColdBrew(){
        //how to make cold brew coffee
        System.out.println("Leaving brew in fridge for 24 hours");
    }
    //overriding the price of PourOverCoffee with a different number
    @Override
    public int priceOfCoffee() {
        int price = 5;
        return price;
    }

    @Override
    public String nameOfCoffee() {
        return super.nameOfCoffee();
    }

    @Override
    public void grindCoffee() {
        super.grindCoffee();
    }
    //overriding the method for brewCoffee
    @Override
    public void brewCoffee() {
        BrewColdBrew();
    }
}
