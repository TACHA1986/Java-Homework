package Homework.Converter;

public class TempApp {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        TempConverter tempConverter = new TempConverter();

        double tempCelsius = ui.userInput("Please enter temp in Celsius");
        double tempFahr = tempConverter.converterCelsiusToFahrenheit(tempCelsius);

        System.out.println("Your temp in Fahrenheit is " + tempFahr);

        double tempKelvin = tempConverter.converterCelsiusToKelvin(tempCelsius);
        System.out.println("Your temp in Kelvin is " + tempKelvin);

        tempFahr = ui.userInput("Please enter temp in Fahrenheit");
        tempCelsius = tempConverter.converterFahrenheitToCelsius(tempFahr);

        System.out.println("Your temp in Celsius is " + tempCelsius);

        tempKelvin = ui.userInput("Please enter temp in Kelvin");
        tempCelsius = tempConverter.converterKelvinToCelsius(tempKelvin);

        System.out.println("Your temp in Celsius is " + tempCelsius);






    }
}
