package com.hillel.qa.java.branching.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, яка буде рахувати можливість існування трикутника,
     * виходячи з довжин його сторін.
     * Вимоги:
     *     <ol style="font-size:12px">
     *         <li>Ввести з клавіатури три числа — довжини сторін передбачуваного трикутника.
     *         Для того щоб це зробити самостійно гляньте як працює Scanner scanner = new Scanner(System.in);</li>
     *         <li>Визначити можливість існування трикутника з даними сторонами.</li>
     *         <li> Результат вивести на екран : "Трикутник можливо побудувати" або "Трикутник не можливо побудувати".</li>
     *     </ol>
     * </p>
     *
     * @see <a href="https://www.w3schools.com/java/java_user_input.asp">Стаття як користуватися Scanner</a>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину первой стороны: ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину второй стороны: ");
        double b = scanner.nextDouble();
        System.out.print("Введите длину третьей стороны: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник можно построить.");
        } else {
            System.out.println("Треугольник нельзя построить.");
        }

    }
}
