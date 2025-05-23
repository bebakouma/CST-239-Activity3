package edu.gcu.topic3_2.test;

import edu.gcu.topic3_2.base.ShapeBase;
import edu.gcu.topic3_2.shape.Rectangle;
import edu.gcu.topic3_2.shape.Triangle;

public class Test {
    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[2];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Triangle(6, 4);

        for (ShapeBase shape : shapes) {
            displayArea(shape);
        }
    }

    private static void displayArea(ShapeBase shape) {
        System.out.println(shape.getName() + " Area: " + shape.calculateArea());
    }
}
