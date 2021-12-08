package ocp.goodExample;

public interface Shape {

    public double calculateArea();

}

//All shapes now implement the base interface Shape.
// Shape interface has an abstract method calculateArea().
// Both circle & rectangle provide their own overridden implementation of calculateArea() method
// using their own attributes.
// If in future we want to calculate area of other shapes like triangle, square etc.,
// we can implement the Shape interface without changing any class.
