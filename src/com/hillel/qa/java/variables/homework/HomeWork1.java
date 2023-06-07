package com.hillel.qa.java.variables.homework;

public class HomeWork1 {
    /**
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>У методі main оголоси чотири змінні типу int, double, String, boolean.</li>
     *     <li>Змінні повинні мати імена year, height, countryName, isStudent.</li>
     *     <li>Змінним одразу потрібно присвоїти значення.</li>
     * </ul>
     */
    public static void main(String[] args) {
        int year = 1986;
        double height = 185.1;
        String countryName = "Ukraine";
        boolean isStudent = false;
        System.out.println("Рік народження: " + year);
        System.out.println("Зріст: " + height);
        System.out.println("Країна походження: " + countryName);
        System.out.println("Студент? " + isStudent);
    }
}
