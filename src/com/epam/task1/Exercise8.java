package com.epam.task1;

/**
 * find sum of the array elements, that divided evenly on number K
 */
public class Exercise8 {

    /**
     *  find sum of the array elements, that divided evenly on number K
     * @param array array of natural numbers
     * @param k divider
     * @return sum
     */
    public static int getSum(int [] array, int k) {
        int sum = 0;
        for (int anArray : array) {
            if (anArray % k == 0) {
                sum += anArray;
            }
        }
        return sum;
    }
}
