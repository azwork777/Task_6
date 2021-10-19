package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int positionOfNumber = readPositionOfNumber ();
        int sumOfPrimeNumbers = calculateSumOfFirstPrimeNumbers (positionOfNumber);
        printResult(sumOfPrimeNumbers);
    }

    static int readPositionOfNumber () {
        System.out.print("Enter position of the number: ");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        if (position <= 0) {
            System.out.println("Position cannot be <= 0");
            System.exit(1);
        }
        return position;

    }

    static int calculateSumOfFirstPrimeNumbers (int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int primeNumber = findPrimeNumberOnNPosition (i);
            sum += primeNumber;
        }
        return sum;
    }


    static int findPrimeNumberOnNPosition(int n) {
        int numberPosition = 1;
        int positiveNumber = 1;

        while (numberPosition != n) {
            int numberDivisors = 0;

            for (int i = 1; i <= positiveNumber; i++) {
                if (positiveNumber % i == 0) {
                    numberDivisors++;
                }
                if (positiveNumber == 1) {
                    numberDivisors += 2;
                }
            }

            if (numberDivisors == 2) {
                numberPosition++;
            }
            positiveNumber++;
        }
        if (positiveNumber == 1) {
            return positiveNumber;
        } else {
            return positiveNumber - 1;
        }
    }

    static void printResult (int result) {
        System.out.println ("Sum of prime numbers = " + result);
    }
}



