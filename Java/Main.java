class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.draw();
        square.draw(); 
        triangle.draw(); 
    }
}
