package org.unibl.etf.service;

import org.unibl.etf.io.PortDeserializer;
import org.unibl.etf.model.Port;
import org.unibl.etf.model.Terminal;

import java.util.List;

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
}
