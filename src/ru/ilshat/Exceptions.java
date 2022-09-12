package ru.ilshat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        File file = new File("t.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }

}
