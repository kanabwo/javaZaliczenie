package pl.gda.wsb;

public class Car extends Vehicle implements Drivable,Refuelable{
    int doorNum;

public Car(String regPlate, String vin, String colour, float price, float fuelEconomy, float tankLevel, float milage, int doorNum){
    super(regPlate, vin, colour, price, fuelEconomy, tankLevel, milage);
    this.doorNum = doorNum;
}



}

