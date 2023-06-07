package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
        int totalSum = 0;

        for (int rightNum = 1; rightNum <= 100; rightNum++) {
            if (rightNum % 3 == 0) {
                //System.out.println(rightNum);
                continue;
            }

            totalSum += rightNum;
        }

        System.out.println("Сумма чисел от 1 до 100 (не кратных 3): " + totalSum);
    }
}

