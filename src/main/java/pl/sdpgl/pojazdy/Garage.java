package pl.sdpgl.pojazdy;

import lombok.Getter;
import pl.sdpgl.pojazdy.Vehicles.*;

import java.util.Map;

import static pl.sdpgl.pojazdy.Main.LOGGER;


@Getter
public class Garage {

    private Map<String,Vehicle> vehicleMap = Map.of(
            "Lamborghini Galardo",new Car(400,"Lamborghini"),
            "Aston Martin DBX707",new Car(333,"Aston Martin"),
            "Boeing 767",new Plane(945,"Boeing"),
            "F16",new Plane(2124,"General Dynamics"),
            "Big Nine 29'",new Bicycle(50,"Merida Industry"),
            "Inazi Hybrid",new Bicycle(100,"Kross"),
            "Arka Noego",new Ship(20,"Noe"),
            "Titanic",new Ship(0,"White Star Line"),
            "Sanie Świętego Mikołaja",new Vehicle(100000,"Magia")
    );


    public Car findFastestCar(){

        Car fastestCar = new Car(0,"Test");
        String nameOfFastestCar = "test";

        for (var entry : vehicleMap.entrySet()){

            if(entry.getValue() instanceof Car){

                Car tempCar = (Car) entry.getValue();

                if(fastestCar.getMaxSpeed()<tempCar.getMaxSpeed()){

                    fastestCar = tempCar;
                    nameOfFastestCar = entry.getKey();

                }

            }

        }

        LOGGER.info(nameOfFastestCar);
        return fastestCar;

    }


    public Plane findFastestPlane(){

        Plane fastestPlane = new Plane(0,"Test");
        String nameOfFastestPlane = "test";

        for (var entry : vehicleMap.entrySet()){

            if(entry.getValue() instanceof Plane){

                Plane tempPlane = (Plane) entry.getValue();

                if(fastestPlane.getMaxSpeed()<tempPlane.getMaxSpeed()){

                    fastestPlane = tempPlane;
                    nameOfFastestPlane = entry.getKey();

                }

            }

        }

        LOGGER.info(nameOfFastestPlane);
        return fastestPlane;

    }

    public Bicycle findFastestBicycle(){

        Bicycle fastestBicycle = new Bicycle(0,"Test");
        String nameOfFastestBicycle = "test";

        for (var entry : vehicleMap.entrySet()){

            if(entry.getValue() instanceof Bicycle){

                Bicycle tempBicycle = (Bicycle) entry.getValue();

                if(fastestBicycle.getMaxSpeed()<tempBicycle.getMaxSpeed()){

                    fastestBicycle = tempBicycle;
                    nameOfFastestBicycle = entry.getKey();

                }

            }

        }


        LOGGER.info(nameOfFastestBicycle);
        return fastestBicycle;

    }


    public Ship findFastestShip(){

        Ship fastestShip = new Ship(0,"Test");
        String nameOfFastestShip = "test";

        for (var entry : vehicleMap.entrySet()){

            if(entry.getValue() instanceof Ship){

                Ship tempShip = (Ship) entry.getValue();

                if(fastestShip.getMaxSpeed()<tempShip.getMaxSpeed()){

                    fastestShip = tempShip;
                    nameOfFastestShip = entry.getKey();

                }

            }

        }


        LOGGER.info(nameOfFastestShip);
        return fastestShip;

    }


    public Vehicle findFastestVehicle(){


        Vehicle fastestVehicle = new Vehicle(0,"Test");
        String nameOfFastestVehicle = "test";

        for (var entry : vehicleMap.entrySet()){

            if(entry.getValue() instanceof Vehicle){

                Vehicle tempVehicle = (Vehicle) entry.getValue();

                if(fastestVehicle.getMaxSpeed()<tempVehicle.getMaxSpeed()){

                    fastestVehicle = tempVehicle;
                    nameOfFastestVehicle = entry.getKey();

                }

            }

        }

        LOGGER.info(nameOfFastestVehicle);
        return fastestVehicle;

    }


}
