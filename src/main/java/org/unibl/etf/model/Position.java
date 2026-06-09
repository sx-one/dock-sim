package org.unibl.etf.model;

public record Position(int row, int column) {

    public double distanceTo(Position other) {
        int drow = row - other.row;
        int dcol = column - other.column;
        return Math.sqrt(drow * drow + dcol * dcol);
    }
}
