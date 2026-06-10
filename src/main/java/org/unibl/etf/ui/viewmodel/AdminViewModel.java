package org.unibl.etf.ui.viewmodel;

import javafx.beans.property.*;
import org.unibl.etf.model.Terminal;

public final class AdminViewModel {

    private final SimpleIntegerProperty totalShipsProperty =
            new SimpleIntegerProperty(0);

    private final SimpleIntegerProperty freeDocksProperty =
            new SimpleIntegerProperty(0);

    private final SimpleIntegerProperty totalDocksProperty =
            new SimpleIntegerProperty(0);

    private final SimpleIntegerProperty totalStateShipsProperty =
            new SimpleIntegerProperty(0);

    private final SimpleStringProperty selectedTerminalProperty =
            new SimpleStringProperty("<Select a terminal>");

    private final SimpleBooleanProperty isAddShipBtnDisabledProperty =
            new SimpleBooleanProperty(true);

    public void refresh() {

    }

    public IntegerProperty totalShipsProperty() {
        return totalShipsProperty;
    }

    public IntegerProperty freeDocksProperty() {
        return freeDocksProperty;
    }

    public IntegerProperty totalDocksProperty() {
        return totalDocksProperty;
    }

    public IntegerProperty totalStateShipsProperty() {
        return totalStateShipsProperty;
    }

    public StringProperty selectedTerminalProperty() {
        return selectedTerminalProperty;
    }

    public BooleanProperty isAddShipBtnDisabledProperty() {
        return isAddShipBtnDisabledProperty;
    }

    public void setSelectedTerminal(Terminal terminal) {
        selectedTerminalProperty.setValue("Terminal %d".formatted(terminal.getId()));
        isAddShipBtnDisabledProperty.setValue(false);
    }
}
