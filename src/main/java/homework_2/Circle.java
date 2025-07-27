package homework_2;

public class Circle {
    double radius;

    Circle(double radius1) {
        this.radius = radius1;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    double calculateCircumference() {
        return Math.abs(2 * Math.PI * radius);
    }

}
