package pl.gda.wsb;

public class Motorcycle extends Vehicle implements Drivable,Refuelable{

    public Motorcycle(String regPlate, String vin, String colour, float price, float fuelEconomy, float tank, float milage,  float tankLevel){
        super(regPlate, vin, colour, price, fuelEconomy, tank, milage, tankLevel);
    }
    public float kmToGo(){
        return (this.tankLevel*100/fuelEconomy);
    }

}


