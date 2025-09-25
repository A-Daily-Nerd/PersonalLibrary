package spensmer.functions;

import spensmer.utils.geometry.Line;
import spensmer.utils.geometry.Point;

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
}