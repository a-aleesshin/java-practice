package ru.java.practice.firstlesson;

//4. Объявите переменную типа int,имя переменной - year.Присвойте этой переменной значение 1980.
//Используя цикл while,выведите в столбик строки вида
//“Олимпиада X года”, где X - это число, которое принимает значения,
//начиная от 1980 до 2020 с шагом увеличения равным 4.

public class FourthTask {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }
}
