package com.landonhedrick;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int big = bigCount * 5;
        if (big + smallCount < goal) {
            return false;
        }
        return (goal % 5 <= smallCount);
    }
}
