package com.finepointmobile;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(factorial(number));

    }

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            int newNumber = factorial(number - 1);
            return newNumber * number;
        }
    }
}
