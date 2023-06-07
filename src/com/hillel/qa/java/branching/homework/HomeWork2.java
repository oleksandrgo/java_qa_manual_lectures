package com.hillel.qa.java.branching.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     *     Згадаймо математику та систему координат.
     *     Необхідно написати програму в якій будуть дві зміні x, y.
     *     Програма повинна казати в якій чверті знаходиться ціль згідно зміним x, y.
     *     В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     *     врахуйте обробку якщо x, y будуть 0.
     * </p>
     *
     */
    public static void main(String[] args) {
    int x = 0;
    int y = 0;
        boolean firstQuarter = (x > 0 && y > 0);
        boolean secondQuarter = (x < 0 && y > 0);
        boolean thirdQuarter = (x < 0 && y < 0);
        boolean fourthQuarter = (x > 0 && y < 0);
        if (firstQuarter){
            System.out.println("Ціль знаходиться в 1");
        } else if (secondQuarter){
            System.out.println("Ціль знаходиться в 2");
        } else if (thirdQuarter){
            System.out.println("Ціль знаходиться в 3");
        } else if (fourthQuarter){
            System.out.println("Ціль знаходиться в 4");
        }else {
            System.out.println("'x' та 'y' = 0");
        }

    }
}
