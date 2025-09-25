package spensmer.utils.geometry;

public class Line<type extends Number> {
    Point<type> endPoint1;
    Point<type> endPoint2;

    /**
     * @param endPoint1 Endpoint 1 of line
     * @param endpoint2 Endpoint 2 of line
     */
    public Line(Point<type> endPoint1, Point<type> endpoint2) {
        this.endPoint1 = endPoint1;
        this.endPoint2 = endpoint2;
    }

    public double length() {
        double term1 = Math.pow((endPoint2.x.doubleValue() + endPoint1.x.doubleValue()),2);
        double term2 = Math.pow((endPoint2.y.doubleValue() + endPoint2.y.doubleValue()),2);
        double finalValue = Math.sqrt(term1+term2);
        return finalValue;
    }
}
