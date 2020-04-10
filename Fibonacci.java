package com.itaccademy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value : ");
        int value = scan.nextInt();
        int value1 = 1;
        int value2 = 1;
        int fib = 0;
        System.out.println(value1);
        System.out.println(value2);

        while (fib < value) {
            fib = value1 + value2;
            value1 = value2;
            value2 = fib;
            if (value2 > value) {
                break;
            }
            System.out.println(value2);
        }
    }
}








