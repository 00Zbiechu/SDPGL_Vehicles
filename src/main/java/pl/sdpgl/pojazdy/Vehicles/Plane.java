package pl.sdpgl.pojazdy.Vehicles;

import lombok.NonNull;

public class Plane extends Vehicle{
    public Plane(@NonNull int maxSpeed, @NonNull String producent) {
        super(maxSpeed, producent);
    }
}
