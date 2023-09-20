package com.workintech.oop;

public class Wall {
    double width, height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double newWith) {
        if (newWith < 0) newWith = 0;
        width = newWith;
        return width;
    }

    public double setHeight(double newHeight) {
        if (newHeight < 0) newHeight = 0;
        height = newHeight;
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }


}
