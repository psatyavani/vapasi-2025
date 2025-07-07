package laptopassociation;

public class LaptopDistributionApp {
    public static void main(String[] args) {
        Processor p1=new Processor("Intel", 3.5);
        Ram r1=new Ram(16,"Static RAM");
        HardDisk hd1= new HardDisk("SSD" , 511);
        Laptop l1= new Laptop(p1,r1,hd1);
        Customer c1=new Customer("Divya",l1);
        Customer c2=new Customer("Geeta",l1);
        c1.showDetails();
        c2.showDetails();
    }
}
