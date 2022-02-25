package com.company;

import java.util.Scanner;

public class Assignment9 {

    //Return the number of characters in the string
    static int countCharacters(String sentence){
        return sentence.length();
    }

    //Return the number of words in a sentence
    static int countWords(String sentence){
        int wordCount = 0;
        String array[] = new String[sentence.length()];
        for (int i = 0; i < sentence.length(); i++){
            String letter = sentence.substring(i, i+1);
            array[i] = letter;
            if (((i > 0) && (array[i] != " ") && (array[i - 1].equals(" "))) || ((array[0] != " ") && (i == 0))){
                wordCount++;
            }
        }
        return wordCount;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter 1 to count characters, and 2 to count words: ");
        int mode = input.nextInt();
        if (mode == 1){
            int numCharacters = countCharacters(sentence);
            System.out.print("There are " + numCharacters + " characters in the sentence.");
        }
        else if (mode == 2){
            int numWords = countWords(sentence);
            System.out.print("There are " + numWords + " words in the sentence.");
        }
    }
}
