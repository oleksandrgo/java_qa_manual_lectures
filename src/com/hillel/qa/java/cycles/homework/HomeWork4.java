package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Намалюйте в консолі прямокутний трикутник із зірочок
     * (або плюсиків, або будь-якого другого символу):
     * на першому рядку - одна зірочка, на другій дві, і так далі.
     * </p>
     * <br>
     * <h2>Вимоги</h2>
     * <ol style="font-size:12px">
     *     <li>Висоту та символ трикутника отримати з клавіатури</li>
     *     <li>Висота трикутника дорівнює висоті яку ми отримали з клавіатури</li>
     *     <li>Трикутник малювати символом який отримали з клавіатури</li>
     *     <li>Використовувати цикл for</li>
     * </ol>
     * <br>
     * <h2>Приклад</h2>
     * <p style="font-size:12px">
     *     Наприклад ввели з клавіатури число 4 та символ "+"
     *     <br>
     *     Вивід:
     *      <br>
     *     +
     *     <br>
     *     ++
     *      <br>
     *     +++
     *     <br>
     *     ++++
     * </p>
     */
    public static void main(String[] args) {

        Scanner triangle  = new Scanner(System.in);

        System.out.print("Введіть висоту трикутника: ");
        int height = triangle.nextInt();

        System.out.print("Введіть символ для відображення трикутника: ");
        char symbol = triangle.next().charAt(0);

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(symbol + "");
            }
            System.out.println();
        }

    }
}

