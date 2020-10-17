package org.oop;

public class DistanceAndDirectionCalculator {
    public static double xDifference;
    public static double yDifference;

    public DistanceAndDirectionCalculator(Point start, Point end) {
        setCoordinatesDifference (start, end);
    }

    public void setCoordinatesDifference(Point start, Point end) {
        xDifference = end.getXdifference (start);
        yDifference = end.getYdifference (start);
    }

    public static double distanceOfPoints() {

        return Math.sqrt (square (xDifference) + square (yDifference));
    }

    public static double directionOfPoints() {
        return Math.atan2 (yDifference, xDifference);
    }

    private  double square(double xDifference) {
        return Math.pow (xDifference, 2);
    }


}
