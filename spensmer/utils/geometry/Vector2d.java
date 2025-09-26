package spensmer.utils.geometry;

import spensmer.functions.MathUtils;

public class Vector2d<type extends Number> {
    type Magnitude;
    double angle;

    /**
     * @param Magnitude Magnitude of the vector
     * @param theta Angle of the vector in radians (0<=theta<=2pi)
     */
    public Vector2d(type Magnitude, double theta) {
        this.Magnitude = Magnitude;
        this.angle = theta;
    }

    /**
     * @return point in the cartesian plane of the vector
     */

    public Point<Double> pointCartesian() {
        Point<Double> finalPoint = new Point<Double>(Magnitude.doubleValue()*Math.cos(angle),Magnitude.doubleValue()*Math.sin(angle));
        return finalPoint;
    }

    /**
     * @param other the other vector to add
     * @return a new Vector2d<Double> with the added vectorss
     */
    public Vector2d<Double> add(Vector2d<type> other) {
        Point<Double> vector1 = pointCartesian();
        Point<Double> vector2 = other.pointCartesian();
        Point<Double> finalPoint = new Point<Double>(vector1.x + vector2.x,vector1.y + vector2.y);
        Double finalMagnitude = MathUtils.getMagnitudeFromPoint(finalPoint);
        Double finalAngle = MathUtils.getAngleFromPoint(finalPoint);
        return new Vector2d<Double>(finalMagnitude, finalAngle);

    }

    @Override
    public String toString() {
        return "<" + Magnitude " at " + angle + "rad>";
    }
}

