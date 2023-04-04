package com.hillel.qa.java.branching.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Згадаймо математику та систему координат.
     * Необхідно написату програму в якій будуть дві зміні x, y.
     * Програма повина казати в якій чверті знаходиться ціль згідно зміним x, y.
     * В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     * врахуйте обробку якщо x, y будуть 0.
     * </p>
     */
    public static void main(String[] args) {
        int x = 4;
        int y = -6;

        if (x == 0 && y == 0) {
            System.out.println("Ціль знаходиться в початку координат.");
        } else if (x > 0 && y > 0) {
            System.out.println("Ціль знаходиться в першій чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Ціль знаходиться в другій чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Ціль знаходиться в третій чверті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Ціль знаходиться в четвертій чверті.");
        }
    }
}
