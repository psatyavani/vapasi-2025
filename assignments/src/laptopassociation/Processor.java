package laptopassociation;

public class Processor {
    String brand;
    double speedGHz;

    Processor(String brand, double speedGHz) {
        this.brand = brand;
        this.speedGHz = speedGHz;
    }

    public String toString() {
        return "Processor: " + brand + ", " + speedGHz + " GHz";
    }
}
