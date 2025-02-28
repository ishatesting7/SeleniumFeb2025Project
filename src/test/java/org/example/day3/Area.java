package org.example.day3;

interface Square {
    void areaOfSquare();

}
interface Rectange{
    void areaOfRectangle();

}

interface Circle{
    void areaOfCircle();
}

public class Area implements Square, Rectange, Circle
{

    /**
     *
     */
    @Override
    public void areaOfSquare() {

    }

    /**
     *
     */
    @Override
    public void areaOfRectangle() {

    }

    /**
     *
     */
    @Override
    public void areaOfCircle() {

    }
}