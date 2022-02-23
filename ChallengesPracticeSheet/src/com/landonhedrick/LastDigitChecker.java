package com.landonhedrick;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if(isValid(x) && isValid(y) && isValid(z)) {
            return (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10);
        }
        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
