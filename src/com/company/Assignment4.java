package com.company;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        float average = 0;
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a value for the first test score: ");
            test1 = input.nextInt();
            System.out.print("Enter a value for the first test score: ");
            test2 = input.nextInt();
            System.out.print("Enter a value for the first test score: ");
            test3 = input.nextInt();
            average = (test1 + test2 + test3)/3;
            if (average >= 97.5 && average <= 100){
                System.out.println("Average is " + Float.toString(average) + " Grade is A+");
            }
            else if (average >= 93.5 && average <= 97.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is A");
            }
            else if (average >= 89.5 && average <= 93.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is A-");
            }
            else if (average >= 86.5 && average <= 89.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is B+");
            }
            else if (average >= 82.5 && average <= 86.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is B");
            }
            else if (average >= 79.5 && average <= 82.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is B-");
            }
            else if (average >= 69.5 && average <= 79.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is C");
            }
            else if (average <= 69.49){
                System.out.println("Average is " + Float.toString(average) + " Grade is F");
            }
    }
}
