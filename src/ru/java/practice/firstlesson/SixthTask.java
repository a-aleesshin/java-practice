package ru.java.practice.firstlesson;

// 6. Объявите переменную типа int,имя переменной - k.
// Присвойте этой переменной какую-нибудь цифру от 1 до 9.
// Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры в следующем формате: 1xk=...
//Пример:
//        k=3
//        Вывод в консоль:
//        1x3=3 2x3=6 3x3=9 ......
//        9 x 3 = 27
public class SixthTask {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println( i + " * " + k + " = " + k * i);
        }
    }
}
