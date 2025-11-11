package spensmer.utils.geometry;

public class Point<type extends Number>
{
    private type x;
    private type y;
    // Constructor
    public Point(type X, type Y) {
        x = X;
        y = Y;
    }

    // Getter/Setter methods for Point
    public type getX() {return x;}
    public type getY() {return y;}
    public void setX(type x) {this.x = x;}
    public void setY(type y) {this.y = y;}

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")"; 
    }

}
