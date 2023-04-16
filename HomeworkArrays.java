package homework;

public class HomeworkArrays {
    public static void main(String[] args) {

        // Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Подсчитайте сколько в массиве чётных элементов
        // и выведете это количество на экран на отдельной строке

        int[] array = new int[15];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("This array contains " + a + " even digits.");
    }
}
