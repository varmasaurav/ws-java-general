package com.design.entity.enums;

public enum SlotSize {
    SMALL(4), LARGE(6), NONE(1), FREE(8);

    int costFactor;

    SlotSize(int cf) {
        costFactor = cf;
    }

    public int getCostFactor() { return costFactor; }
}