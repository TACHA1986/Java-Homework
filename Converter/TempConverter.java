package Homework.Converter;

public class TempConverter {
    public double converterCelsiusToFahrenheit(double tempCelsius) {
        double tempFahr = tempCelsius * 1.8 + 32;
        return tempFahr;
    }
    public double converterCelsiusToKelvin(double tempCelsius) {
        double tempKelvin = tempCelsius + 273.15;
        return tempKelvin;
    }
    public double converterKelvinToCelsius(double tempKelvin) {
        double tempCelsius = tempKelvin - 273.15;
        return tempCelsius;

    }

    public double converterFahrenheitToCelsius(double tempFahr) {
        double tempCelsius = (tempFahr - 32) * 5 / 9;
        return tempCelsius;
    }
}
