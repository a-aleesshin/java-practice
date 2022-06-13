package ru.java.practice.fourthlesson;

import java.util.Arrays;
import java.util.Scanner;

//1. С клавиатуры вводится число n- размер массива.
// Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
// Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите желаемую длину массива");
        int arrayLength = scanner.nextInt();
        int[] mass = new int[arrayLength];

        int counterGreater8 = 0;
        int counterEqual1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sumElements = 0;

        for (int i = 0; i < mass.length; i++ ) {
            int numberRandom = (int) (Math.random() * 10);
            mass[i] = numberRandom;
        }

        for (int element : mass) {
            if (element > 8) {
                counterGreater8++;
            }

            if (element == 1) {
                counterEqual1++;
            }

            if (element % 2 == 0) {
                counterEven++;
            }

            if (element % 2 != 0) {
                counterOdd++;
            }

            sumElements += element;
        }

        System.out.println("Содержимое массива = " + Arrays.toString(mass));
        System.out.println("Длине массива = " + mass.length);
        System.out.println("Количестве чисел больше 8 = " + counterGreater8);
        System.out.println("Количестве чисел равных 1 = " + counterEqual1);
        System.out.println("Количестве четных чисел = " + counterEven);
        System.out.println("Количестве нечетных чисел = " + counterOdd);
        System.out.println("Сумме всех элементов массива = " + sumElements);
    }
}
