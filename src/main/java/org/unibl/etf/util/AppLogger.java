package org.unibl.etf.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static java.util.logging.Level.ALL;
import static java.util.logging.Level.SEVERE;

public final class AppLogger {

    private static final Logger LOGGER = Logger.getLogger("dock-sim");
    private static final AppLogger INSTANCE = new AppLogger();

    public static AppLogger getInstance() {
        return INSTANCE;
    }

    private AppLogger() {
        try {
            FileHandler fileHandler = new FileHandler("error.log", true);

            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(ALL);
            LOGGER.addHandler(fileHandler);

        } catch (IOException e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    public void severe(String message, Throwable t) {
        LOGGER.log(SEVERE, message, t);
    }
}
