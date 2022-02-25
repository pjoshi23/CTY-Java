package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Assignment7_B {
    static double calculateMonthlyPayment(double loanAmount, double interestRate, int months){
        double numerator = interestRate * loanAmount;
        double power = Math.pow((1 + interestRate), -months);
        double denominator = 1 - power;
        double payment = numerator/denominator;
        return payment;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("#####.##");
        System.out.print("Please enter the loan amount: ");
        double loan = input.nextDouble();
        System.out.print("Please enter the interest rate: ");
        double interest = (((input.nextDouble())/100)/12);
        System.out.print("Please enter the number of years: ");
        int months = (input.nextInt())*12;
        Double monthlyPayment = calculateMonthlyPayment(loan, interest, months);
        String newMonthlyPayment = df.format(monthlyPayment);
        System.out.println("Your monthly payment is $" + newMonthlyPayment);
    }
}
