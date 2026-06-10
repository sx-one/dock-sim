package org.unibl.etf.model;

import org.unibl.etf.model.ship.Ship;
import org.unibl.etf.model.ship.state.StateShip;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Terminal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final int ROWS = 4;
    private static final int ENTRY_EXIT_COLUMNS = 2;

    private final int DOCK_COLUMNS;

    private final int id;
    private final Cell[][] grid;

    private final List<Position> docks;
    private final List<Ship> ships;

    private int freeDocks;

    public Terminal(int id, int dockColumns) {
        this.DOCK_COLUMNS = dockColumns;

        this.id = id;
        grid = initGrid(dockColumns);

        docks = findDockPositions();
        ships = new ArrayList<>();

        freeDocks = docks.size();
    }

    private Cell[][] initGrid(int columns) {
        Cell[][] grid = new Cell[ROWS][columns + ENTRY_EXIT_COLUMNS];

        for (int column = 0; column < columns + ENTRY_EXIT_COLUMNS; ++column) {
            grid[0][column] = new Cell(column < ENTRY_EXIT_COLUMNS ? Cell.Type.ENTRY_EXIT : Cell.Type.DOCK);
            grid[1][column] = new Cell(column < ENTRY_EXIT_COLUMNS ? Cell.Type.ENTRY_EXIT : Cell.Type.CHANNEL);
            grid[1][column] = new Cell(column < ENTRY_EXIT_COLUMNS ? Cell.Type.ENTRY_EXIT : Cell.Type.CHANNEL);
            grid[1][column] = new Cell(column < ENTRY_EXIT_COLUMNS ? Cell.Type.ENTRY_EXIT : Cell.Type.DOCK);
        }

        return grid;
    }

    private List<Position> findDockPositions() {
        var positions = new ArrayList<Position>();

        for(int column = ENTRY_EXIT_COLUMNS; column < ENTRY_EXIT_COLUMNS + DOCK_COLUMNS; ++column) {
            positions.add(new Position(0, column));
            positions.add(new Position(3, column));
        }

        return positions;
    }

    public int getId() {
        return id;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getFreeDockCount() {
        return freeDocks;
    }

    public int getDockCount() {
        return docks.size();
    }

    public int getStateShipCount() {
        return (int) ships.stream()
                .filter(ship -> ship instanceof StateShip)
                .count();
    }
}
