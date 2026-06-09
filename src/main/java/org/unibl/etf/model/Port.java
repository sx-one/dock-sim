package org.unibl.etf.model;

import java.util.List;

public record Port(List<Terminal> terminals) {

    public Terminal getTerminal(int index) {
        return terminals.get(index);
    }
}
