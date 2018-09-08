package packages_interfaces.labs.package1;

public class Class1inPackage1 {

    static int one = 1;
    static int two = 2;

    public static void publicMethod1(){
        System.out.println(one * two);
    }

    protected static int secretNumber1(){
        int secret = 9;
        return secret;

    }
}
