package com.company;

import java.util.Scanner;

public class Project1 {

    //Encode the message
    static String encodeMessage(String message, String list1, String list2){
        String encodedMessage = "";
        for (int i = 0; i < message.length(); i++){
            String letter = message.substring(i, i + 1);

            //Check if the letter is uppercase
            if (list1.contains(letter)){
                int index = list1.indexOf(letter);
                char newLetter = list1.charAt(list1.length() - index - 1);
                encodedMessage = encodedMessage + newLetter;
            }

            //Check if the letter is lowercase
            else if (list2.contains(letter)){
                int index = list2.indexOf(letter);
                char newLetter = list2.charAt(list2.length() - index - 1);
                encodedMessage = encodedMessage + newLetter;
            }

            // If the letter is not in the alphabet, just add it as is
            else {
                encodedMessage = encodedMessage + letter;
            }
        }
        return encodedMessage;

    }

    //Decode the Message
    static String decodeMessage(String message, String list1, String list2){
        String decodedMessage = "";
        for (int i = 0; i < message.length(); i++){
            String letter = message.substring(i, i + 1);

            //Check if the letter is uppercase
            if (list1.contains(letter)){
                int index = list1.indexOf(letter);
                char newLetter = list1.charAt((list1.length() - index) - 1);
                decodedMessage = decodedMessage + newLetter;
            }

            //Check if the letter is lowercase
            else if (list2.contains(letter)){
                int index = list2.indexOf(letter);
                char newLetter = list2.charAt((list2.length() - index) - 1);
                decodedMessage = decodedMessage + newLetter;
            }

            //If the letter is not in the alphabet, just add it as is
            else {
                decodedMessage = decodedMessage + letter;
            }
        }
        return decodedMessage;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your message: ");
        String message = input.nextLine();
        System.out.print("Enter 1 to encode your message, or 2 to decode your message: ");
        int mode = input.nextInt();


        String codeArrayUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String codeArrayLower = "abcdefghijklmnopqrstuvwxyz";

        if (mode == 1){
            String encodedMessage = encodeMessage(message, codeArrayUpper, codeArrayLower);
            System.out.print("Your encoded message is: " + encodedMessage);
        }

        else if (mode == 2){
            String decodedMessage = decodeMessage(message, codeArrayUpper, codeArrayLower);
            System.out.print("Your decoded message is " + decodedMessage);
        }

    }
}
