package com.epam.task1;

/**
 * create table ( argument | function value)
 */
public class Exercise7 {

    /**
     * find value of the function :sin^2(arg) - cos(2*arg)
     * @param arg argument value
     * @return function value
     */
    private double findFunctionValue(double arg) {
        return Math.pow(Math.sin(arg), 2) - Math.cos(2*arg);
    }

    /**
     *
     * @param from smallest argument value
     * @param to largest argument value
     * @param step  between two neighbour arguments value
     */
    public void createTable(double from, double to, double step) {
        double arg = from;
        System.out.println("arg    |  func");
        while (arg <= to) {
            createTableRow(arg, findFunctionValue(arg));
            arg += step;
        }
    }

    /**
     * create string representation of one table row
     * @param arg argument value
     * @param func function value
     */
    private void createTableRow(double arg, double func) {
        System.out.println(new StringBuilder().append(String.format("%.3f",arg)).append("  |  ")
                .append(String.format("%.3f",func)));
    }
}
