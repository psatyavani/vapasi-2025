package laptopassociation;

public class Ram {

    int sizeGB;
    String type;

    Ram(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public String toString() {

        return "RAM: " + sizeGB + " GB" + "TYPE:" + type;
    }
}
