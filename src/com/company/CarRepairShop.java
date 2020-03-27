package com.company;


public class CarRepairShop {

    String repairshopName;
    double carWashPrice;
    int carServicePrice;
    double gasolinePrice;

    public CarRepairShop(String repairshopName, double carWashPrice) {
        this.repairshopName = repairshopName;
        this.carWashPrice = carWashPrice;
//        this.gasolinePrice = gasolinePrice;
    }

    public void makeCarService(Car car, Driver driver) {
        switch (car.brand) {
            case VW:
                carServicePrice = 600;
                break;
            case SKODA:
                carServicePrice = 500;
                break;
            case PORSCHE:
                carServicePrice = 1200;
                break;
        }
        System.out.println("Der Service für die Marke " + car.brand + " kostet " + carServicePrice + "€");
        System.out.println("Dem Fahrer " + driver.driverName + " wird vom seinem Konto mit " +
                driver.account + "€ der Betrag für den Service von " + carServicePrice + "€ abgebucht.");
        driver.account = driver.account - carServicePrice;
        System.out.println("Sein neuer Kontostand beträgt: " + driver.account + "€\n");
    }

    public void makeCarWash(Driver driver, Car cardirt) {
        String myCarWashString = "Viel Spass in der Waschstraße!";
        myCarWashString = myCarWashString + "\n" + "Das Auto hat einen Schmutzgrad von: " + cardirt.dirtDegree;

        /*System.out.println("Viel Spass in der Waschstraße!");
        System.out.println("Das Auto hat einen Schmutzgrad von: " + cardirt.dirtDegree);*/
        System.out.println("Dem Fahrer " + driver.driverName + " wird vom seinem Konto mit " +
                driver.account + "€ der Betrag für die Waschstrasse  von " + carWashPrice + "€ abgebucht.");
        driver.account = driver.account - carWashPrice;
        cardirt.dirtDegree = 0 ;
        System.out.println("Sein neuer Kontostand beträgt: " + driver.account + "€");
        System.out.println("Das Auto ist nun Sauber mit einem Schmutzgrad von: " + cardirt.dirtDegree + "\n");
    }

    public String getDirtDegree(Car car) {
        return "Der aktuelle Schmutzgrad des Autos beträgt: " + car.dirtDegree + "\n";
    }

//    public void goRefuel(Driver driver, Car car) {
//        double priceToFill;
//        System.out.println("Guten Tag in ihrer Tankstelle");
//        System.out.println("Sie haben noch " + car.fuelCurrentStatus + "l im Tank");
//        priceToFill = car.fuelMax - car.fuelCurrentStatus;
//        priceToFill = priceToFill * gasolinePrice;
//        car.fuelCurrentStatus = car.fuelMax;
//        driver.account = driver.account - priceToFill;
//        loading();
//        System.out.println("Der Tank ist voll mit " + car.fuelCurrentStatus + "l.");
//        System.out.println("Die Rechnung beträgt " + priceToFill + "€ und wird vom Konto abgebucht." +
//                "Neuer Kontostand: " + driver.account + "€\n");
//    }
//
//    private void loading() {
//        for (int i = 0; i < 5; i++) {
//            System.out.print(".");
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println();
//    }
}

