package hm3003coffee;

import java.util.Scanner;

public class coffeeSwitch {
    // Представьте, что вы находитесь перед кофейным аппаратом, у него 4 кнопки, которые соответствуют напиткам:
    // эспрессо,американо, капучино, обычная вода.
    //Напишите алгоритм, который будет предлагать клиенту выбрать напиток, нажатие кнопки
    // (или считывания цифры, например) и в консоль будет отображаться результат приготовления
    // (например, "Ваш <напиток> готов").
    //Сделайте 2 метода, в одном из них будет реализован формат if-else, в другом - switch

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please a number from 1 to 4: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println(getYourDrink(number));
    }


    public static String getYourDrink(int number) {
        return switch (number) {
            case 1 -> "Your espresso is ready.";
            case 2 -> "Your americano is ready.";
            case 3 -> "Your cappuccino is ready.";
            case 4 -> "Your water is ready";
            default -> "Your number is wrong";
        };
    }

    public static void ifYourDrink(int DrinkNumber) {
        if (DrinkNumber == 1)
            System.out.println(" Your Espresso is ready");
        else if (DrinkNumber == 2)
            System.out.println("Your Americano is ready");
        else if (DrinkNumber == 3)
            System.out.println("Your Cappuccino is ready");
        else if (DrinkNumber == 4)
            System.out.println("Your  Water is ready");
        else System.out.println("Your number is wrong.");
    };
}








