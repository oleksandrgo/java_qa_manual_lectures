package com.hillel.qa.java.logical_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * В нас буде програма яка буде виводити в консоль змінну isProvideDriverLicense,
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
        int age = 99;
        boolean hasInsurance = true;
        boolean hasMed = true;
        boolean isProvideDriverLicense;

        if ((age >= 16) && hasInsurance && hasMed) {
            isProvideDriverLicense = true;
            System.out.println("Можна isProvideDriverLicense = " + isProvideDriverLicense);
        }
        else {
            isProvideDriverLicense = false;
            System.out.println("Неможна isProvideDriverLicense = " + isProvideDriverLicense);
        }
    }
}

