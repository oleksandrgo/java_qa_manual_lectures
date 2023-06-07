package OOP;

/*
    Абстракція
    Інкапсуляція - можливість закрити ті чи інші властивості класу
    Наслідування
    Поліморфізм
 */
public class CellPhone {
    public int weight;
    public boolean wifi;
    public String model;
    public boolean touchscreen;
    public boolean bluetooth;
    protected int sims = 1;
    public String color;
    private int money = 0;

    public CellPhone (String model, int money) {
        this.model = model;
        this.money = money;
    }
    public void call(String contact) {
        if (money>= 1) {
            if(contact.equals("Мама")) {
                System.out.println("Дзвоню до мами...");
            } else if(contact.equals("Саня")) {
                System.out.println("Ало Саня");
            }
            money = money - 1;
        } else {
            System.out.println("Не достатньо грошей на рахунку");
        };
    }
    public void addMoney (int amount) {
        money = money + amount;
    }
}
