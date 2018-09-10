package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

//class with psvm to create objects
class Controller2{
    public static void main(String[] args) {
        //creating the objects
        Exercise_02 firstThread = new Exercise_02("firstThread");
        Exercise_02 secondThread = new Exercise_02("secondThread");
    }
}

//class that extends Thread class
public class Exercise_02 extends Thread{
    //constructor for the class and use start()
    Exercise_02(String name){
        super(name);
        start();
    }
    //void run() which will be called automatically after the start()
    public void run(){
        //try with action inside it inside the run()
        System.out.println("This thread is starting: " + getName());
        try{
            for(int x=0; x < 4; x++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + x);
            }
        }
        //catch statement for InterruptedException
        catch(InterruptedException ie){
            System.out.println("The thread was interrupted!");
        }
        //print terminated statement
        System.out.println("The thread has been terminated");
    }



}

