package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year = inputYear();

        boolean check = isItTheLeapYear(year);

        output(check);

    }

    static int inputYear() {


        System.out.println("Введите год:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input <= 0) {
            System.out.println("Ошибка. Введите число больше нуля");
            System.exit(1);
        }

        return input;
    }


    static boolean isItTheLeapYear(int year) {


        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {

                return false;
            } else {

                return true;
            }

        } else {

            return false;
        }
    }

    static void output(boolean check) {
        if (check == true) {
            System.out.println("В году 366 дней");

        } else {
            System.out.println("В году 365 дней");
        }
    }
}

