package com.company;

public class Driver {
    String driverName;
    int age;
    double account;

    public Driver(String driverName, int age, int account) {
        this.driverName = driverName;
        this.age = age;
        this.account = account;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getAccount() {
        return account;
    }
}
