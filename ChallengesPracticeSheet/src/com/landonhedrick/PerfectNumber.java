package com.landonhedrick;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number > 1) {
            int factor = 1;
            int sum = 0;
            while (factor < number) {
                if (number % factor == 0) {
                    sum += factor;
                }
                factor++;
            }
            return sum == number;
        }
        return false;
    }
}
