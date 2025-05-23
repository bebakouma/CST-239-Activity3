package edu.gcu.topic3_2.base;

public class ShapeBase implements ShapeInterface {
    protected int width;
    protected int height;
    protected String name;

    public ShapeBase(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public int calculateArea() {
        return -1; // Placeholder - child classes will override this
    }
}
