package pl.sdpgl.pojazdy;

import pl.sdpgl.pojazdy.Vehicles.Vehicle;
import java.util.Scanner;

import static pl.sdpgl.pojazdy.Main.LOGGER;


public class UI {

    private boolean flagToContinue = true;

    Garage garage;


    public UI(){

        garage = new Garage();
        menu();


    }


    private void menu(){


        while(flagToContinue){


            System.out.println("Wybierz jedną z opcji: [CAR,SHIP,PLANE,BICYCLE,ALL,EXIT]");


            switch(userChoice()){
                case "CAR":

                    LOGGER.info("Pojazd ");
                    Vehicle fastestCar = garage.findFastestCar();
                    LOGGER.info(" producenta "+fastestCar.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestCar.getMaxSpeed() +")\n");


                    break;
                case "PLANE":

                    LOGGER.info("Pojazd ");
                    Vehicle fastestPlane = garage.findFastestPlane();
                    LOGGER.info(" producenta "+fastestPlane.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestPlane.getMaxSpeed() +")\n");

                    break;
                case "BICYCLE":

                    LOGGER.info("Pojazd ");
                    Vehicle fastestBicycle = garage.findFastestBicycle();
                    LOGGER.info(" producenta "+fastestBicycle.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestBicycle.getMaxSpeed() +")\n");

                    break;
                case "SHIP":

                    LOGGER.info("Pojazd ");
                    Vehicle fastestShip = garage.findFastestShip();
                    LOGGER.info(" producenta "+fastestShip.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestShip.getMaxSpeed() +")\n");

                    break;
                case "ALL":

                    LOGGER.info("Pojazd ");
                    Vehicle fastestVehicle = garage.findFastestVehicle();
                    LOGGER.info(" producenta "+fastestVehicle.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestVehicle.getMaxSpeed() +")\n");

                    break;
                case "EXIT":
                    flagToContinue = false;
                    break;

                default:
                    LOGGER.info("Podaj prawidłową opcję\n");






            }




        }


    }

    private String userChoice(){

        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }




}
