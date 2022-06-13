package ru.java.practice.thirdlesson;

import java.util.Scanner;

//2. Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
// Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа останавливает
// свою работу тогда, когда пользователь вводит 0 в качестве делителя.
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0)
                break;

            System.out.println(a + " / " + b + " = " + a / b);
        }
    }
}
