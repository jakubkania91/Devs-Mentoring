package tematyka6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
     /*   car.brand = "mercede";
        car.color = "red";
        car.model = "slk";
        car.year = 2006;
        car.doors = 5;

        System.out.println(car.brand + " " + car.model + " " + car.color + " " + car.year + " " + car.doors);
*/
        Car seckondCar = new Car("bmw", "m7", "blue",5, 2011);
        Car thirdCar = new Car("bmw", "m7", "blue",5, 2011);
        boolean cars = seckondCar == thirdCar;
        System.out.println(cars);
        boolean equals = seckondCar.equals(thirdCar);
        System.out.println(equals);

        car.setBrand("BMW");
        car.setModel("M4");
        car.setColor("Orange");
        car.setYear(2011);
        car.setDoors(5);

        String brand = car.getBrand();
        System.out.println(brand);
        System.out.println(car.getModel() + " " + car.getBrand() + " " + car.getColor() + " " + car.getYear() + " " + car.getDoors());
        System.out.println(car.toString());
        String cars5 = "mercedes";
        int i = cars5.hashCode();
        HashMap<Car, String> map = new HashMap<>();
        map.put(seckondCar, "myCar");
        map.put(thirdCar, "Car");


    }
}
