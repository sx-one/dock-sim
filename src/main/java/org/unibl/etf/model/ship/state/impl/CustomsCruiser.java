package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Cruiser;
import org.unibl.etf.model.ship.state.Customs;

import java.io.Serial;
import java.nio.file.Path;

public final class CustomsCruiser extends Cruiser implements Customs {

    @Serial
    private static final long serialVersionUID = 1L;

    private boolean sirenOn;

    public CustomsCruiser(
            String name, String engineNumber,
            String registrationNumber, int IMO,
            Path photoPath, int numPassengers) {

        super(name, engineNumber, registrationNumber, IMO, photoPath, numPassengers);
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
