package homework.Elevator290323;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter please the number of floors in the building ");
        int h = sc.nextInt();

        System.out.print("Please enter the number of floors the elevator goes up: ");
        int floorsUp = sc.nextInt();

        System.out.print("Please enter the number of floors the elevator goes down: ");
        int floorsDown = sc.nextInt();

        sc.close();
        int times;
        if (floorsUp <= floorsDown) {
            System.out.println("The elevator will never reach the top floor");
        } else {
            times = h / (floorsUp - floorsDown);
            System.out.println("The elevator will reach the top floor for " + times + " times.");

        }
    }


}

