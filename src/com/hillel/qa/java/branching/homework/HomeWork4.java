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

        Scanner aSide = new Scanner(System.in);
        System.out.println("Сторона трикутника А: ");
        float a = aSide.nextFloat();

        Scanner bSide = new Scanner(System.in);
        System.out.println("Сторона трикутника В: ");
        float b = bSide.nextFloat();

        Scanner cSide = new Scanner(System.in);
        System.out.println("Сторона трикутника С: ");
        float c = cSide.nextFloat();

        if ((a + b) > c & (b + c) > a & (c + a) > b) {
            System.out.println("Трикутник існує."); }
        else {
            System.out.println("Трикутник не існує."); }


    }
}
