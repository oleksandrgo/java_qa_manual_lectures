package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {

        Scanner carBrand = new Scanner(System.in);
        System.out.println("Введіть вашу улюблену марку автомобіля: ");
        String myBrand = carBrand.nextLine();

        int i = 10;
        while (i > 0) {

            System.out.println(myBrand + " найкраще авто");
            i--;
        }

    }
}
