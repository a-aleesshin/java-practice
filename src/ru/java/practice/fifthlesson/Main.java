package ru.java.practice.fifthlesson;

//1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль, задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
// Созданный вами класс должен отвечать принципам инкапсуляции.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("Bmw");
        car.setYearProduction(2022);

        System.out.println("Color: " + car.getColor() + ", Model: " + car.getModel() + ", Release date: " + car.getYearProduction());
    }
}
