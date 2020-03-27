package com.company;

public class GasStation {
    double gasolinePrice;
    String gasStationName;

    public GasStation(String gasStationName, double gasolinePrice) {
        this.gasStationName = gasStationName;
        this.gasolinePrice = gasolinePrice;
    }

    public void goRefuel(Driver driver, Car car) {
        double priceToFill;
        System.out.println("Guten Tag in ihrer Tankstelle");
        System.out.println("Sie haben noch " + car.fuelCurrentStatus + "l im Tank");
        priceToFill = car.fuelMax - car.fuelCurrentStatus;
        priceToFill = priceToFill * gasolinePrice;
        car.fuelCurrentStatus = car.fuelMax;
        driver.account = driver.account - priceToFill;
        loading();
        System.out.println("Der Tank ist voll mit " + car.fuelCurrentStatus + "l.");
        System.out.println("Die Rechnung beträgt " + priceToFill + "€ und wird vom Konto abgebucht." +
                "Neuer Kontostand: " + driver.account + "€\n");
    }

    private void loading() {
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
