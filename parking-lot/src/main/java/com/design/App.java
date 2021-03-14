package com.design;

import com.design.entity.enums.VehicleType;
import com.design.entity.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Initializing the parking lot application");

        try {
            ParkingProfile profile = ParkingProfile.init("Path to properties file");
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }


        // Run a thread to keep watching for a signal to allot a parking

        // When a vehicle enters

        String registrationNumber = "KO 56 G 79879";
        VehicleType vehicleType = VehicleType.SUV;

        Vehicle vehicle = new Vehicle(registrationNumber, vehicleType) {};

        String parkingNumber = Parking.allot(vehicle);

    }
}
