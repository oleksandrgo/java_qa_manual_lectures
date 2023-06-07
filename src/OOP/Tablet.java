package OOP;

public class Tablet extends CellPhone {

    public Tablet(String model, int money) {
        super(model, money);
    }
    public boolean pointer;
    public boolean gps;

    public void haveBluetooth () {
        this.bluetooth = true;
        System.out.println("We have bluetooth");
    }

    @Override
    public void call(String contact){
        if(contact.equals("Мама")) {
            System.out.println("Дзвоню до мами через вайбер...");
        } else if(contact.equals("Саня")) {
            System.out.println("Ало Саня, напиши в телеграм");
        }
    }


    public String b(double a, double b) {
        return "Overloaded method";
    }
}
