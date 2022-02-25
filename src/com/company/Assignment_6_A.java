package com.company;
import java.util.Scanner;

public class Assignment_6_A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the sum of the numbers in a range that are divisible by 3.");
        System.out.print("Enter an upper bound for this range: ");
        int upper = input.nextInt();
        int divisible = 0;
        int div_count = 0;
        int non_divisible = 0;
        int non_count = 0;
        System.out.println(" ");
        for (int num = 1; num <= upper; num++){
            if ((num % 3) == 0){
                divisible += num;
                div_count++;
            }
            else {
                non_divisible += num;
                non_count++;
            }
        }
        System.out.println(div_count + " numbers in the range 1 - " + upper + " are divisible by 3 & their sum is " + divisible);
        System.out.println(non_count + " numbers in the range 1 - " + upper + " are divisible by 3 & their sum is " + non_divisible);
    }
}
