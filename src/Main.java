import OOP.CellPhone;
import OOP.Tablet;

public class Main {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone("iPhone 3G", 10);
        System.out.println(myPhone.model);

        Tablet myTablet = new Tablet("Samsung", 0);
        myTablet.pointer = true;
        myTablet.gps = true;

        myTablet.call("Hillel reception");

    }
}
