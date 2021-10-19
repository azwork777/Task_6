package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int height = enterHeight();
        printFigure(height);
    }

    static int enterHeight() {
        System.out.print("Введите высоту: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input <= 2) {
            System.out.println("Ошибка. Введите число больше двух");
            System.exit(1);
        }
        return input;
    }


    static void printFigure(int h) {
        System.out.println("*");
        System.out.print("|");
        System.out.println("\\");

        for (int i = 3; i < h; i++) {
            System.out.print("|");

            for (int k = 1; k <= i - 2; k++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        System.out.print("*");
        for (int i = 2; i < h; i++) {
            System.out.print("-");
        }

        System.out.print("*");
    }
}


