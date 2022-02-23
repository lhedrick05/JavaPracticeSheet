package com.landonhedrick;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[number];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
