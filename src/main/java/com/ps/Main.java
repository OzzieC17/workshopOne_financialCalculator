package com.ps;

import java.util.Scanner;

public class Main {

    public static final int MONTHS_IN_YEAR = 12; //
    // this is your constant it does not change throughout the code
    // also serves as a reminder rather than just using the number 12(represents months in a year)

    public static void main(String[] args) {
        Scanner scanner   = new Scanner(System.in);

        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future Value Calculator");

        int givenCommand = scanner.nextInt();

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate of the loan:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years:");
        int termInYears = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_YEAR;

        double monthlyPayment = principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / ((Math.pow(1 + monthlyInterestRate, numberOfPayments))-1);

        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Total interest amount: " + ((monthlyPayment * numberOfPayments) - principal));





    }
}

