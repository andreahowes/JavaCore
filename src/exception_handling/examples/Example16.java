package exception_handling.examples;

// An exception for queue-full errors.
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}


class Example16 {

    public static void main(String[] args) throws QueueFullException {
        int myArray[] = new int[10];
        for (int i=0; i<20; i++){
            if (i>=myArray.length){
                throw new QueueFullException(i);
            }
            else
                {System.out.println(i);}
        }
    }
}