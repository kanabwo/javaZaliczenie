package pl.gda.wsb;

public class Car extends Vehicle implements Drivable,Refuelable{
    int doorNum;

public Car(String regPlate, String vin, String colour, float price, float fuelEconomy, float tank, float milage, int doorNum, float tankLevel){
    super(regPlate, vin, colour, price, fuelEconomy, tankLevel, milage, tankLevel);
    this.doorNum = doorNum;
}

    public float kmToGo(){
    return (this.tankLevel*100/fuelEconomy);
    }


    public void refuel(int liters) {
    if (liters + this.tankLevel>this.tank ) {
        this.tankLevel=this.tank;
        System.out.println("zatankowano do pelna(" + (this.tank - this.tankLevel) + ")litrow");
    }
    else {
        System.out.println("zatankowano " + liters + " litrow");
        this.tankLevel += liters;
        }

    }
}

