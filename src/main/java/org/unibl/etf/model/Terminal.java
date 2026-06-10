package org.unibl.etf.model;

import java.io.Serial;
import java.io.Serializable;

public final class Terminal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final int ROWS = 4;

    private final int id;
    private final Cell[][] grid;

    public Terminal(int id, int dockColumns) {
        this.id = id;
        grid = initGrid(dockColumns);
    }

    private Cell[][] initGrid(int columns) {
        Cell[][] grid = new Cell[ROWS][columns + 2]; // Two extra columns for the entry/exit on the left

        for (int column = 0; column < columns + 2; ++column) {
            grid[0][column] = new Cell(column < 2 ? Cell.Type.ENTRY_EXIT : Cell.Type.DOCK);
            grid[1][column] = new Cell(column < 2 ? Cell.Type.ENTRY_EXIT : Cell.Type.CHANNEL);
            grid[1][column] = new Cell(column < 2 ? Cell.Type.ENTRY_EXIT : Cell.Type.CHANNEL);
            grid[1][column] = new Cell(column < 2 ? Cell.Type.ENTRY_EXIT : Cell.Type.DOCK);
        }

        return grid;
    }

    public int getId() {
        return id;
    }
}
