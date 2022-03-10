package com.rus;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальный диапазон : ");
        int start = scanner.nextInt();
        System.out.println("Введите конечный диапазон  : ");
        int end = scanner.nextInt();
        boolean isPrime;
        if (start <= 1) {
            start = 2;
        }
        if (end > start) {
            for (int i = start; i <= end; i++) {
                isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}