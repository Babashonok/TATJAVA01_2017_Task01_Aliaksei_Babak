package com.epam.task1;

/**
 * check is Point is in the colored area
 */
public class Exercise4 {

    private double x;
    private double y;

    public Exercise4(double x , double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * check is Point is in the rectangle
     * @param topLeftX
     * @param topLeftY
     * @param bottomRightX
     * @param bottomRightY
     * @return true if in the area, else - otherwise
     */
    private boolean isInRectangle(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY) {
        return (x <= bottomRightX && x >= topLeftX && y <= topLeftY && y >= bottomRightY);
    }

    /**
     * check is Point is in the colored area
     * @return true if in the area, else - otherwise
     */
    public boolean isInTheColoredArea() {
        return isInRectangle(-2, 4, 2,0) ||
                isInRectangle(-4, 0,4,-3);
    }

}
