package ru.java.practice.firstlesson;

/*
    1. Вывести на экран слово “JAVA”, строку, чтобы оно повторилось 10 раз, используя цикл ​while.​
    Вывод в консоль должен быть таким:
    JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class FirstTask {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.print("JAVA ");
            count++;
        }

    }
}
