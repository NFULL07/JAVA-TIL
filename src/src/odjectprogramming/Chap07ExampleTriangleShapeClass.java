package odjectprogramming;

public class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double calculateArea() {
        return 0;
    }
}

public class Triangle extends Shape {
    double base;
    double height;

    Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
}

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

public class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
    public class main {
        public static void main(String[] args) {
            Triangle t = new Triangle("삼각형", 5, 3);
            Rectangle r = new Rectangle("사각형", 4, 6);
            Circle c = new Circle("원", 7);

            System.out.println(t.name + " 넓이: " + t.calculateArea());
            System.out.println(r.name + " 넓이: " + r.calculateArea());
            System.out.println(c.name + " 넓이: " + c.calculateArea());
        }
    }

