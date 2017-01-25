package com.epam.task1;

/**
 * Find sum of the smallest and the largest numbers from 3 input number
 */
public class Exercise6 {

    private static String wrongAmountOfVariables = "Please, try to input at least 3 variables.";
    private static String outOfRangeValues = "Try to use smaller values";
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
            if (Math.abs(vars[i]) > Double.MAX_VALUE / 2) {
                throw new Exception(outOfRangeValues);
            }
        }
    }

    /**
     *
     * @param vars list of using variables
     * @return sum of the smallest and the largest numbers
     * @throws Exception if checking values cant be used in this task
     */
    public static double getSum(double ... vars) throws Exception {
        try {
            checkVarsValues(vars);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return Math.max(vars[0], Math.max(vars[1], vars[2])) + Math.min(vars[0], Math.min(vars[1], vars[2]));
    }
}
