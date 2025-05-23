package edu.gcu.topic3_2.shape;

import edu.gcu.topic3_2.base.ShapeBase;

public class Rectangle extends ShapeBase {
    public Rectangle(int width, int height) {
        super("Rectangle", width, height);
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}
