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

    /**
     * @param a First array to add together
     * @param b Second array to add together
     * @return a new Array2d<Double> that is the sum of Arrays a and b
     */
    public static <T extends Number, J extends Number> Array2d<Double> matrixAddition(Array2d<T> a, Array2d<J> b) {
        if ((a.width != b.width) || (a.height != b.height)) {
            throw new ArithmeticException("Matricies have to be the same size");
        }

        Array2d<Double> finalArray2d = new Array2d<>(Double.class, a.width, a.height, 0.0);

        a.forEach((point, value) -> {
            // add value from b at the same point
            Double sum = value.doubleValue() + b.getValue(point).doubleValue();
            finalArray2d.setValue(point, sum); // store the new value back into a
        });
        return finalArray2d;
    }


    public static Point<Integer>[] findNeighbors(Point<Integer> inital) {
        if (((a.x == 0) || (a.y == 0)) || ((a.x == width) || (a.y == height))) { //Edge cases #IMPLIMENT LATER
        }
        Point<Integer>[] returnValues = new Point<Integer>[8];
        returnValues[0] = new Point<Integer>(inital.x-1,inital.y+1);
        returnValues[1] = new Point<Integer>(inital.x,inital.y+1);
        returnValues[2] = new Point<Integer>(inital.x+1,inital.y+1);
        returnValues[3] = new Point<Integer>(inital.x-1,inital.y);
        returnValues[4] = new Point<Integer>(inital.x+1,inital.y);
        returnValues[5] = new Point<Integer>(inital.x-1,inital.y-1);
        returnValues[6] = new Point<Integer>(inital.x,inital.y-1);
        returnValues[7] = new Point<Integer>(inital.x+1,inital.y-1);
        return returnValues;
    }
}