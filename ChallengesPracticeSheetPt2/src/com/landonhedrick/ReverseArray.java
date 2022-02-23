package com.landonhedrick;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] intArray) {
        System.out.println("Array = " + Arrays.toString(intArray));
        int maxIndex = intArray.length - 1;
        int halfLength = intArray.length / 2;

        for(int i = 0; i < halfLength; i+=1) {
            int temp = intArray[i];
            intArray[i] = intArray[maxIndex - i];
            intArray[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(intArray));
    }
}
