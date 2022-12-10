package pl.sdpgl.pojazdy.Vehicles;


import lombok.NonNull;

public class Car extends Vehicle{


    public Car(@NonNull int maxSpeed, @NonNull String producent) {
        super(maxSpeed, producent);
    }


}
