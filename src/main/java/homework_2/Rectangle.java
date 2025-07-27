package homework_2;

public class Rectangle {
    double width;
    double height;

    Rectangle(double width1, double height1) {
        this.width = width1;
        this.height = height1;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    void setWidth(double width2) {
        this.width = width2;
    }

    void setHeight(double height2) {
        this.height = height2;
    }

    void calculateArea() {
        System.out.println(this.width * this.height);
    }
}
