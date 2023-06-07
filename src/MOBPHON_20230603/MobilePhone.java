package MOBPHON_20230603;

import javax.swing.*;

public class MobilePhone {
    public boolean hasSensor;
    public boolean wiFi;
    public double msize;
    public boolean hasBlueTooth;
    public String model;


    public  boolean simCard;
    private int credits;

    /*public MobilePhone(boolean wifi, boolean sensor, double size)
    {
        this.wiFi = wifi;
        this.hasSensor = sensor;
        this.msize = size;
    }*/

    public void call (String contact)
    {
        if (this.credits > 0)
        {
            if (contact == "Mom")
            {
                System.out.println("Hello mama" + "I'm calling from " + this.model);
            }
            else if (contact == "other")
            {
                    System.out.printf("aloE! " + "I'm calling from " + this.model);
            }
            this.credits = this.credits - 1;
        } else
        {
            System.out.println("Please add some money!");
        }
    }

    public void addCredits(int amount, String code){
        this.credits = this.credits + amount;
    }

}
