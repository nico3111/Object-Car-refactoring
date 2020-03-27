package com.company;

public class Main {

    /** Leider ist mir nicht viel eingefallen wo ich ein Interface einbauen kann...
     * darum habe ich eine Abstrakte Klasse Vehicle eingebaut, und um ein Enum erweitert.
     * **/


    public static void main(String[] args) {

        Car car1 = new Car(VehicleType.SUV, CarBrand.VW, "Touran", 190, 21000, 30000, 50, 50, 8, 6);
        Car car2 = new Car(VehicleType.SPORTSWAGON, CarBrand.SKODA,"Superb", 180, 1200, 25000, 55, 21, 6, 5);
        Car car3 = new Car(VehicleType.COUPE, CarBrand.PORSCHE,"Porsche Cayman GT4", 420, 12000, 20000, 50, 45, 11, 3);

        Driver driver1 = new Driver("Peter Müller", 32, 1500);
        Driver driver2 = new Driver("Franz Weber", 39, 800);
        Driver driver3 = new Driver("Alex Brennbauer", 28, 2300);

        car1.driveWithTheCar(400);

        CarRepairShop gasMonkey = new CarRepairShop("Gas Monkey Garage", 15.99);
        GasStation omv = new GasStation("OMV", 1.08);

        gasMonkey.makeCarService(car1, driver1);
        gasMonkey.makeCarWash(driver1, car1);
//
        car1.driveWithTheCar(100);
        System.out.println(gasMonkey.getDirtDegree(car1));

        car1.driveWithTheCar(100);

        omv.goRefuel(driver1, car1);

        car1.carStatus(car1);
        car2.carStatus(car2);
        car3.carStatus(car3);

    }
}
