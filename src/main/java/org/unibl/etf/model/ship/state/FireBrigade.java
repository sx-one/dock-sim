package org.unibl.etf.model.ship.state;

public interface FireBrigade extends StateShip {

    int PRIORITY = 0;

    @Override
    default int getPriority() {
        return PRIORITY;
    }
}
