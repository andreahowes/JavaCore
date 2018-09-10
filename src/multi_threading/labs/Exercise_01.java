package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */

//class with psvm in it to create the actual objects
class Controller {
    public static void main(String[] args) {
        //creating the objects
        Exercise_01 threadOne = new Exercise_01("threadOne");
        Exercise_01 threadTwo = new Exercise_01("threadTwo");
    }
}

//public class that implements runnable
public class Exercise_01 implements Runnable {

    //creating our thread in Thread
    Thread myThread;

    //constructor that creates thread and has start() in it
    public Exercise_01(String threadName){
        myThread = new Thread(this, threadName);
        //start myThread
        myThread.start();
    }

    //@override - the void run() method is called directly after the start() method
    public void run(){
        //printing the starting thread
        System.out.println("Thread " + myThread.getName() + " is starting!");
        //have a try method in the public void run() with some thread actions
        try{
            for(int x=0; x<5; x++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + myThread.getName() +
                        ", count is " + x);
            }
        }
        //catching an interruption exception
        catch(InterruptedException ie){
            System.out.println(myThread.getName() + " has been interrupted!");
        }
        //then sout "terminating thread"
        System.out.println(myThread.getName() + "has been terminated!");
    }

}




//
