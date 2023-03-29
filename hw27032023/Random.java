package hw27032023;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        int rdm = (int) (Math.random() * 900 + 100);
        System.out.println(rdm);

        int a = rdm / 100;
        int b = rdm / 10 % 10;
        int c = rdm % 10;

        if (a > b && a > c) {
            System.out.println("The largest digit in a number " + rdm + " is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest digit in a number " + rdm + " is " + b);
        } else {
            System.out.println("The largest digit in a number " + rdm + " is " + c);
        }
    }
}












