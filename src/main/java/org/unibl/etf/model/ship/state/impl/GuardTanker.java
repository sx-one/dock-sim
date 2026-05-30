package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Tanker;
import org.unibl.etf.model.ship.state.CoastGuard;

import java.nio.file.Path;

public final class GuardTanker extends Tanker implements CoastGuard {

    private boolean sirenOn;
    private final Path pursuitFile;

    public GuardTanker(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, double volume,
            Path pursuitFile) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, volume);
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
