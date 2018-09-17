package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

//class with psvm in it to create the actual objects
class Controller3 {
    public static void main(String[] args) {
        Exercise_03 runnable1 = new Exercise_03();
        Thread thread1 = new Thread(runnable1);
        thread1.setPriority(10);
        thread1.start();
    }
}

//public class that implements runnable
public class Exercise_03 implements Runnable {

    //@override - the void run() method is called directly after the start() method
    @Override
    public void run(){
        //printing the starting thread
        System.out.println("Thread " + Thread.currentThread().getName() + " is starting!");
        //have a try method in the public void run() with some thread actions
        try{
            for(int x=0; x<5; x++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() +
                        ", count is " + x);
            }
        }
        //catching an interruption exception
        catch(InterruptedException ie){
            System.out.println(Thread.currentThread().getName() + " has been interrupted!");
        }
        //then sout "terminating thread"
        System.out.println(Thread.currentThread().getName() + " has been terminated!");
    }

}
