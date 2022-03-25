package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n ");
        int n = scanner.nextInt();
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        double result=0;
        for (int j = 1; j <= n; j++) {
            int factN = 1;
            for (int i = 1; i <= j; i++) {
                factN *= i;

            }
            double summa = (Math.pow((-1), n) * Math.pow(x, n) / factN);
            result = result + summa;

        }

            System.out.println(result);

        }

    }
