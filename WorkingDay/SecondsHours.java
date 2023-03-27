package Homework.WorkingDay;

import java.util.Random;

public class SecondsHours {
    public static void main(String[] args) {
        SecondsHours secondsHours = new SecondsHours();
        Random random = new Random();
        int amountOfSeconds = random.nextInt(0, 28800);
        System.out.println( amountOfSeconds + " seconds left till the end of the working day.");

        int hours = (int) (secondsHours.converterToHours(amountOfSeconds));
        System.out.println( hours + " full hours left till the end of the day.");
    }

    public double converterToHours(int amountOfSeconds){
        int hours = amountOfSeconds / 3600;
        return hours;
    }
}
