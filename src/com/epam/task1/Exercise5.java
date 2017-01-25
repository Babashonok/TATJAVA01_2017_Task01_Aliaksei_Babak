package com.epam.task1;

/**
 * Pow(x, 2) if x >= 0
 * Pow(x, 4) otherwise
 */
public class Exercise5 {

    private static String wrongAmountOfVariables = "Please, try to input at least 3 variables.";
    private static String outOfRangeValues = "Try to use smaller values";

    /**
     * involute number according it start value
     * @param number under operation
     * @return value after operation
     */
    private static double involuteNumber(double number){
        if (number > Double.MIN_VALUE ) {
            return Math.pow(number, 2);
        }
        return Math.pow(number, 4);
    }

    /**
     * check exception situations
     * @param vars list of using variables
     * @throws Exception - if checking values cant be used in this task
     */
    private static void checkVarsValues(double ... vars) throws Exception {
        if (vars.length < 3) {
            throw new Exception(wrongAmountOfVariables);
        }
        for (int i = 0 ; i < 3 ;  i++) {
            if (Math.abs(vars[i]) > Math.pow(Double.MAX_VALUE, 0.25)) {
                throw new Exception(outOfRangeValues);
            }
        }
    }

    /**
     *
     * @param vars  list of using variables
     * @return string representation of numbers after operation
     * @throws Exception if checking values cant be used in this task
     */
    public static StringBuilder getResultNumbers(double ... vars) throws Exception  {
        checkVarsValues(vars);
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < 3 ;  i++) {
            result.append(involuteNumber(vars[i])).append(" ");
        }
        return result;
    }


}
