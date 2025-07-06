package com.thoughtworks;

public class HardDisk {
    String type;
    int capacityGB;

    HardDisk(String type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }

    public String toString() {

        return "Hard Drive: " + type + ", " + capacityGB + " GB";
    }
}
