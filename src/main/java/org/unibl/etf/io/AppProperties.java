package org.unibl.etf.io;

import org.unibl.etf.util.AppLogger;

import java.util.Properties;

public final class AppProperties {

    private static final AppProperties INSTANCE = new AppProperties();

    private int terminalCount;
    private int dockColumns;

    public static AppProperties getInstance() {
        return INSTANCE;
    }

    private AppProperties() {
        try(var inputStream = AppProperties.class.getResourceAsStream("/application.properties")) {
            var properties = new Properties();

            properties.load(inputStream);

            terminalCount = Integer.parseInt(properties.getProperty("application.terminal.count"));
            dockColumns = Integer.parseInt(properties.getProperty("application.terminal.dock.columns"));

        } catch (Exception e) {
            AppLogger.getInstance().severe("Failed to load properties.", e);
        }
    }

    public int getTerminalCount() {
        return terminalCount;
    }

    public int getDockColumns() {
        return dockColumns;
    }
}
