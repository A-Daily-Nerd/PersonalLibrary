package spensmer.functions;

import spensmer.utils.geometry.Line;
import spensmer.utils.geometry.Point;
import spensmer.utils.grid.Array2d;

@SuppressWarnings("unused")
public class MathUtils 
{
    /**
     * @param pointValue endpoint of the vector
     * @return Magnitude value of the vector
     */
    public static Double getMagnitudeFromPoint(Point<Double> pointValue) {
        Line<Double> segment = new Line<Double>(new Point<Double>(0.0,0.0), pointValue);
        Double Magnitude = segment.length();
        return Magnitude;
    }

    /**
     * @param pointValue endpoint of the vector
     * @return Angle of the vector in radians (0<=theta<=2pi)
     */
    public static Double getAngleFromPoint(Point<Double> pointValue) {
        Double finalValue = Math.atan(pointValue.y/pointValue.x);
        return finalValue;
    }

    public static <T extends Number> Array2d<Double> matrixAddition(Array2d<T> a, Array2d<T> b) {
        if ((a.width != b.width) || (a.height != b.height)) {
            throw new ArithmeticException("Matricies have to be the same size");
        }
        a.forEach((point, value) -> {
            // add value from b at the same point
            Double sum = value.doubleValue() + b.getValue(point).doubleValue();
            a.setValue(point, sum); // store the new value back into a
        });
    }
}