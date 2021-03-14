package com.design;

import com.design.entity.enums.VehicleType;

/**
 * This class is used to create a profile of the customer (Parking Lot owner) 
 * to specify the type of the Parking Lot. For e.g. multilevel, multi-floor, 
 * types of vehicle etc.
 * 
 */
public class ParkingProfile {

    /**
     * These properties can be set during application start up.
     */
    public VehicleType vehicleType;
    public boolean isMultilevel;
    public boolean isMultiFloor;
    public boolean isTwoWheelerAllowedIn;
    public boolean slotSize;
    public boolean isOpenParking;
    public static ParkingProfile parkingProfile;
    public Type profileType;


    public static ParkingProfile init(String pathToParkingProfilePropertiesFile) throws Exception {
        /**
         * Read the properties file and initialize 
         * Create a singleton if profile type is SINGLE
         */
        if("Check for multiprofile enabled in propetties file") {
            // Create singleton and set values
            return parkingProfile;
        } else {
            // Allow to create nultiple and set values
            return new ParkingProfile();
        }
    }

    enum Type { SINGLE, MULTI}
    
}