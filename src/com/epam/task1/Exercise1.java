package com.epam.task1;

/**
 * Class that describes four-digit number and provides to user one method :
 * Print true if sum of first two digits in four-digit number is equal to the sum of last two.
 * False - otherwise
 * Created by Aliaksei_Babak on 1/19/2017.
 */
public class Exercise1 {

    private int value;
    private int digitCount = 4;
    private int minNumberInRange = 1000;
    private int maxNumberInRange = 9999;
    private String errorMessage = "this number is out of operating range";


    public Exercise1(int value) {
        this.value = value;
    }

    private boolean isValueInRange() {
        return (Math.abs(value) >= minNumberInRange && Math.abs(value) <= maxNumberInRange);
    }

    /**
     * find difference as a sum of differences between two digits,
     * that symmetrical according to the center of the number
     * @return true if that difference = 0, false - otherwise
     * @throws Exception if number is out of range
     */
    private boolean checkDigitSumEquality() throws Exception {
        if (!isValueInRange()) {
            throw new Exception(errorMessage);
        }
        int sumDifference = 0;
        for (int i = 0; i <= 1; i++) {
            sumDifference += (int)((value % Math.pow(10, i + 1))/Math.pow(10, i))
                            - (int)((value % Math.pow(10, digitCount - i))/Math.pow(10, digitCount - i - 1));
        }
        return sumDifference == 0;
    }
    public void printResult() throws Exception {
        System.out.println(checkDigitSumEquality());
    }
}
