package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        int i = scanner.nextInt();
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println("i1 = " + i1);
        }
    }
}
