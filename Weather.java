package com.itaccademy;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input numbers of days:");
        int days = scan.nextInt();
        int maxRain = 0;


        for (int i = 0; i < days; i++) {
            System.out.println("Input reinfall per day");
            int rain = scan.nextInt();


        }
        /* if ( maxRain < rain){
        maxRain = rain}
        sout (" Max:" + maxRain)
        */

        System.out.println("Количество дней:" + days);

    }
}






