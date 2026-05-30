package org.unibl.etf.model.ship;

import java.nio.file.Path;

public class Tanker extends Ship {

    // Volume in number of barrels
    private final double volume;

    public Tanker(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, double volume) {

        super(name, engineNumber, registrationNumber, IMO, photoPath);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
