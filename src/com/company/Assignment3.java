package com.company;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        double temp;
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a temperature in degrees Fahrenheit: ");

            // read temperature input
            temp = scanner.nextInt();

            // convert temperature to Kelvin
            temp = (((temp-32)/1.8) + 273);

            // print temperature
            System.out.println("Kelvin temperature = " + Double.toString(temp));
        }
    }
}
