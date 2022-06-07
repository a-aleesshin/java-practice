package ru.java.practice.secondlesson;

import java.util.Scanner;

// Реализовать программу No2, используя цикл while.
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println("Некорректный ввод");
        } else {
            while ((firstNumber + 1) < secondNumber) {
                if (firstNumber % 5 == 0 && firstNumber % 10 != 0) {
                    System.out.print(firstNumber + " ");
                }
                firstNumber++;
            }
        }
    }
}
