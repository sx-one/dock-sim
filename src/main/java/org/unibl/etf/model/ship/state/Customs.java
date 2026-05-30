package org.unibl.etf.model.ship.state;

public interface Customs extends StateShip {

    int PRIORITY = 2;

    @Override
    default int getPriority() {
        return PRIORITY;
    }
}
