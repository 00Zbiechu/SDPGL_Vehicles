package pl.sdpgl.pojazdy.Vehicles;

import lombok.NonNull;

public class Bicycle extends Vehicle{
    public Bicycle(@NonNull int maxSpeed, @NonNull String producent) {
        super(maxSpeed, producent);
    }
}
