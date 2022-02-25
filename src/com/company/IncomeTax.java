package com.company;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your status. 0 - Single, 1 - Married Filing Jointly or Qualifying Widow(er), 2 - Married Filing Separately, 3 - Head of House: ");
        int status = input.nextInt();
        System.out.println("Enter your taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        double income_left = 0;
        if (status == 0){
            if (income < 0){
                System.out.println("Invalid Income! ");
            }
            else if (income <= 8350){
                tax = income * 0.10;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 33950){
                tax = 8350 * 0.10 + (income-8350) * 0.15;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 82250){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (income-33950) * 0.25;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 171500){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (82250-33950) * 0.25 + (income - 82250) * 0.28;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 372950){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (82250-33950) * 0.25 + (171500 - 82250) * 0.28 + (income - 171500) * 0.33;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else {
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (82250-33950) * 0.25 + (171500 - 82250) * 0.28 + (372950 - 171500) * 0.33 + (income - 372950) * 0.35;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
        }
        else if (status == 1){
            if (income < 0){
                System.out.println("Invalid Income! ");
            }
            else if (income <= 16700){
                tax = income * 0.10;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 67900){
                tax = 16700 * 0.10 + (income-16700) * 0.15;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 137050){
                tax = 16700 * 0.10 + (67900-16700) * 0.15 + (income-67900) * 0.25;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 208850){
                tax = 16700 * 0.10 + (67900-16700) * 0.15 + (137050-67900) * 0.25 + (income - 137050) * 0.28;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 372950){
                tax = 16700 * 0.10 + (67900-16700) * 0.15 + (137050-67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else {
                tax = 16700 * 0.10 + (67900-16700) * 0.15 + (137050-67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
        }
        else if (status == 2){
            if (income < 0){
                System.out.println("Invalid Income! ");
            }
            else if (income <= 8350){
                tax = income * 0.10;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 33950){
                tax = 8350 * 0.10 + (income-8350) * 0.15;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 68525){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (income-33950) * 0.25;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 104425){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (68525-33950) * 0.25 + (income - 68525) * 0.28;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 186375){
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (68525-33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else {
                tax = 8350 * 0.10 + (33950-8350) * 0.15 + (68525-33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
        }
        else if (status == 3){
            if (income < 0){
                System.out.println("Invalid Income! ");
            }
            else if (income <= 11950){
                tax = income * 0.10;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 45500){
                tax = 11950 * 0.10 + (income-11950) * 0.15;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 117450){
                tax = 11950 * 0.10 + (45500-11950) * 0.15 + (income-45500) * 0.25;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 190200){
                tax = 11950 * 0.10 + (45500-11950) * 0.15 + (117450-45500) * 0.25 + (income - 117450) * 0.28;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else if (income <= 372950){
                tax = 11950 * 0.10 + (45500-11950) * 0.15 + (117450-45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
            else {
                tax = 11950 * 0.10 + (45500-11950) * 0.15 + (117450-45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
                income_left = income - tax;
                System.out.println("The tax is " + Double.toString(tax) + " and the leftover income is " + Double.toString(income_left) + " .");
            }
        }
        else {
            System.out.println("Invalid Status! ");
        }
    }
}
