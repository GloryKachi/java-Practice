package myOopDesigns;

import java.util.ArrayList;

interface Shape {
    public void draw();
}

 class Square implements Shape{

    @Override
     public void draw() {
        System.out.println("I look like a box");
     }
 }

 class Circle implements Shape{

    @Override
     public void draw() {
        System.out.println("See I am so round");
    }

     public static void main(String[] args) {
        var shapes = new ArrayList<Shape>();

        shapes.add(new Square());
        shapes.add(new Circle());

        shapes.forEach(Shape::draw);
       // shapes.forEach(shape -> shape.draw());
     }
 }


