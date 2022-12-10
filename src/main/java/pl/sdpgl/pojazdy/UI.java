package pl.sdpgl.pojazdy;

import lombok.extern.log4j.Log4j2;
import pl.sdpgl.pojazdy.Vehicles.Vehicle;

import java.util.Scanner;

@Log4j2
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

                    Main.logger.info("Pojazd ");
                    Vehicle fastestCar = garage.findFastestCar();
                    Main.logger.info(" producenta "+fastestCar.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestCar.getMaxSpeed() +")\n");


                    break;
                case "PLANE":

                    Main.logger.info("Pojazd ");
                    Vehicle fastestPlane = garage.findFastestPlane();
                    Main.logger.info(" producenta "+fastestPlane.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestPlane.getMaxSpeed() +")\n");

                    break;
                case "BICYCLE":

                    Main.logger.info("Pojazd ");
                    Vehicle fastestBicycle = garage.findFastestBicycle();
                    Main.logger.info(" producenta "+fastestBicycle.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestBicycle.getMaxSpeed() +")\n");

                    break;
                case "SHIP":

                    Main.logger.info("Pojazd ");
                    Vehicle fastestShip = garage.findFastestShip();
                    Main.logger.info(" producenta "+fastestShip.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestShip.getMaxSpeed() +")\n");

                    break;
                case "ALL":

                    Main.logger.info("Pojazd ");
                    Vehicle fastestVehicle = garage.findFastestVehicle();
                    Main.logger.info(" producenta "+fastestVehicle.getProducent()+" jest najszybszy (maksymalna prędkość to="+ fastestVehicle.getMaxSpeed() +")\n");

                    break;
                case "EXIT":
                    flagToContinue = false;
                    break;

                default:
                    Main.logger.info("Podaj prawidłową opcję\n");






            }




        }


    }

    private String userChoice(){

        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }




}
