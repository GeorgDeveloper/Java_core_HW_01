package ru.gdeveloper.testprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Animals> arr = new ArrayList<>();
    public static void run() {
        System.out.println("Меню программы");
        System.out.println("1. Ввести данные питомца\n" +
                "2. Показать данные питомца\n" +
                "3. Выход\n");

        int userIn = scanner.nextInt();

        switch (userIn) {
            case (1):
                System.out.println("введите имя питомца: ");
                String name = scanner.next();

                System.out.println("введите породу питомца: ");
                String dreed = scanner.next();

                System.out.println("введите возраст питомца: ");
                int age = scanner.nextInt();

                Animals animals = new Animals(name, dreed, age);
                arr.add(animals);
                run();
                break;

            case (2):
                for (Animals animal : arr) {
                    System.out.println(animal.toString());
                }
                run();
                break;

            case (3):
                System.exit(0);
        }
    }
}
