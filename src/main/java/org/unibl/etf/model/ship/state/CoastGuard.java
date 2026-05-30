package org.unibl.etf.model.ship.state;

import java.nio.file.Path;

public interface CoastGuard extends StateShip {

    int PRIORITY = 1;

    Path getPursuitFile();

    @Override
    default int getPriority() {
        return PRIORITY;
    }
}
