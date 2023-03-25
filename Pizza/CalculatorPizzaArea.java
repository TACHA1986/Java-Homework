package Homework.Pizza;

import Homework.Converter.UserInput;

import java.util.Scanner;

public class CalculatorPizzaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please diameter of pizza: ");
        double diameterPizza = scanner.nextDouble();

        double area = Math.PI * diameterPizza * diameterPizza / 4;

        System.out.println("The area of the pizza with " + diameterPizza + " cm in diameter is " + area);
        scanner.close();
    }
}
