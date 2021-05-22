package pl.gda.wsb;

public abstract class Vehicle{
    public Vehicle(String regPlate, String vin, String colour, float price, float fuelEconomy, float tankLevel, float milage) {
        this.regPlate = regPlate;
        this.vin = vin;
        this.colour = colour;
        this.price = price;
        this.fuelEconomy = fuelEconomy;
        this.tank = tankLevel;
        this.milage = milage;
    }

    private String regPlate;
    private String vin;
    private String colour;
    private float price;
    private float fuelEconomy;
    private float tank;
    private float milage;








}
