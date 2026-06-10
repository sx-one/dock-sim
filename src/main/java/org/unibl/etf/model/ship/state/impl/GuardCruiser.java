package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Cruiser;
import org.unibl.etf.model.ship.state.CoastGuard;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class GuardCruiser extends Cruiser implements CoastGuard {

    private boolean sirenOn;
    private final String pursuitFile;

    public GuardCruiser(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int numPassengers,
            Path pursuitFile) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, numPassengers);
        this.pursuitFile = pursuitFile.toString();
    }

    @Override
    public Path getPursuitFile() {
        return Paths.get(pursuitFile);
    }

    @Override
    public boolean isSirenOn() {
        return sirenOn;
    }

    @Override
    public void setSiren(boolean on) {
        sirenOn = on;
    }
}
