package com.itaccademy;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value:");
        int value = scan.nextInt();

        System.out.println("Sum:" + isSum(value));
    }

    public static int isSum(int value) {
        int result = 0;
        value = Math.abs(value);
        while (value != 0) {
            int ostatok = value % 10;
            value = value / 10;
            result += ostatok;
        }
        return result;

    }

}



