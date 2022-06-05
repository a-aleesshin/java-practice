package ru.java.practice.firstlesson;

// 5. Повторить задание 4, но используя цикл for.
public class FifthTask {
    public static void main(String[] args) {
        for (int year = 1980; year <= 2024; year+=4) {
            System.out.println("Олимпиада " + year + " года");
        }
    }
}
