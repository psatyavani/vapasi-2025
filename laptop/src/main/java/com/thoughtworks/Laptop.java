package com.thoughtworks;

public class Laptop {

    final String logo = "MAC";

    Processor processor;
    Ram ram;
    HardDisk hardDisk;

    Laptop(Processor processor, Ram ram, HardDisk hardDisk) {

        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    public String toString() {

        return "Laptop [Logo: " + logo + ", " + processor + ", " + ram + ", " + hardDisk + "]";
    }
}
