package com.epam.task1;

/**
 * Class contains Static method which allows to count expression:
 * (b + sqrt(b*b + 4ac))/2a -pow(a,3)*c + 1/(b*b)
 */
public class Exercise2 {

    private static String wrongAmountOfVariables = "Please, try to input at least 3 variables.";
    private static String outOfRangeValues = "Try to use smaller values";
    private static String zeroValues = "Zero value in denominator";
    private static String negativeSquareRoot = "Negative value under the square root";

    /**
     * check exception situations
     * @param vars list of using variables
     * @throws Exception - if checking values cant be used in this task
     */
    private static void checkVarsValues(double ... vars) throws Exception {
        if (vars.length < 3) {
            throw new Exception(wrongAmountOfVariables);
        }
        if (Math.abs(vars[0]) < Math.sqrt(Double.MIN_VALUE) || Math.abs(vars[1]) <  Math.sqrt(Double.MIN_VALUE)) {
            throw new Exception(zeroValues);
        }
        if ((Math.pow(vars[1], 2) + 4*vars[0]*vars[2]) < 0) {
            throw new Exception((negativeSquareRoot));
        }
        for (int i = 0 ; i < 3 ;  i++) {
            if (Math.abs(vars[i]) > Math.pow(Double.MAX_VALUE, 0.25)) {
                throw new Exception(outOfRangeValues);
            }
        }
    }
    /**
     *
     * @param vars list of using variables
     * @return answer of the expression
     * @throws Exception if checking values cant be used in this task
     */
    public static double countExp(double ... vars) throws Exception {
        checkVarsValues(vars);
        return (vars[1] + Math.sqrt(Math.pow(vars[1], 2) + 4*vars[0]*vars[2]))/(2*vars[0])
                - Math.pow(vars[0], 3)*vars[2] + Math.pow(vars[1], -2);
    }
}
