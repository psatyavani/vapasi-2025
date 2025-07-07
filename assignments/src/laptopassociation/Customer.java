package laptopassociation;

public class Customer {
    String name;
    Laptop laptop;

    Customer(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public void showDetails() {
        System.out.println("Customer: " + name);
        System.out.println(laptop);
        System.out.println("*******************************");

    }
}
