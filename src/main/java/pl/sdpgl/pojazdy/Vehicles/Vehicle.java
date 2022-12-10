package pl.sdpgl.pojazdy.Vehicles;

import lombok.Data;
import lombok.NonNull;


@Data
public class Vehicle {

    @NonNull
    private final int maxSpeed;

    @NonNull
    private final String producent;

}
