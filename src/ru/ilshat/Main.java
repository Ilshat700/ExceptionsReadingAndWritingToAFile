package ru.ilshat;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        scanner.close();
        double x = 0.0;
        double y = 0.0;

        try {
            x = Double.parseDouble(str[0]);
            y = Double.parseDouble(str[2]);

            switch (str[1]) {
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
        }catch (Exception e){
            System.out.println("Error! Not number\n");
        }
    }
}
