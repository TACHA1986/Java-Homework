package Homework.BoxNewConstructor;

import Homework.BoxConstructor.Box;

public class NewBox {
    int lenght;
    int width;
    int height;

    public NewBox(int lenght, int width, int height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;

        print();
        System.out.println("Volume=" + lenght * width * height);
    }

    public NewBox(int lenght, int width) {
        this(lenght);

        this.lenght = lenght;
        this.width = width;
        height = 1;

        print();
        System.out.println("Volume=" + lenght * width * height);
    }

    public NewBox(int lenght) {
        this();

        this.lenght = lenght;
        width = 2;
        height = 3;

        print();
        System.out.println("Volume=" + lenght * width * height);
    }

    public NewBox() {
        lenght = 3;
        width = 3;
        height = 3;

        print();
        System.out.println("Volume=" + lenght * width * height);

    }

    public void print() {
        System.out.println("lenght=" + lenght +", width=" + width +", height=" + height);
    }
}