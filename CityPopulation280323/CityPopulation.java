package homework.CityPopulation280323;

import java.util.Scanner;

public class CityPopulation {
    public static void main(String[] args) {
        // Разработайте алгоритм, который будет получать значение населения того или иного города,
        // а так же идентификатора страны и определять насколько большой город в зависимости от страны.

        // Например, для Германии город с населением до 100к человек маленький, до 400к человек средний,
        // больше 1кк человек - большой.
        // Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a population: ");
        int population = scanner.nextInt();

        System.out.print("Enter a country identifier: ");
        String countryId = scanner.next();  // FR, DE

        if (countryId.equals("DE")) {
            if (population > 0 && population < 100_000)
                System.out.println("This city is a small town in Germany");
            else if (population >= 100_000 && population < 400_000)
                System.out.println("This city is a middle town in Germany");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("This city in Germany is with undefined parameter");
            else if (population >= 1_000_000)
                System.out.println("This city is a big town in Germany");
            else
                System.out.println("Wrong information about population");

        } else if (countryId.equals("FR")) {
            // Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.
            if (population > 0 && population < 200_000)
                System.out.println("This city is a small town in France");
            else if (population >= 200_000 && population < 500_000)
                System.out.println("This city is a middle town in France");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("This city in France is with undefined parameter");
            else if (population >= 1_500_000)
                System.out.println("This city is a big town in France");
            else
                System.out.println("Wrong information about population");
        } else {
            System.out.println("Wrong country id");
        }


        scanner.close();

    }
}
