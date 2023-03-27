package Homework;

import java.util.Scanner;

public class DegreesHomework {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the temperature of the first flask in degrees: ");
        int temperature1 = scanner.nextInt();

        System.out.print("Please enter the temperature of the second flask in degrees: ");
        int temperature2 = scanner.nextInt();

        scanner.close();

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("The device will work correctly.");
        }
            else{
            System.out.println("The device will not work correctly");
        }
        }
}
