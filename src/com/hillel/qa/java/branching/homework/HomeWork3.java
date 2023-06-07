package com.hillel.qa.java.branching.homework;

import java.nio.channels.SelectionKey;
import java.util.Scanner;

public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {

        boolean cashPay = false;
        boolean cardPay = false;
        boolean billPay = true;
        int payType = 0;

        Scanner mySum = new Scanner(System.in);
        System.out.println("Введіть суму купівлі: ");
        float paySum = mySum.nextFloat();
        if (paySum >= 0) {
            //float paySum = 100;
            float totalSum;

            if (cashPay == true) {
                payType = 1;
            } else if (cardPay == true) {
                payType = 2;
            } else if (billPay == true) {
                payType = 3;
            } else {
                System.out.println("Варіант виведення, коли немає відповідності будь-якому способу оплати.");
            }
            switch (payType) {
                case 1:
                    totalSum = paySum;
                    System.out.println("Суму для оплати: " + totalSum);
                    break;
                case 2:
                    totalSum = (float) (paySum * 1.02);
                    System.out.println("Суму для оплати: " + totalSum);
                    break;
                case 3:
                    totalSum = (float) (paySum * 1.05);
                    System.out.println("Суму для оплати: " + totalSum);
                    break;
                default:
                    System.out.println("А як тоді?.");
            }
        }
        else {
            System.out.println("Сума повинна буди більше '0'!");
        }
    }
}
