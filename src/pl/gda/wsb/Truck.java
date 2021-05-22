package pl.gda.wsb;

public class Truck extends Vehicle implements Drivable,Refuelable{
    int maxLoad;
    public Truck(String regPlate, String vin, String colour, float price, float fuelEconomy, float tankLevel, float milage, int maxLoad){
        super(regPlate, vin, colour, price, fuelEconomy, tankLevel, milage);
        this.maxLoad= maxLoad;
    }

}

