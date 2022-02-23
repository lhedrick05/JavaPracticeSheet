package com.landonhedrick;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (!isBarking) {
            return false;
        } else {
            if(hourOfDay > 23 || hourOfDay < 0) {
                return false;
            }
            return hourOfDay < 8 || hourOfDay > 22;
        }
    }
}
