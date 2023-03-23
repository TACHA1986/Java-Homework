package Homework;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Take two variables: ");
        int x = 10;
        int y = 20;
        System.out.println("x = 10, y = 20");

        int d = x;
        x = y;
        y = d;
        System.out.println("Change the value of the variables using the third variable: ");
        System.out.println("x = " + x + ", y = " + y +"");

    }

}
