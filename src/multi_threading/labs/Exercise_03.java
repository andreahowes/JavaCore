package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

//class with psvm in it to create the actual objects
class Controller3 {
    public static void main(String[] args) {
        //creating objects
        Exercise_03 threadOne = new Exercise_03("High Priority Thread");
        Exercise_03 threadTwo = new Exercise_03("Low Priority Thread");

        // set the priorities
        threadOne.myThread.setPriority(Thread.NORM_PRIORITY+2);
        threadTwo.myThread.setPriority(Thread.NORM_PRIORITY-2);

        // start the threads
        threadOne.myThread.start();
        threadTwo.myThread.start();

        try {
            threadOne.myThread.join();
            threadTwo.myThread.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

//public class that implements runnable
public class Exercise_03 implements Runnable {

    //creating our thread in Thread
    Thread myThread;

    //constructor that creates thread and has start() in it
    public Exercise_03(String threadName){
        myThread = new Thread(this, threadName);
        //start myThread
       // myThread.start();
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
        System.out.println(myThread.getName() + " has been terminated!");
    }

}
