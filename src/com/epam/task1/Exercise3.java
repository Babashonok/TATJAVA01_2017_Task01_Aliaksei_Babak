package com.epam.task1;

/**
 * Find perimeter and square of the right triangle
 */
public class Exercise3 {

    private static String outOfRangeValues = "Try to use smaller values";
    private static String invalidSizes = "Try not to input negative or zero sizes";
    private double sizeA;
    private double sizeB;

    public Exercise3(double sizeA, double sizeB) throws Exception {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        checkSidesValues();
    }

    /**
     * check exception situations
     * @throws Exception if checking values cant be used in this task
     */
    private void checkSidesValues() throws Exception {
        if (sizeA < Double.MIN_VALUE || sizeB < Double.MIN_VALUE) {
            throw new Exception(invalidSizes);
        }
        if (sizeA > Math.sqrt(Double.MAX_VALUE) || sizeB > Math.sqrt(Double.MAX_VALUE)) {
            throw new Exception(outOfRangeValues);
        }
    }
    public double countPerimeter() {
        return sizeA + sizeB + Math.sqrt(Math.pow(sizeA, 2) + Math.pow(sizeB, 2));
    }

    public double countSquare() {
        return sizeA * sizeB;
    }


}
