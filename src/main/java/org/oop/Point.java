package org.oop;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        setX (x);
        setY (y);
    }
    public double getX() {
        return this.x;
    }
    public double getY() { return this.y;}

    private void setY(double y) {
        this.y = y;
    }
    private void setX(double x) {
        this.x = x;
    }

    public double getXdifference(Point start)
    {
        return this.getX ( ) - start.getX ( );
    }
    public double getYdifference(Point start)
    {
        return this.getY ( ) - start.getY ( );
    }
}
