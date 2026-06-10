package org.unibl.etf.model.ship;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Ship {

    private final String name, engineNumber, registrationNumber;
    private final int IMO;
    private final String photoPath;

    public Ship(String name, String engineNumber, String registrationNumber, int IMO, Path photoPath) {
        this.name = name;
        this.engineNumber = engineNumber;
        this.registrationNumber = registrationNumber;
        this.IMO = IMO;
        this.photoPath = photoPath.toString();
    }

    public String getName() {
        return name;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getIMO() {
        return IMO;
    }

    public Path getPhotoPath() {
        return Paths.get(photoPath);
    }
}
