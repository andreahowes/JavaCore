package input_output.labs;


import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */
//I created file1.txt on my desktop.

    public class Exercise_01  {
        public static void main(String[] args) throws IOException {

            // declare BufferedReader and PrintWriter
            BufferedInputStream inputStream = null;
            BufferedOutputStream outputStream = null;

            try {
                // initialize FileInputStream and FileOutputStream inside Try statement

                inputStream = new BufferedInputStream(new FileInputStream("/Users/andreahowes/desktop/practice/file1.txt"));
                outputStream = new BufferedOutputStream(new FileOutputStream("/Users/andreahowes/desktop/practice/file1_copy.txt"));

                byte x;
                // while there are more lines to read in the inputStream
                // Invoking readLine returns a line of text with the line.
                while ((x = (byte) inputStream.read()) != -1) {
                    // write entire line to output stream
                    outputStream.write(x);
                }
            } finally {
                // close connections
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }

























