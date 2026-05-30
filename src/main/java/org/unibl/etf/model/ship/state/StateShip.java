package org.unibl.etf.model.ship.state;

public interface StateShip {

    boolean isSirenOn();
    void setSiren(boolean on);
    int getPriority(); // Lesser value => higher priority
}
