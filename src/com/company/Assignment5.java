package com.company;
import java.util.Scanner;


public class Assignment5 {
    public static void main(String[] args){
        float weight = 1;
        Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a package weight in pounds: ");
            weight = scanner.nextFloat();
            if (weight > 0 && weight <= 1){
                System.out.println("The shipping cost is $2.95");
            }
            else if (weight > 1 && weight <= 3){
                System.out.println("The shipping cost is $4.95");
            }
            else if (weight > 3 && weight <= 10){
                System.out.println("The shipping cost is $9.45");
            }
            else if (weight > 10 && weight <= 20){
                System.out.println("The shipping cost is $12.50");
            }
            else if (weight > 20){
                System.out.println("The package is too heavy to be shipped");
            }
            else if (weight < 0){
                System.out.println("The weight of the package must be greater than zero ");
            }

    }
}
