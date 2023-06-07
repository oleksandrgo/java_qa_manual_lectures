package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {

        System.out.println("Введіть цілі числа : ");
        boolean isExit = true;
        int mySum = 0;
        String myString;
        String exit = "exit";
        boolean corectExit = false;

        while (true) {
            Scanner enteredNumber = new Scanner(System.in);
             myString = enteredNumber.nextLine();
            if (corectExit != exit.equals(myString)){
                System.out.println("Сумма введенных чисел: " + mySum);
                break;
                //System.out.println(mySum);
            }
            else {
                int sumMyNumber = Integer.parseInt(myString);
                mySum += sumMyNumber;
            }
            //System.out.println("Сумма введенных чисел: " + mySum);
            //break;
        }

    }
}
