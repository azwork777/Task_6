package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год:");

        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("В году 365 дней");
            } else {
                System.out.println("В году 366 дней");
            }

        } else {
            System.out.println("В году 365 дней");
        }


    }
}
