package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int centuries = Integer.parseInt(in.nextLine());
        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = 24 * days;
        int minutes = 60 * hours;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);

    }
}
