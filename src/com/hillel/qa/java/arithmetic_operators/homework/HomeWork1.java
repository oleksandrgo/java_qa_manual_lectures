package com.hillel.qa.java.arithmetic_operators.homework;

import java.time.Year;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Написати програму, яка виводить на екран рік народження мого друга.
     * </p>
     *<br>
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>Створіть змінну currentYear, яка буде містити поточний рік.</li>
     *     <li>Створіть змінну friendYear, яка буде містити рік друга.</li>
     *     <li>Вивестит в консоль "Моєму другу (число) років".</li>
     * </ul>
     */
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        int friendYear = 1991;
        System.out.println("Моєму другу " + (currentYear - friendYear) + " років");

    }
}
