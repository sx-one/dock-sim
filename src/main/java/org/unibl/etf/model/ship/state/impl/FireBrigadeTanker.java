package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Tanker;
import org.unibl.etf.model.ship.state.FireBrigade;

import java.nio.file.Path;

public final class FireBrigadeTanker extends Tanker implements FireBrigade {

    private boolean sirenOn;

    public FireBrigadeTanker(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, double volume) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, volume);
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
