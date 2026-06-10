package org.unibl.etf.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record Port(List<Terminal> terminals) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Terminal getTerminal(int index) {
        return terminals.get(index);
    }
}
