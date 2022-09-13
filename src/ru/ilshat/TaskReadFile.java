package ru.ilshat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        scanner.close();
        double x = 0.0;
        double y = 0.0;

        try {
            x = Double.parseDouble(numbers[0]);
            y = Double.parseDouble(numbers[2]);

            switch (numbers[1]) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "/":
                    if (y == 0)
                        System.out.print("Error! Division by zero");
                    else System.out.println(x / y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                default:
                    System.out.println("Operation Error!");
            }
        } catch (Exception e) {
            System.out.println("Error! Not number\n");
        }

        scanner.close();
    }

}


