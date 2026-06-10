package org.unibl.etf.model.ship;

import java.io.Serial;
import java.nio.file.Path;

public class Cruiser extends Ship {

    @Serial
    private static final long serialVersionUID = 1L;

    private final int numPassengers;

    public Cruiser(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int numPassengers) {

        super(name, engineNumber, registrationNumber, IMO, photoPath);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }
}
