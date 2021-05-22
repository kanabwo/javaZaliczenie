package pl.gda.wsb;

public class Motorcycle extends Vehicle implements Drivable,Refuelable{

    public Motorcycle(String regPlate, String vin, String colour, float price, float fuelEconomy, float tankLevel, float milage){
        super(regPlate, vin, colour, price, fuelEconomy, tankLevel, milage);
    }


}


