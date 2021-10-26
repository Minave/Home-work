package Homework3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        taskOne();
        taskTwo();
    }

    public static void taskOne() {
        String[] arr = {"a4544", "dddd", "rfgdfg5", "1jkj", "188888"};
        //Integer[] arr = {529, 885, 451, -11, 5, 9595};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static void taskTwo() {
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println("Вес коробки с яблоками " + boxWithApple.getWeight());
        System.out.println("Вес коробки с апельсинами " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}