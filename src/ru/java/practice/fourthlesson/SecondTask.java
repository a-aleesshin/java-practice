package ru.java.practice.fourthlesson;

//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10 000.
//Затем, используя циклы for eachвывести:
//- наибольший элемент массива
//- наименьший элемент массива
//- количество элементов массива, оканчивающихся на 0
//- сумму элементов массива, оканчивающихся на 0
//Использовать сортировку запрещено.

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10000);
        }

        int max = mass[0];
        int min = mass[0];
        int counterEnding0 = 0;
        int sumCounterEnding0 = 0;

        for (int element : mass) {
            if (max < element) {
                max = element;
            }

            if (min > element){
                min = element;
            }

            if (element % 10 == 0) {
                counterEnding0++;
                sumCounterEnding0 += element;
            }
        }

        System.out.println("Содержимое массива = " + Arrays.toString(mass));
        System.out.println("Наибольший элемент массива = " + max);
        System.out.println("Наименьший элемент массива = " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + counterEnding0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0 = " + sumCounterEnding0);

    }
}
