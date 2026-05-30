package org.unibl.etf.model.ship;

import java.nio.file.Path;

public class ContainerShip extends Ship {

    // TEU (Twenty-foot Equivalent Unit) - whole number of containers
    private final int capacity;

    public ContainerShip(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int capacity) {

        super(name, engineNumber, registrationNumber, IMO, photoPath);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
