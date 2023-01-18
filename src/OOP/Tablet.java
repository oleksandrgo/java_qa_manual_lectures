package OOP;

public class Tablet extends CellPhone {

//    public Tablet(String a, int b) {
//        super(a, b);
//    }
    public boolean pen;

    public void haveBluetooth () {
        this.bluetooth = true;
        System.out.println("We have bluetooth");
    }

    @Override
    public void call(String contact){
        if(contact.equals("Мама")) {
            System.out.println("Дзвоню до мами через вайбер...");
        } else if(contact.equals("Саня")) {
            System.out.println("Ало Саньок, напиши в телеграм");
        }
    }


    public String b(double a, double b) {
        return "Overloaded method";
    }
}
