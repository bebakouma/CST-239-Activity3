package edu.gcu.topic3_2.shape;

import edu.gcu.topic3_2.base.ShapeBase;

public class Triangle extends ShapeBase {
    public Triangle(int width, int height) {
        super("Triangle", width, height);
    }

    @Override
    public int calculateArea() {
        return (width * height) / 2;
    }
}
