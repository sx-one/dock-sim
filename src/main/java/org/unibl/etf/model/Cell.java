package org.unibl.etf.model;

import org.unibl.etf.model.ship.Ship;

public final class Cell {

    private Type type;
    private Ship occupant;

    public enum Type {
        DOCK, CHANNEL, ENTRY_EXIT, BLOCKED
    }

    public Cell(Type type) {
        this.type = type;
    }

    public Cell(Type type, Ship occupant) {
        this(type);
        this.occupant = occupant;
    }

    public Type getType() {
        return type;
    }

    public Ship getOccupant() {
        return occupant;
    }

    public void setType(Type type) throws IllegalArgumentException {
        if (type == null)
            throw new IllegalArgumentException("type cannot be null.");

        this.type = type;
    }

    public void setOccupant(Ship occupant) {
        this.occupant = occupant;
    }
}
