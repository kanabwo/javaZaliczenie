package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c1 = new Car("abc", "sg654s", "black", 50000,10,40,10,3);
        Car c2 = new Car("cba", "fgj654f", "white", 100000,15,50,1000,2);

        Motorcycle m1 = new Motorcycle("qwe","54fgn5m","red",10000,5,20,500);
        Motorcycle m2 = new Motorcycle("ewq","gfyhk54h,l48","green",5000,3,15,5000);

        Truck t1 = new Truck("fjn84mj","gfdhjndftjn45f451","green",1000000,50,500,500000,50000);
        Truck t2 = new Truck("ftj5","fgj564561gk","red",1500000,50,550,300000,60000);


       c1.drive(10);
       c2.refuel(10);










    }
}
