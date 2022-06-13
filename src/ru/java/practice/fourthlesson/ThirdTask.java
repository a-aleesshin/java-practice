package ru.java.practice.fourthlesson;

import java.util.Arrays;

//3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12,n=8 (m- размерность по строкам, n- размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
public class ThirdTask {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) ((Math.random() * 50));
                sum += matrix[i][j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }
        }


        System.out.println("Индекс строки, сумма чисел в которой максимальна = " + index);
    }
}
