package org.unibl.etf.io;

import org.unibl.etf.model.Port;
import org.unibl.etf.model.Terminal;
import org.unibl.etf.util.AppLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public final class PortDeserializer {

    private static final PortDeserializer INSTANCE = new PortDeserializer();

    private static final String FILE_PATH = "luka.ser";

    public static PortDeserializer getInstance() {
        return INSTANCE;
    }

    public Port loadOrCreate() {
        File file = new File(FILE_PATH);

        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                return (Port) in.readObject();

            } catch (Exception e) {
                AppLogger.getInstance().severe("Failed to deserialize the Port object.", e);
            }
        }

        return createFresh();
    }

    private Port createFresh() {
        int terminalCount = AppProperties.getInstance().getTerminalCount();
        int dockColumns = AppProperties.getInstance().getDockColumns();

        List<Terminal> terminals = new ArrayList<>();

        for (int i = 0; i < terminalCount; i++)
            terminals.add(new Terminal(i + 1, dockColumns));

        return new Port(terminals);
    }
}
