package com.hillel.qa.java.logical_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * В нас буде програма яка виводити в консоль зміну isProvideDriverLicense,
     * в якій буде зберігатися значення true, false. Вимоги для отримання водійського посвідчення
     * наступні:
     * </p>
     * <ol style="font-size:12px">
     *     <li>Рік людини дорівнював або був більше 16.</li>
     *     <li>Є страховка.</li>
     *     <li>Лікарський дозвіл що ви можете водити авто.</li>
     * </ol>
     */
    public static void main(String[] args) {
        int minYear = 16;
        int userYear = 18;
        boolean isHasInsurance = true;
        boolean isHealthy = true;
        boolean isProvideDriverLicense = (userYear >= minYear) && isHasInsurance && isHealthy;
        System.out.println(isProvideDriverLicense);
    }
}
