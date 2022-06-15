package ru.java.practice.fifthlesson;

/**
 * Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Геттером получить год выпуска, цвет, модель, вывести значения в консоль.
 */
public class SecondTask {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2022, "green", "Yamaha");

        System.out.println("Модель: " + motorbike.getModel() + ", Цвет: " + motorbike.getColor() + ", Год выпуска: " + motorbike.getYear());
    }
}
