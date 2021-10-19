package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double N = enterNumbers("ordinal number");
        double X = enterNumbers("value of x");
        double E = enterNumbers("value of e");
        double E1 = E / 10;

        double sumOfFirstNNumbers = calculateSumOfFirstNNumbers((int) N, X);
        double sumOfBiggerThenENumbers = calculateSumOfBiggerThenENumbers((int) N, X, E);
        double sumOfBiggerThenEDividedByTenNumbers = calculateSumOfBiggerThenENumbers((int) N, X, E1);

        printResultOfCalculating(sumOfFirstNNumbers, sumOfBiggerThenENumbers, sumOfBiggerThenEDividedByTenNumbers);
    }

    static double enterNumbers(String name) {
        System.out.printf("Enter %s: ", name);
        Scanner sc = new Scanner(System.in);
        double enterData = sc.nextDouble();

        if (name == "ordinal number" && enterData <= 0) {
            System.out.println("Error. Ordinal number cannot be smaller or equal to 0");
            System.exit(1);
        }

        if (name == "value of x" && (enterData >= 1 || enterData <= -1)) {
            System.out.println("Error. Values of x lie in the range (-1; 1)");
            System.exit(1);
        }
        return enterData;
    }


    static double calculateSumOfFirstNNumbers(int n, double x) {
        double sum;
        double Number = (n * Math.pow(-x, n - 1));

        if (n == 1) {
            return Number;
        }

        sum = Number + calculateSumOfFirstNNumbers(n - 1, x);
        return sum;
    }

    static double calculateSumOfBiggerThenENumbers(int n, double x, double e) {
        double sum1 = 0;
        double Number = (n * Math.pow(-x, n - 1));

        if (Math.abs(Number) > e) {
            sum1 += Number;
        }

        if (n == 1) {
            return sum1;
        }

        sum1 = sum1 + calculateSumOfBiggerThenENumbers(n - 1, x, e);
        return sum1;
    }

    static void printResultOfCalculating(double a, double b, double c) {
        System.out.println("the sum of the first n-terms is " + a);
        System.out.println("the sum of the first n-terms greater than e modulo is equal to " + b);
        System.out.println("the sum of the first n-terms greater than e/10 modulo is equal to " + c);
    }
}


