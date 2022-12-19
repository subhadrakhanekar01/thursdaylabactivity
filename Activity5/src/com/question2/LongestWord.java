package com.question2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {

     public static void main(String [ ] args) throws FileNotFoundException {
              new LongestWord().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("C:\\Activity\\longword.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}