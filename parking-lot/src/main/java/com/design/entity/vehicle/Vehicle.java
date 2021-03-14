package com.design.entity.vehicle;

import com.design.entity.enums.VehicleType;

public abstract class Vehicle {

    String registrationNumber;
    VehicleType vehicleType;

    public String getRegistrationNumber() { return registrationNumber; }
    public VehicleType getVehicleType() { return vehicleType; }
    // public void setRegistrationNumber(String registrationNumber,VehicleType vehicleType) {}

    public Vehicle(String registrationNumber,VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }
    
}