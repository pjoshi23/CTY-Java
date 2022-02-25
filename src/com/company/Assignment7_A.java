package com.company;
import java.util.Scanner;

public class Assignment7_A {
    // Convert Earth weight to Moon Weight
    static void EarthToMoon(double earthWeight){
        double moonWeight = (earthWeight / 9.81) * 1.622;
        System.out.println("The weight of the object on the moon is " + moonWeight);
    }
    // Convert Earth weight to Mar Weight
    static void EarthToMars(double earthWeight){
        double marsWeight = (earthWeight / 9.81) * 3.711;
        System.out.println("The weight of the object on Mars is " + marsWeight);
    }
    // Convert Mars weight to Earth Weight
    static void MarstoEarth(double marsWeight){
        double earthWeight = (marsWeight / 3.711) * 9.81;
        System.out.println("The weight of the object on Earth is " + earthWeight);
    }
    // Convert Moon weight to Earth Weight
    static void MoonToEarth(double moonWeight){
        double earthWeight = (moonWeight / 1.622) * 9.81;
        System.out.println("The weight of the object on Earth is " + earthWeight);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the weight of an object on earth: ");
        double earthWeight = input.nextDouble();
        EarthToMoon(earthWeight);
        EarthToMars(earthWeight);
        System.out.println(" ");
        System.out.print("Please enter the weight of an object on Mars: ");
        double marsWeight = input.nextDouble();
        MarstoEarth(marsWeight);
        System.out.println(" ");
        System.out.print("Please enter the weight of an object on the Moon: ");
        double moonWeight = input.nextDouble();
        MoonToEarth(moonWeight);

    }
}
