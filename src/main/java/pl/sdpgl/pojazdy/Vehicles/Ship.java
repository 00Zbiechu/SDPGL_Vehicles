package pl.sdpgl.pojazdy.Vehicles;

import lombok.NonNull;

public class Ship extends Vehicle{
    public Ship(@NonNull int maxSpeed, @NonNull String producent) {
        super(maxSpeed, producent);
    }
}
