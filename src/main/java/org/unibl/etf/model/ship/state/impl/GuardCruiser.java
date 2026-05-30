package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Cruiser;
import org.unibl.etf.model.ship.state.CoastGuard;

import java.nio.file.Path;

public final class GuardCruiser extends Cruiser implements CoastGuard {

    private boolean sirenOn;
    private final Path pursuitFile;

    public GuardCruiser(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int numPassengers,
            Path pursuitFile) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, numPassengers);
        this.pursuitFile = pursuitFile;
    }

    @Override
    public Path getPursuitFile() {
        return pursuitFile;
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
