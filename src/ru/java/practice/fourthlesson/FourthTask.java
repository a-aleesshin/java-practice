package ru.java.practice.fourthlesson;

// 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10 000.
//Найти максимум среди сумм трех соседних элементов.
// Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
public class FourthTask {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10000);
        }

        int max = 0;
        int indexMass = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += mass[j];
            }

            if (sum > max) {
                max = sum;
                indexMass = i;
            }
        }

        System.out.println("Значение суммы " + max + " и индекс первого элемента тройки = " + indexMass);
    }
}
