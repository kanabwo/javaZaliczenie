package pl.gda.wsb;

public interface Refuelable {

    default void refuel(int liters) {
        System.out.println("zatankowano "+liters+" litrow");
    }
}
