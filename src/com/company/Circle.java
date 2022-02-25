package com.company;

public class Circle
{
    private double radius;
    final double PI = 3.14159;

    public void setRadius( double r )
    {
        radius = r;
    }

    public double getArea()
    {
        return PI*radius*radius;
    }
}
