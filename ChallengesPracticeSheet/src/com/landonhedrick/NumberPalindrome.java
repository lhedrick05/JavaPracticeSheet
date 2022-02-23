package com.landonhedrick;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int i = number;

        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            i /= 10;
        }

        return reverse == number;
    }
}
