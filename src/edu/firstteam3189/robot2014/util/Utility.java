/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.util;

/**
 *
 * @author Michael
 */
public class Utility {

    public static double clamp(double value, double min, double max) {
        if (value < min) {
            value = min;
        } else if (value > max) {
            value = max;
        }
        return value;
    }

    /**
     * Get the speed scaled according to distance away
     *
     * @param desiredDistance the distance you want the robot to go
     * @param value distance away from something
     * @param slowdownAt range that power is under 1
     * @param rangeToStop the range that robot stops at
     * @return scaled speed to distance
     */
    public static double getSpeed(double desiredDistance, double value, double slowdownAt, double rangeToStop) {
        value = value - desiredDistance;
        if (range(value, rangeToStop)) {
            return 0;
        }
        return clamp(value / slowdownAt, -1, 1);
    }

    public static boolean inRange(double number, double base, double range) {
        return number > base - range && number < base + range;
    }

    public static boolean proportional(int x1, int x2, int y1, int y2, int xLength, int yLength) {
        int rxLength = x2 - x1;
        int ryLength = y2 - y2;

        return inRange(rxLength / ryLength, xLength / yLength, .2);
    }

    public static boolean range(double value, double max) {
        return Math.abs(value) < Math.abs(max);
    }

    /**
     * If min < max, then checks if value is within that range, if min > max, then checks if its not
     * within that range
     *
     * @param value value of number
     * @param min Minimum
     * @param max Maximum
     * @return
     */
    public static boolean range(double value, double min, double max) {
        return value > min && value < max;
    }
}
