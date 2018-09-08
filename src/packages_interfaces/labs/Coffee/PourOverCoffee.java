package packages_interfaces.labs.Coffee;

//the PourOVerCoffee class implements the Coffee interface
public class PourOverCoffee implements Coffee{

    //below are the four classes enforced by the Coffee interface
    public int priceOfCoffee(){
        int price = 4;
        return price;
    }
    public String nameOfCoffee(){
        String name = "Seattle'sBest";
        return name;
    }
    public void grindCoffee(){
        //method for grinding coffee
        System.out.println("grinding coffee");
    }
    public void brewCoffee(){
        //method for brewing coffee
        System.out.println("brewing coffee");
    }
}
