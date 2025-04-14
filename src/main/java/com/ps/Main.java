package com.ps;

import java.util.Scanner;

public class Main {

    public static final int MONTHS_IN_YEAR = 12; //
    // this is your constant it does not change throughout the code
    // also serves as a reminder rather than just using the number 12(represents months in a year)
    public static final int DAYS_IN_YEAR = 365;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Future Value Calculator");

        int givenCommand = scanner.nextInt();

        switch (givenCommand) {
            case 1:
                calculateMortgage(scanner);
                break;
            case 2:
                calculateFutureValue(scanner);
                break;
        }
    }
    public static void calculateMortgage(Scanner scanner) {

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate of the loan:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years:");
        int termInYears = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_YEAR;

        double monthlyPayment = principal * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1);

        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("Total interest amount: " + ((monthlyPayment * numberOfPayments) - principal));
    }
    public static void calculateFutureValue(Scanner scanner) {
        System.out.println("Enter the deposit amount:");
        double deposit = scanner.nextDouble();

        System.out.println("Enter the interest rate:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the number of years");
        int numberOfYears = scanner.nextInt();



        double futureValue = deposit * Math.pow(1 + annualInterestRate / DAYS_IN_YEAR, DAYS_IN_YEAR * numberOfYears);
        double interestTotal = futureValue - deposit;

        System.out.printf("Your future value will be: $%.3f%n", futureValue);
        System.out.printf("Your total interest will be: $%.3f%n", interestTotal);














    }
}

