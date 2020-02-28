package com.education_wired_.work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Scanner sc  = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("enter int number - ");
                System.out.println("Result 1 = " + runner.divisionINT(10,
                        sc.nextInt()));
                break;
            } catch (ArithmeticException exp) {
                System.out.println("Invalid result." + exp.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("enter float number - ");
                System.out.println("Result 2 = " + runner.divisionDouble(10.0,
                        sc.nextDouble()));
                break;
            } catch (ArithmeticException exp) {
                System.out.println("Invalid result." + exp.getMessage());
            }
        }
    }
}
