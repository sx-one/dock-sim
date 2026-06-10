package org.unibl.etf.model.ship.state.impl;

import org.unibl.etf.model.ship.Tanker;
import org.unibl.etf.model.ship.state.Customs;

import java.io.Serial;
import java.nio.file.Path;

public final class CustomsTanker extends Tanker implements Customs {

    @Serial
    private static final long serialVersionUID = 1L;

    private boolean sirenOn;

    public CustomsTanker(
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
