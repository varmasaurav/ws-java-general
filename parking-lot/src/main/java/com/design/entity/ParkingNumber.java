package com.design.entity;

/**
 * Chaining of Parking Number to allow automated parking.
 * e.g a robotic implemention will move one by one, first floor then lot, then zone ...
 */

public class ParkingNumber {
    private ParkingFloor floor;
    private ParkingLot lot;
    private ParkingZone zone;
    private ParkingSlot slot;
    private ParkingLevel level;


    public ParkingFloor getParkingLot() { return floor; }

    class ParkingFloor{
        public ParkingLot getParkingLot() { return lot; }
    }

    class ParkingLot{

        public ParkingZone getParkingZone() { return zone; }
    }

    class ParkingZone{
        public ParkingSlot getParkingSlot() { return slot; }
    }
    
    class ParkingSlot{
        public ParkingLevel getParkingLevel() { return level; }
    }
    
    enum ParkingLevel{ UP, DOWN,}
}








