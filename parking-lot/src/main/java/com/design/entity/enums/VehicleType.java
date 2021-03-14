package com.design.entity.enums;

public enum VehicleType {

    FAMILY (SlotSize.SMALL, true), // hatcback, sedan (Low heighted)
    SUV (SlotSize.LARGE, true), // More Height
    HEAVY (SlotSize.FREE, false), // Bus, truck
    TWO_WHEELED (SlotSize.NONE, false); // Bike, scooterette

    private boolean isUpperSlotAllowed;
    private SlotSize slotSize;

    VehicleType(SlotSize s, boolean b) {
        slotSize = s;
        isUpperSlotAllowed = b;
    }

    public SlotSize getCostFactor() { return slotSize; }
    public boolean isUpperSlotAllowed() { return isUpperSlotAllowed; }


}