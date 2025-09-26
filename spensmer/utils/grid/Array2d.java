package spensmer.utils.grid;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BiConsumer;

import spensmer.utils.geometry.Point;

public class Array2d<arrayType> {
    public int width;
    public int height;
    private arrayType[] data;
    /**
     * @param componentType Type to store in the array
     * @param w width of array
     * @param h height of array
     * @param initialValue inital value to fill array
     */
    @SuppressWarnings("unchecked")
    public Array2d(Class<arrayType> componentType, int w, int h, arrayType initialValue) {
        width = w;
        height = h;
        data = (arrayType[]) Array.newInstance(componentType, w * h);
        Arrays.fill(data, initialValue);
    }

    //Gets index of point a
    private int indexOf(Point<Integer> a) {
        // Add a check to prevent ArrayIndexOutOfBoundsException.
        if (a.x < 0 || a.x >= width || a.y < 0 || a.y >= height) {
            throw new IllegalArgumentException("Point coordinates are out of bounds.");
        }
        return a.y * width + a.x;
    }

    //Returns the data at index of point a
    public arrayType getValue(Point<Integer> a) {
        int indexValue = indexOf(a);
        return data[indexValue];
    }

    //Sets the point a to newValue
    public void setValue(Point<Integer> a, arrayType newValue) {
        data[indexOf(a)] = newValue;
    }

    //Print the Array properly
    public void printArray() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(getValue(new Point<Integer>(x, y)) + ", ");
            }
            System.out.println();
        }
    }

    /**
     * @param action the BiConsumer action that you want to perform on the values of the Array
     */
    public void forEach(BiConsumer<Point<Integer>, arrayType> action) {
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            Point<Integer> point = new Point<>(convertIntToT(x), convertIntToT(y));
            arrayType value = getValue(point);
            action.accept(point, value);
        }
    }
}

    // Helper method to convert int to T
    @SuppressWarnings("unchecked")
    private <T extends Number> T convertIntToT(int value) {
        if (data.length == 0) return null;
        if (data[0] instanceof Integer) return (T) Integer.valueOf(value);
        if (data[0] instanceof Double) return (T) Double.valueOf(value);
        if (data[0] instanceof Float) return (T) Float.valueOf(value);
        throw new IllegalArgumentException("Unsupported type for T");
    }

}
