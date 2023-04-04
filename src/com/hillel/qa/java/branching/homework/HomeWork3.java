package com.hillel.qa.java.branching.homework;

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
        double purchaseAmount = 1000;
        String paymentMethod = "card";

        switch (paymentMethod) {
            case "cash":
                System.out.println("Сумма к оплате: " + purchaseAmount);
                break;
            case "card":
                System.out.println("Сумма к оплате (с учетом комиссии): " + purchaseAmount * 0.02);
                break;
            case "invoice":
                System.out.println("Сумма к оплате (с учетом комиссии): " + purchaseAmount * 0.05);
                break;
            default:
                System.out.println("Неверный способ оплаты.");
                break;
        }

    }
}
