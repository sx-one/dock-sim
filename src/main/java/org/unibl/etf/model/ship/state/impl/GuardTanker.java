package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Tanker;
import org.unibl.etf.model.ship.state.CoastGuard;

import java.io.Serial;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class GuardTanker extends Tanker implements CoastGuard {

    @Serial
    private static final long serialVersionUID = 1L;

    private boolean sirenOn;
    private final String pursuitFile;

    public GuardTanker(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, double volume,
            Path pursuitFile) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, volume);
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
