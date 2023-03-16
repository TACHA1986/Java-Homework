package Homework.BoxConstructor;

public class Box {
    int lenght;
    int width;
    int height;

    public Box(int a, int b, int h) {
        lenght = a;
        width = b;
        height = h;

        System.out.println("a=" + lenght);
        System.out.println("b=" + width);
        System.out.println("h=" + height);
        System.out.println("V1=" + lenght * width * height);
    }
    public Box(int a, int b) {
        lenght = a;
        width = b;
        height = 13;

        System.out.println("a=" + lenght);
        System.out.println("b=" + width);
        System.out.println("h=" + height);
        System.out.println("V2="+lenght * width * height);
        }

    public Box(int a) {
        lenght = a;
        width = 22;
        height = 23;

        System.out.println("a=" + lenght);
        System.out.println("b=" + width);
        System.out.println("h=" + height);
        System.out.println("V3="+ lenght * width * height);
    }

    public Box() {
        lenght = 31;
        width = 32;
        height = 33;

        System.out.println("a=" + lenght);
        System.out.println("b=" + width);
        System.out.println("h=" + height);
        System.out.println("V4="+ lenght * width * height);

    }

    {


    }



}



