package ru.java.practice.secondlesson;

import java.util.Scanner;

//1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,число,
// соответствующее количеству этажей в здании. Используя условный оператор if,необходимо
// вывести в консоль сообщение о типе такого дома.
//Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”,
// 9 и более - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
// отрицательное значение, в таком случае сообщить “Ошибка ввода”.
public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число этажей");
        int numberFloors = scanner.nextInt();
        if (0 < numberFloors && numberFloors <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (5 <= numberFloors && numberFloors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (9 <= numberFloors) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
