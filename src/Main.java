import Mobile.CellPhone;
import Mobile.Tablet;

public class Main {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone();
        System.out.println(myPhone.model);


        myPhone.call("Mom");
        myPhone.setBalance(100);
        System.out.println(myPhone.getBalance());
        myPhone.setBalance(105);
        System.out.println(myPhone.getBalance());
        myPhone.gps = true;

        Tablet myTablet = new Tablet();
        myTablet.pointer = true;
        myTablet.gps = 10;

        myTablet.call("Hillel reception");
        myTablet.a(1,2);
        myTablet.a(true,2);

//        CellPhone workPhone = new CellPhone();
//        workPhone.operationSystem = "Android";
//        workPhone.model = "Xiomi";
//        workPhone.bluetooth = true;
//        workPhone.call("Mom");

    }
}
