package org.unibl.etf.service;

import org.unibl.etf.io.PortDeserializer;
import org.unibl.etf.model.Port;
import org.unibl.etf.model.Terminal;

import java.util.List;
import java.util.function.ToIntFunction;

public final class PortService {

    private static final PortService INSTANCE = new PortService();

    private final Port port;

    public static PortService getInstance() {
        return INSTANCE;
    }

    private PortService() {
        port = PortDeserializer.getInstance().loadOrCreate();
    }

    public List<Terminal> getTerminals() {
        return port.terminals();
    }

    public int getTotalShipCount() {
        return getTotalCount(terminal -> terminal.getShips().size());
    }

    public int getTotalFreeDockCount() {
        return getTotalCount(Terminal::getFreeDockCount);
    }

    public int getTotalDockCount() {
        return getTotalCount(Terminal::getDockCount);
    }

    public int getTotalStateShipCount() {
        return getTotalCount(Terminal::getStateShipCount);
    }

    private int getTotalCount(ToIntFunction<Terminal> mapper) {
        return port.terminals().stream()
                .mapToInt(mapper)
                .sum();
    }
}
