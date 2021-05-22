package pl.gda.wsb;

public interface Drivable {
         default void drive(int kilometers) {
            System.out.println("przejechano "+kilometers+" kilometrow");
        }


    }


