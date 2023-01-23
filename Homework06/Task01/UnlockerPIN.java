package Homework06.Task01;

import java.util.Scanner;

public class UnlockerPIN extends Unlocker {

    public static void UnlockerPIN() {
        System.out.println("Введите PIN");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number == 1234)
                System.out.println("Телефон разблокирован");
            else
                System.out.println("PIN не верный");
        }
    }
}
