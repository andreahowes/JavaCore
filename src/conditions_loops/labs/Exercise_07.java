package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a word:");
        String word = scanner.nextLine();
        int x = 0;
        while (word.charAt(x) != 'a' && word.charAt(x) !='e' && word.charAt(x) != 'i' && word.charAt(x) !='o' && word.charAt(x) !='u') {
            x++;
            continue;
        }
        System.out.println(word);
        System.out.println(word.charAt(x));


    }
}
