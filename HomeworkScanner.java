package Homework;

import java.util.Scanner;

public class HomeworkScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter please an integer number (2 value): ");
        int a = scanner.nextInt();

        int tmp1 = a / 3;
        int tmp1_ = a % 3;

        int tmp2 = tmp1 / 3;
        int tmp2_ = tmp1 % 3;

        int tmp3 = tmp2 / 3;
        int tmp3_ = tmp2 % 3;

        System.out.println(tmp3_ + "" + tmp2_ + "" + tmp1_);

        scanner.close();

    }

}
