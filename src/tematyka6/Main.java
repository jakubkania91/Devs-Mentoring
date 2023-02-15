package tematyka6;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "mercede";
        car.color = "red";
        car.model = "slk";
        car.year = 2006;
        car.doors = 5;

        System.out.println(car.brand + " " + car.model + " " + car.color + " " + car.year + " " + car.doors);

        Car seckondCar = new Car("bmw", "m7", "blue",5, 2011);

        System.out.println(seckondCar.brand + " " + seckondCar.color + " " + seckondCar.model + " " + seckondCar.year + " " +seckondCar.doors);


    }
}
