package com.company;

import java.lang.*;

public class Assignment8 {

    // Extract even multiples of 4
    static int[] extractEvenMultiples(int array[], int size){
        int divisible[] = new int[size];
        int nextIndex = 0;
        for (int i = 0; i < array.length; i++){
            int number = array[i];
            if ((number % 4 == 0) && ((number/4) % 2 == 0)){
                divisible[nextIndex++] = number;
            }
        }
        return divisible;
    }

    // Extract all numbers that are not even multiples of 4
    static int[] extractNonEvenMultiples(int array[], int size){
        int nonDivisible[] = new int[size];
        int nextIndex = 0;
        for (int i = 0; i < array.length; i++){
            int number = array[i];
            if ( !((number % 4 == 0) && ((number/4) % 2 == 0)) ){
                nonDivisible[nextIndex] = number;
                nextIndex++;
            }
        }
        return nonDivisible;
    }

    public static void main(String[] args){

        // Create an array of 100 random numbers between 1 and 100
        int[] numbers = new int[100];
        int evenCount = 0;
        int nonCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() * 100) + 1);
            numbers[i] = random;
            if ((random % 4 == 0) && ((random/4) % 2 == 0)){
                evenCount++;
            }
            else {
                nonCount++;
            }
        }

        System.out.println("Even Count: "+ evenCount);
        System.out.println("Non Count: " + nonCount);
        // Extract and print all numbers that are even multiples of 4
        int divisible[] = extractEvenMultiples(numbers, evenCount);
        System.out.print("Even multiples of 4: ");
        for (int i = 0; i < divisible.length; i++){
            System.out.print(divisible[i] + " ");
        }
        System.out.println("");

        // Extract and print all numbers that are not even multiples of 4
        int nonDivisible[] = extractNonEvenMultiples(numbers, nonCount);
        System.out.print("Not even multiples of 4: ");
        for (int i = 0; i < nonDivisible.length; i++){
            System.out.print(nonDivisible[i] + " ");
        }
        System.out.println("");
    }
}
