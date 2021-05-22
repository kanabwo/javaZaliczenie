package pl.gda.wsb;

public class Truck extends Vehicle implements Drivable,Refuelable{
    int maxLoad;
    public Truck(String regPlate, String vin, String colour, float price, float fuelEconomy, float tank, float milage, float tankLevel, int maxLoad){
        super(regPlate, vin, colour, price, fuelEconomy, tank, milage, tankLevel);
        this.maxLoad= maxLoad;
    }
    public float kmToGo(){
        return (this.tankLevel*100/fuelEconomy);
    }

}

