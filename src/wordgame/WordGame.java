/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgame;

import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class WordGame {

    /**
     * @param args the command line arguments
     */
    private static Scanner keyboard = new Scanner(System.in);
    private static String theWord;
    public static void main(String[] args) {
        // TODO code application logic here
        //this is the code
        System.out.println("Enter a word");
        theWord = keyboard.nextLine();
        System.out.println("You entered " + theWord.trim());
    }
    
}
