# 📚 spensmer

[![Java](https://img.shields.io/badge/Java-11%2B-blue)]()
[![License](https://img.shields.io/badge/license-MIT-green)]()

A lightweight Java library providing utilities for **2D arrays, grids, points, and numerical operations**.  
It simplifies working with multidimensional data and includes abstractions for iteration, mapping, and math-based transformations.

---

## ✨ Features
- Generic **2D array wrapper** with intuitive methods
- **Point** abstraction with typed coordinates
- **Grid** utilities for elementwise operations
- Easy integration with Java functional interfaces (`BiConsumer`, `Function`, etc.)

---

## Usage
All classes besides Array2d are generics limited to \<T extends Number\>

### Array2d
- Contructor takes (ComponentType, width, height, fillValue) usage looks like:
Array2d<type> a = new Array2d<>(type.class,4,4, null);
- getValue(Point<Integer> a) gets the value of point a in the array returns an arraytype
- setValue(Point<Integer> a, arraytype NewValue) takes a Point a and sets that value to newValue. Is a void method
- forEach(BiConsumer<Point<Integer>, arrayType> action) iterates action over every value in this array
- printArray() prints the array out in 2d form with the values in the array

### Line
- Constructor takes (Point\<T\> a, Point\<type\> b) where a and b are endpoints
- length() returns double with the distance between its endpoints
- String.toString(Line) returns "Line with endpoints: (Point1) (Point2)"

### Point
- Contructor takes (T x, T y)
- Point<T>.x and Point<T>.y are public
- String.toString(Point<T>) returns "(x,y)"

### Vector2d
- Contructor takes (T Magnitude, double theta) where Magnitude and theta depict a point in polar form
- pointCartesian() returns a Point\<Double\> object that has the x any y of the end result of the Vector in the cartesian Plane
- add(Vector2d<type> other) adds the vectors Vector2d and other and returns a new Vector2d<Double>

### spensmer.functions.MathUtils
- getMagnitudeFromPoint(Point<Double> pointValue) returns the hypotenuse of a triangle with sides pointValue.x and pointValue.y
- getAngleFromPoint(Point<Double> pointValue) returns the 

---

## 📦 Installation

Clone the repository and include the `spensmer` package in your project:

```bash
git clone https://github.com/A-Daily-Nerd/PersonalLibrary.git


