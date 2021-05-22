package pl.gda.wsb;

public abstract class Vehicle{
    public Vehicle(String regPlate, String vin, String colour, float price, float fuelEconomy, float tank, float milage, float tanklevel) {
        this.regPlate = regPlate;
        this.vin = vin;
        this.colour = colour;
        this.price = price;
        this.fuelEconomy = fuelEconomy;
        this.tank = tank;
        this.milage = milage;
        this.tankLevel =  tanklevel;
    }

 String regPlate;
     String vin;
     String colour;
     float price;
     float fuelEconomy;
     float tank;
     float milage;
     float tankLevel;







}
