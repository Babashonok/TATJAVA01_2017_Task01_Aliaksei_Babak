package com.epam.task1;

import java.util.Arrays;

/**
 * Combine two array in one
 */
public class Exercise9 {

    /**
     * Combine two array in one
     * @param array1
     * @param array2
     * @param k breakpoint
     * @return combined array
     */
    private static double [] getJoinedArray(double [] array1, double [] array2, int k) {
        double [] joinedArray = Arrays.copyOf(Arrays.copyOfRange(array1,0,k), array1.length + array2.length);
        System.arraycopy(array2, 0, joinedArray,  k, array2.length);
        System.arraycopy(array1, k, joinedArray, array2.length + k, array1.length - k);
        return joinedArray;
    }

    /**
     * print combine array
     * @param array1
     * @param array2
     * @param k  breakpoint
     */
    public static void printArray(double [] array1, double [] array2, int k) {
        double [] joined = getJoinedArray(array1,array2,k);
        for (double aJoined : joined) {
            System.out.print(aJoined + " ");
        }
    }

}
