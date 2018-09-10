package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */


public class Exercise_02  {
    public static void main(String[] args) throws IOException {

        // declare BufferedReader and BufferedWriter
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            // initialize reader and writer inside Try statement
            // BufferedReader takes in a FileReader to read from file

            inputStream = new BufferedReader(new FileReader("/Users/andreahowes/desktop/practice/Secrets.txt"));
            outputStream = new BufferedWriter(new FileWriter("/Users/andreahowes/desktop/practice/codedMessage.txt"));

            String l;
            // If the line isn't null, the line of text is returned and written in the new file.
            while ((l = inputStream.readLine()) != null) {
                //creating an array and reading through it while changing it.
                char[] myArray = l.toCharArray();
                for (int i = 0; i<myArray.length; i++){
                    //changing every a to -
                    if (myArray[i] == 'a'){
                        myArray[i]='-';
                    }
                    //changing every t to *
                    else if (myArray[i] == 'e'){
                        myArray[i]='~';
                    }
                    else
                        {myArray[i]=myArray[i];}

                }
                //putting the array back into a string
                String myString = new String(myArray);
                System.out.println(myString);
                //writing the message to the new file
                outputStream.write(myString);
            }

        }
        finally {
            // close connections!
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}










