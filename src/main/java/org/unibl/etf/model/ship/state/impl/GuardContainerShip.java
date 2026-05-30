package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.ContainerShip;
import org.unibl.etf.model.ship.state.CoastGuard;

import java.nio.file.Path;

public final class GuardContainerShip extends ContainerShip implements CoastGuard {

    private boolean sirenOn;
    private final Path pursuitFile;

    public GuardContainerShip(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int capacity,
            Path pursuitFile) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, capacity);
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
