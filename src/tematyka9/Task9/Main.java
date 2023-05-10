package tematyka9.Task9;

import Tematyka5.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorcycle("v1250", "Harley-Davidson", 2018));
        vehicles.add(new Motorcycle("cbr1000", "Honda", 2010));
        vehicles.add(new Motorcycle("gsxr", "Suzuki", 2015));
        vehicles.add(new Car("x6", "BMW", 2020));
        vehicles.add(new Car("rs5", "Audi", 2013));
        vehicles.add(new Car("xc90", "Volvo", 2019));
        vehicles.add(new Tram("s123", "solbus", 2023));
        vehicles.add(new Tram("a23", "Man", 2018));
        vehicles.add(new Tram("N7", "Jelcz", 2003));

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();

        }
    }
}
