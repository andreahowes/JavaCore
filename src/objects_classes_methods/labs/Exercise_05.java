package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */
class Exercise_05{
    //creating a static int x and a non-static int y

    public static void main(String[] args) {
        //this sets the static String in class StaticExercise
        StaticExercise.setStaticVar("one");
        //creates a new object in class StaticExercise
        StaticExercise object1 = new StaticExercise();
        //sets non-static variable for new object
        object1.setInstanceVar("two");
        //creates second new object in class StaticExercise
        StaticExercise object2 = new StaticExercise();
        //creates a new object in class StaticExercise
        object2.setInstanceVar("four");
        //sets non-static variable for second object
        System.out.println(object1.getInstanceVar());
        System.out.println(object2.getInstanceVar());
        System.out.println(object1.getStaticVar());
        System.out.println(object2.getStaticVar());
        System.out.println(StaticExercise.getStaticVar());
    }
}

class StaticExercise{
    //static variable
    private static String staticVar;
    //non-static variable
    private String instanceVar;
    //non-static method used for non-static variable with objects


    public static String getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(String staticVar) {
        StaticExercise.staticVar = staticVar;
    }

    public String getInstanceVar() {
        return instanceVar;
    }

    public void setInstanceVar(String instanceVar) {
        this.instanceVar = instanceVar;
    }
}