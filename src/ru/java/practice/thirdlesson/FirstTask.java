package ru.java.practice.thirdlesson;

import java.util.Scanner;

//1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
// Программа должна работать до тех пор, пока не будет введено слово “Stop”.
//        Реализовать, используя следующие данные:
//        Москва, Владивосток, Ростов - Россия
//        Рим, Милан, Турин - Италия
//
//        Ливерпуль, Манчестер, Лондон - Англия
//        Берлин, Мюнхен, Кёльн - Германия
//        При вводе любого другого города, вывести сообщение “Неизвестная страна”.
public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Напишите название города");
            String enteredWord = scanner.nextLine();

            if (enteredWord.equalsIgnoreCase("stop")) {
                break;
            }

            switch (enteredWord) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна \n");
            }
        }
    }
}
