package com.company;

import java.util.Random;

public class Car extends Vehicle {
    CarBrand brand;
    String model;
    int horsePower;
    int mileage;
    int service;
    int fuelMax;
    int fuelCurrentStatus;
    int fuelConsumption;
    int dirtDegree = 0;


    public Car(VehicleType VehicleType, CarBrand CarBrand, String model, int horsePower, int mileage, int service, int fuelMax,
               int fuelCurrentStatus, int fuelConsumption, int dirtDegree) {
        super(VehicleType);
        this.brand = CarBrand;
        this.model = model;
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.service = service;
        this.fuelMax = fuelMax;
        this.fuelCurrentStatus = fuelCurrentStatus;
        this.fuelConsumption = fuelConsumption;
        this.dirtDegree = dirtDegree;
    }

    public void driveWithTheCar(int drivenMiles) {
        this.fuelCurrentStatus = fuelCurrentStatus - (drivenMiles * fuelConsumption / 100);
        if (fuelCurrentStatus <= 0) {
            System.out.println("Sie können keine so große Strecke mit einer Tankfüllung fahren");
        } else {
            this.mileage = mileage + drivenMiles;

            Random rand = new Random();
            int pollution = rand.nextInt(10);
            this.dirtDegree = dirtDegree + pollution;
            if (dirtDegree >= 15) {
                System.out.println("Sie könnten Ihr Auto wieder mal putzen!");
            }

            if (mileage >= service) {
                System.out.println("Der Service ist bei dem Auto -> " + brand + " <- ist bei " + service + "km fällig!\nSie haben "
                        + mileage + "km, bitte einen Termin in der Werkstatt vereinbaren!");
            }
            if (fuelCurrentStatus <= fuelMax / 10) {
                System.out.println("Bitte tanken");
            } else {
                System.out.println("Gute fahrt\n");
            }
        }
    }

    public void carStatus(Car car) {
        System.out.println("Auto Typ:\t\t" + vehicleType + "\n" + "Marke\t\t\t" + car.brand + "\n" + "Modell\t\t\t" + car.model + "\n" + "PS\t\t\t\t" + car.horsePower + "\n" +
                "Kilommeter\t\t" + car.mileage + "\n" + "Tank\t\t\t" + car.fuelCurrentStatus + "l\nVerschmutzung\t" + car.dirtDegree + " grad" + "\n");
    }

    public Enum getBrand() {
        return brand;
    }

    public int getDirtDegree() {
        return dirtDegree;
    }
}