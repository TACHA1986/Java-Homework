package hm3003coffee;

import java.util.Scanner;

public class coffeIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please a number from 1 to 4: ");
        int number = sc.nextInt();
        sc.close();


        if (number == 1)
            System.out.println(" Your Espresso is ready");
        else if (number == 2)
            System.out.println("Your Americano is ready");
        else if (number == 3)
            System.out.println("Your Cappuccino is ready");
        else if (number == 4)
            System.out.println("Your  Water is ready");
        else System.out.println("Your number is wrong.");

    }
}
