package spensmer.utils.geometry;

public class Point<type extends Number>
{
    public type x;
    public type y;
    // Constructor
    public Point(type X, type Y) {
        x = X;
        y = Y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")"; 
    }
}