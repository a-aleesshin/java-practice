package ru.java.practice.secondlesson;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        double x = scanner.nextDouble();
        double y;

       if (x >= 5) {
           y = (Math.pow(x, 2) - 10) / (x + 7);
       } else if (x > -3 && x < 5) {
           y = (x + 3) * (Math.pow(x, 2) - 2);
       } else {
          y = 420;
       }

        System.out.println("y = " + y);
    }
}
